package votingMachine

class ElectionIRV() {
    companion object {
        fun runElection(filepath: String): Boolean {
            val fileReader = BallotFileReader()
            val electionData: ElectionDTO = fileReader.readFile(filepath)

            // Print out election data
            println("=== ${electionData.electionType} Election ===")
            println("==== Candidates ====")
            electionData.candidateList.forEach { println("> $it") }
            println("==== Ballots ====")
            electionData.ballotList.forEach { println(">  $it") }
            return true
        }
    }
}