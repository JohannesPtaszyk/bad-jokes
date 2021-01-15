package dev.pott.jokes.dto

import kotlinx.serialization.Serializable

@Serializable
data class JokeV1Dto(val text: String)