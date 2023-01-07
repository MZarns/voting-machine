package votingMachine

class Ballot {
    private var preferences: IntArray

    companion object {
        fun ballotFromString(ballotString: String) : Ballot {
            val preferences: IntArray = ballotString.split(",").map{it.toInt()}.toIntArray()
            return Ballot(preferences)
        }
    }

    constructor(preferencesArray: IntArray) {
        preferences = preferencesArray
        this.preferences = preferencesArray
    }
    constructor(preferencesString: String) {
        val strings = preferencesString.split(",")
        val numCandidates = strings.size
        val preferencesArray: IntArray = IntArray(numCandidates)

        for (i in 0 until numCandidates) {
            preferencesArray[i] = strings[i].toInt()
        }
        this.preferences = preferencesArray
    }
    override fun toString(): String {
        return preferences.contentToString()
    }
    fun preference(): IntArray {
        return this.preferences
    }

    fun preferenceString(): String {
        return preferences.joinToString { "," }
    }
}