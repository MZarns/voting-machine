package votingMachine

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class MainApplication

fun main(args: Array<String>) {
    val filepath = "ballotFiles/ballotFile3.csv"
    val electionObject = ElectionIRV(filepath)
    if (electionObject.runElection()) {
        println("== Algorithm Complete ==")
    }
}
