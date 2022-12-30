package votingMachine

import java.io.BufferedReader
import java.io.File
import java.io.InputStream

class BallotFileReader {
    fun readFile(ballotFile: String): ElectionDTO {
        val inputStream: InputStream = File(ballotFile).inputStream()
        val reader: BufferedReader = inputStream.bufferedReader()

        // Read Headers
        val electionType: String = reader.readLine()
        val numAvailableSeats: Int = reader.readLine().toInt()
        val candidateList: ArrayList<Candidate> = Candidate.parseCandidateLine(reader.readLine())
        val ballotList: ArrayList<Ballot> = ArrayList()

        reader.useLines { lines -> lines.forEach { ballotList.add(Ballot.ballotFromString(it))} }

        return ElectionDTO(
            electionType,
            numAvailableSeats,
            candidateList,
            ballotList
        )
    }
}
data class ElectionDTO (
    val electionType: String,
    val numAvailableSeats: Int,
    val candidateList: ArrayList<Candidate>,
    val ballotList: ArrayList<Ballot> = ArrayList()
)