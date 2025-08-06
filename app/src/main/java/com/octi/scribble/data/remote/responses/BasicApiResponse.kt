package com.octi.scribble.data.remote.responses

data class BasicApiResponse(
    val successful: Boolean,
    val message: String? = null
)
