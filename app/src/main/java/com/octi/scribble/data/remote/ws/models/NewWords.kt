package com.octi.scribble.data.remote.ws.models

import com.octi.scribble.util.Constants.TYPE_NEW_WORDS

data class NewWords(
    val newWords: List<String>
): BaseModel(TYPE_NEW_WORDS)
