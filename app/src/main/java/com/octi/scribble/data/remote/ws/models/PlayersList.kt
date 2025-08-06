package com.octi.scribble.data.remote.ws.models

import com.octi.scribble.util.Constants.TYPE_PLAYERS_LIST

data class PlayersList(
    val players: List<PlayerData>
): BaseModel(TYPE_PLAYERS_LIST)
