package se.olander.konferenschatten.rest

import java.io.Serializable

class CreateMessageDto(val text: String? = null, val username: String? = null, val imageUrl: String? = null, val data: MutableMap<String, Any?>? = null) : Serializable
