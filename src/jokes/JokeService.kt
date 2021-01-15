package dev.pott.jokes

import dev.pott.jokes.dto.JokeV1Dto
import kotlin.random.Random

class JokeService {

    fun getRandomJoke(): JokeV1Dto {
        val jokes = listOf(
            JokeV1Dto("Was macht ein Clown im Büro? - Faxen."),
            JokeV1Dto("Was ist braun, knusprig und schwimmt Unterwasser. - Ein Ubrot"),
            JokeV1Dto("Mann zum Kellner: Ich hätte gerne 3 Eier. Kellner: Ich auch."),
            JokeV1Dto("Einem Mann fällt sein Smartphone runter. Dem Gerät ist kein Schaden entstanden. Wie ist das möglich? - Es war im Flugmodus. "),
            JokeV1Dto("Was liegt auf dem Grund des Ozeans und zittert? - Ein nervöses Wrack!"),
            JokeV1Dto("Unterhalten sich zwei Furze. Sagt der eine zum anderen: „Du stinkst.“ Sagt der andere: „Du aber auch“"),
            JokeV1Dto("Wo findet man viele Kühe? In einem Muuuuseum."),
        )

        val randomIndex = Random.nextInt(0, jokes.size)

        return jokes[randomIndex]
    }

}