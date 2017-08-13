package se.olander.konferenschatten.rest

import com.fasterxml.jackson.databind.ObjectMapper
import org.jooq.DSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import se.olander.konferenschatten.jooq.Tables
import se.olander.konferenschatten.jooq.tables.pojos.Message
import se.olander.konferenschatten.jooq.tables.records.MessageRecord

@CrossOrigin
@RestController("/rest/messages")
class MessageEndpoint (@Autowired val dslContext: DSLContext) {

    @PostMapping("")
    fun postMessage(@RequestBody message: Message): Message {
        val mapper = ObjectMapper()
        val record = MessageRecord()
        record.username = message.username
        record.text = message.text
        record.imageUrl = message.imageUrl
        record.extra = mapper.writeValueAsString(message.extra)

        val answer = dslContext.insertInto(Tables.MESSAGE)
                .set(record)
                .returning()
                .fetchOne()
                .into(Message::class.java)

        return answer
    }

    @GetMapping("")
    fun getMessages(id: Int?): List<Message> {
        return if (id == null) {
            dslContext.selectFrom(Tables.MESSAGE)
                    .orderBy(Tables.MESSAGE.TIMESTAMP)
                    .fetchInto(Message::class.java)
        }
        else {
            dslContext.selectFrom(Tables.MESSAGE)
                    .where(Tables.MESSAGE.ID.gt(id))
                    .orderBy(Tables.MESSAGE.TIMESTAMP)
                    .fetchInto(Message::class.java)
        }
    }
}
