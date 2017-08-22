package se.olander.konferenschatten.rest

import java.io.Serializable

class CreateMetaDto(val username: String? = null, val data: MutableMap<String, Any?>? = null) : Serializable
