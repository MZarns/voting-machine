package votingMachine

class Candidate (
    private val name: String,
    private val party: String = "I",
    private var ballots: ArrayList<Ballot> = ArrayList<Ballot>(),
    private var victorious: Boolean = false
    ) {
    companion object {
        fun parseCandidateLine(candidateLine: String): List<Candidate> {
            return candidateLine.split(",").map { candidateFromString(it) }.distinct()
        }
        private fun candidateFromString(candidateString: String) : Candidate {
            val temp = candidateString.split("(",")")
            val name: String = temp[0]
            if (temp.size > 1) {
                val party = temp[1]
                return Candidate(name, party)
            }
            return Candidate(name)
        }
    }
    override fun toString(): String {
        return "$name ($party)"
    }
}