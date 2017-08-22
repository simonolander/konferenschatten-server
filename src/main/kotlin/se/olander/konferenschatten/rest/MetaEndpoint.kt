package se.olander.konferenschatten.rest

import com.fasterxml.jackson.databind.ObjectMapper
import org.jooq.DSLContext
import org.jooq.Record
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import se.olander.konferenschatten.jooq.konferenschatten.Tables
import se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Meta
import se.olander.konferenschatten.jooq.konferenschatten.tables.records.MetaRecord

@CrossOrigin
@RestController
@RequestMapping("/rest/meta")
class MetaEndpoint (@Autowired val dslContext: DSLContext) {

    @PostMapping
    fun postMeta(@RequestBody meta: CreateMetaDto): Meta {
        val record = MetaRecord()
        record.username = meta.username
        record.data = meta.data

        val answer = dslContext.insertInto(Tables.META)
                .set(record)
                .returning()
                .fetchOne()
                .map { metaMapper(it) }

        return answer
    }

    @GetMapping
    fun getMetas(id: Int?): List<Meta> {
        return if (id == null) {
            dslContext.selectFrom(Tables.META)
                    .orderBy(Tables.META.TIMESTAMP)
                    .fetch(this::metaMapper)
        }
        else {
            dslContext.selectFrom(Tables.META)
                    .where(Tables.META.ID.gt(id))
                    .orderBy(Tables.META.TIMESTAMP)
                    .fetch(this::metaMapper)
        }
    }

    fun metaMapper(record: Record): Meta {
        return record.let { it.into(MetaRecord::class.java) }
                .let {
                    Meta(
                            it.id,
                            it.timestamp,
                            it.username,
                            ObjectMapper().readValue(it.data as String?, Map::class.java)
                    )
                }
    }
}
