package com.octi.scribble.data.remote.ws.models

import com.octi.scribble.data.remote.ws.Room
import com.octi.scribble.util.Constants.TYPE_PHASE_CHANGE

data class PhaseChange(
        var phase: Room.Phase?,
        var time: Long,
        val drawingPlayer: String? = null
) : BaseModel(TYPE_PHASE_CHANGE)
