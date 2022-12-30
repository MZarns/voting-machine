package votingMachine

import java.io.File
import java.io.IOException

class ElectionIRV(private val filepath: String) {
    private var candidateList: ArrayList<Candidate> = ArrayList()
    private var ballotList: ArrayList<Ballot> = ArrayList()
    private var winnerList: ArrayList<Candidate> = ArrayList()
    private var remainingBallots: Int = 0

    fun runElection(): Boolean {
        val fileReader = BallotFileReader()
        val electionData: ElectionDTO = fileReader.readFile(filepath)
        val totalAvailableSeats: Int = electionData.numAvailableSeats
        var remainingSeats: Int = totalAvailableSeats
        candidateList = electionData.candidateList
        ballotList = electionData.ballotList

        remainingBallots = ballotList.size
        val remainingCandidates = ArrayList<Candidate>(candidateList)

        // Print out election data
        var outputValues = ArrayList<String>()
        var currStr: String = "=== ${electionData.electionType} Election ==="
        println(currStr)
        outputValues.add(currStr)

        currStr = "==== Candidates ===="
        println(currStr)
        outputValues.add(currStr)

        candidateList.forEach {
            currStr = "> $it"
            println(currStr)
            outputValues.add(currStr)
        }
        currStr = "==== Ballots ===="
        println(currStr)
        outputValues.add(currStr)

        ballotList.forEach { currStr = "> $it"
            println(currStr)
            outputValues.add(currStr)
        }

        // Shuffle Ballots
        electionData.ballotList.shuffle()

        // First Pass; distribute all ballots to first choice
        ballotList.forEach { candidateList[it.preference().indexOf(1)].ballots.add(it) }

        // Set IRV quota
        var currentQuota: Long = 1 + (remainingBallots.toLong() / (1 + remainingSeats))

        val removeTheseCandidates = ArrayList<Candidate>()
        candidateList.forEach {
            if (it.ballots.size >= currentQuota) {
                winnerList.add(it)
                remainingSeats --
                removeTheseCandidates.add(it)
            }
        }
        while (removeTheseCandidates.isNotEmpty()) {
            remainingCandidates.remove(removeTheseCandidates[0])
            removeTheseCandidates.removeAt(0)
        }

        // Print first pass results
        currStr = "==== First Pass Results ===="
        println(currStr)
        outputValues.add(currStr)

        currStr = "Current Quota: $currentQuota"
        println(currStr)
        outputValues.add(currStr)

        candidateList.forEach {
            currStr = "> $it: ${it.ballots.size}"
            println(currStr)
            outputValues.add(currStr)
        }

        // Redistribute excess votes not needed to reach quota from first pass
        for (winner in winnerList) {
            val surplusBallots = (winner.ballots.size - currentQuota).toInt()
            for (i in 0 until surplusBallots) {
                redistributeBallot(winner.ballots[0], winner)
            }
            remainingBallots -= winner.ballots.size
        }

        // Loop until all winners are declared or until remaining candidates are deemed losers
        var passCount: Int = 1
        val loserCandidates = ArrayList<Candidate>()
        while (remainingSeats > 0 && remainingCandidates.isNotEmpty()) {
            passCount++
            // Recalculate quota
            currentQuota = 1 + (remainingBallots.toLong() / (1 + remainingSeats))

            // Declare Loser
            var minimumVoteCount: Int = remainingCandidates[0].ballots.size
            var currLoserIdx: Int = 0
            for (i in 0 until remainingCandidates.size) {
                if (remainingCandidates[i].ballots.size < minimumVoteCount) {
                    minimumVoteCount = remainingCandidates[i].ballots.size
                    currLoserIdx = i
                }
            }

            // Remove Loser and redistribute their votes
            val loser = remainingCandidates[currLoserIdx]
            loserCandidates.add(loser)
            remainingCandidates.removeAt(currLoserIdx)

            for (i in 0 until loser.ballots.size) {
                redistributeBallot(loser.ballots[0], loser)
            }

            // Check for winner
            for (candidate in remainingCandidates) {
                if (candidate.ballots.size >= currentQuota) {
                    winnerList.add(candidate)
                    remainingSeats --
                    remainingBallots -= candidate.ballots.size
                    removeTheseCandidates.add(candidate)
                    if (remainingSeats == 0) {
                        break
                    }
                }
            }
            // Remove winners
            while (removeTheseCandidates.isNotEmpty()) {
                remainingCandidates.remove(removeTheseCandidates[0])
                removeTheseCandidates.removeAt(0)
            }

            break
        }

        // Declare remaining winners even if quota is not met
        for (i in 0 until remainingSeats) {
            winnerList.add(loserCandidates[loserCandidates.size - 1])
            remainingSeats --
        }
            currStr = "==== Winners ===="
            println(currStr)
            outputValues.add(currStr)

        winnerList.forEach {
            currStr = "> $it: ${it.ballots.size}"
            println(currStr)
            outputValues.add(currStr)
        }

        // Write to output.csv file
        val outputFilename = "outputFiles/".plus(filepath
                .removePrefix("ballotFiles/")
                .removeSuffix(".txt").plus("Output").plus(".csv")
        )
        writeAsCSV(outputValues, outputFilename)

        return true
    }

    private fun redistributeBallot(ballot: Ballot, currCandidate: Candidate) {
        val currCandidateIdx = candidateList.indexOf(currCandidate)
        val currCandidateRank = ballot.preference()[currCandidateIdx]
        val newIndex = ballot.preference().indexOf(currCandidateRank + 1)
        if (newIndex != -1) {
            candidateList[newIndex].ballots.add(ballot)
        }
        remainingBallots -= 1
     }

    @Throws(IOException::class)
    private fun writeAsCSV(values: ArrayList<String>, outputFilename: String) {
        val csv = values.joinToString("\n")
        File(outputFilename).writeText(csv)
    }
}