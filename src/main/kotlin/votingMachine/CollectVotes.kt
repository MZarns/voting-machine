package votingMachine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CollectVotes

fun main(args: Array<String>) {
    runApplication<CollectVotes>(*args)
}
