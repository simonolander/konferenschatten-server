/*
 * This file is generated by jOOQ.
*/
package se.olander.konferenschatten.jooq.konferenschatten.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import se.olander.konferenschatten.jooq.konferenschatten.tables.Message;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MessageRecord extends UpdatableRecordImpl<MessageRecord> implements Record6<Integer, Timestamp, String, String, String, Object> {

    private static final long serialVersionUID = -2005896948;

    /**
     * Setter for <code>konferenschatten.message.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>konferenschatten.message.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>konferenschatten.message.timestamp</code>.
     */
    public void setTimestamp(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>konferenschatten.message.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>konferenschatten.message.username</code>.
     */
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>konferenschatten.message.username</code>.
     */
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>konferenschatten.message.text</code>.
     */
    public void setText(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>konferenschatten.message.text</code>.
     */
    public String getText() {
        return (String) get(3);
    }

    /**
     * Setter for <code>konferenschatten.message.image_url</code>.
     */
    public void setImageUrl(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>konferenschatten.message.image_url</code>.
     */
    public String getImageUrl() {
        return (String) get(4);
    }

    /**
     * Setter for <code>konferenschatten.message.extra</code>.
     */
    public void setExtra(Object value) {
        set(5, value);
    }

    /**
     * Getter for <code>konferenschatten.message.extra</code>.
     */
    public Object getExtra() {
        return (Object) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Timestamp, String, String, String, Object> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Timestamp, String, String, String, Object> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Message.MESSAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return Message.MESSAGE.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Message.MESSAGE.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Message.MESSAGE.TEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Message.MESSAGE.IMAGE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object> field6() {
        return Message.MESSAGE.EXTRA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getText();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getImageUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object value6() {
        return getExtra();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value2(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value3(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value4(String value) {
        setText(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value5(String value) {
        setImageUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord value6(Object value) {
        setExtra(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessageRecord values(Integer value1, Timestamp value2, String value3, String value4, String value5, Object value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MessageRecord
     */
    public MessageRecord() {
        super(Message.MESSAGE);
    }

    /**
     * Create a detached, initialised MessageRecord
     */
    public MessageRecord(Integer id, Timestamp timestamp, String username, String text, String imageUrl, Object extra) {
        super(Message.MESSAGE);

        set(0, id);
        set(1, timestamp);
        set(2, username);
        set(3, text);
        set(4, imageUrl);
        set(5, extra);
    }
}