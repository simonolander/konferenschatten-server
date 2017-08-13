/*
 * This file is generated by jOOQ.
*/
package se.olander.konferenschatten.jooq.konferenschatten.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;

import se.olander.konferenschatten.jooq.konferenschatten.tables.Message;
import se.olander.konferenschatten.jooq.konferenschatten.tables.records.MessageRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MessageDao extends DAOImpl<MessageRecord, se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message, Integer> {

    /**
     * Create a new MessageDao without any configuration
     */
    public MessageDao() {
        super(Message.MESSAGE, se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message.class);
    }

    /**
     * Create a new MessageDao with an attached configuration
     */
    public MessageDao(Configuration configuration) {
        super(Message.MESSAGE, se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message> fetchById(Integer... values) {
        return fetch(Message.MESSAGE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message fetchOneById(Integer value) {
        return fetchOne(Message.MESSAGE.ID, value);
    }

    /**
     * Fetch records that have <code>timestamp IN (values)</code>
     */
    public List<se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message> fetchByTimestamp(Timestamp... values) {
        return fetch(Message.MESSAGE.TIMESTAMP, values);
    }

    /**
     * Fetch records that have <code>username IN (values)</code>
     */
    public List<se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message> fetchByUsername(String... values) {
        return fetch(Message.MESSAGE.USERNAME, values);
    }

    /**
     * Fetch records that have <code>text IN (values)</code>
     */
    public List<se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message> fetchByText(String... values) {
        return fetch(Message.MESSAGE.TEXT, values);
    }

    /**
     * Fetch records that have <code>image_url IN (values)</code>
     */
    public List<se.olander.konferenschatten.jooq.konferenschatten.tables.pojos.Message> fetchByImageUrl(String... values) {
        return fetch(Message.MESSAGE.IMAGE_URL, values);
    }
}
