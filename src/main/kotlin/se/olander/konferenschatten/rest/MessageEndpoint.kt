package se.olander.konferenschatten.rest

import com.fasterxml.jackson.databind.ObjectMapper
import org.jooq.DSLContext
import org.jooq.Record
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import se.olander.konferenschatten.jooq.konferenschatten.Tables
import se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message
import se.olander.konferenschatten.jooq.konferenschatten.tables.records.MessageRecord

@CrossOrigin
@RestController
@RequestMapping("/rest/messages")
class MessageEndpoint (@Autowired val dslContext: DSLContext) {

    @PostMapping
    fun postMessage(@RequestBody message: CreateMessageDto): Message {
        val record = MessageRecord()
        record.username = message.username
        record.text = message.text
        record.imageUrl = message.imageUrl
        record.extra = ObjectMapper().writeValueAsString(message.extra)

        val answer = dslContext.insertInto(Tables.MESSAGE)
                .set(record)
                .returning()
                .fetchOne()
                .map { messageMapper(it) }

        return answer
    }

    @GetMapping
    fun getMessages(id: Int?): List<Message> {
        return if (id == null) {
            dslContext.selectFrom(Tables.MESSAGE)
                    .orderBy(Tables.MESSAGE.TIMESTAMP)
                    .fetch(this::messageMapper)
        }
        else {
            dslContext.selectFrom(Tables.MESSAGE)
                    .where(Tables.MESSAGE.ID.gt(id))
                    .orderBy(Tables.MESSAGE.TIMESTAMP)
                    .fetch(this::messageMapper)
        }
    }

    fun messageMapper(record: Record): Message {
        return record.let { it.into(MessageRecord::class.java) }
                .let {
                    Message(
                            it.id,
                            it.timestamp,
                            it.username,
                            it.text,
                            it.imageUrl,
                            ObjectMapper().readValue(it.extra as String?, Map::class.java)
                    )
                }
    }
}
