package votingMachine

class Candidate (
    private val name: String,
    private val party: String = "I",
    var ballots: ArrayList<Ballot> = ArrayList<Ballot>(),
    var victorious: Boolean = false
    ) {
    companion object {
        fun parseCandidateLine(candidateLine: String): ArrayList<Candidate> {
            val list = candidateLine.split(",").map { candidateFromString(it) }.distinct()
            return ArrayList<Candidate>(list)
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