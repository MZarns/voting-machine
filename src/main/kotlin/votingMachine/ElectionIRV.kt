package votingMachine

import java.util.Arrays

class ElectionIRV {
    private var candidateList: ArrayList<Candidate> = ArrayList()
    private var ballotList: ArrayList<Ballot> = ArrayList()
    private var winnerList: ArrayList<Candidate> = ArrayList()
    private var remainingBallots: Int = 0

    fun runElection(filepath: String): Boolean {
        val fileReader = BallotFileReader()
        val electionData: ElectionDTO = fileReader.readFile(filepath)
        val totalAvailableSeats: Int = electionData.numAvailableSeats
        var remainingSeats: Int = totalAvailableSeats
        candidateList = electionData.candidateList
        ballotList = electionData.ballotList

        remainingBallots = ballotList.size
        val remainingCandidates = ArrayList<Candidate>(candidateList)

        // Print out election data
        println("=== ${electionData.electionType} Election ===")
        println("==== Candidates ====")
        candidateList.forEach { println("> $it") }
        println("==== Ballots ====")
        ballotList.forEach { println("> $it") }

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
        println("==== First Pass Results ====")
        println("Current Quota: $currentQuota")
        candidateList.forEach {
            println("> $it: ${it.ballots.size}")
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

            println("==== Winners ====")
        winnerList.forEach { println("> $it: ${it.ballots.size}") }

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
}