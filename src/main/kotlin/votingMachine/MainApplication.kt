package votingMachine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MainApplication

fun main(args: Array<String>) {
    val filepath = "ballotFiles/ballotFile3.txt"
    if (ElectionIRV().runElection(filepath))
        println("== Election Complete ==")
//    runApplication<MainApplication>(*args)
}
