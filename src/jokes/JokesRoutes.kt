package dev.pott.jokes

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.jokesRouting() {
    route("/joke") {
        route("/german") {
            get {
                val randomJoke = JokeService().getRandomJoke()
                call.respond(randomJoke)
            }
        }
    }
}