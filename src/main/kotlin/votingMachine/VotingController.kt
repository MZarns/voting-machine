package votingMachine

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.stereotype.Controller
import org.springframework.web.util.HtmlUtils
import java.io.File

@Controller
class VotingController {
    var candidateList: ArrayList<Candidate>
    val filename = "votingFile.csv"

    constructor() {
        val fileReader = BallotFileReader()
        val electionData: ElectionDTO = fileReader.readFile(filename)
        val totalAvailableSeats: Int = electionData.numAvailableSeats
        candidateList = electionData.candidateList
    }
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    fun greeting(message: Ballot): Message {
        Thread.sleep(100)
        val preferenceString = message.preferenceString()
        val newBallot = HtmlUtils.htmlEscape(preferenceString)

        val writeSuccessful: Boolean = false
        File(filename).appendText("\n"+preferenceString)
        return Message("Vote cast successfully: $preferenceString")
    }

    @MessageMapping("/message")
    @SendTo("/topic/greetings")
    fun sendMessage(message: Message): Message {
        Thread.sleep(100)
        return Message(HtmlUtils.htmlEscape(message.getMessage()))
    }
}