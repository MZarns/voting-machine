package votingMachine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MainApplication

fun main(args: Array<String>) {
    val filepath = "ballotFiles/ballotFile3.txt"
    val electionObject = ElectionIRV(filepath)
    if (electionObject.runElection()) {
        println("== Algorithm Complete ==")
    }
}
