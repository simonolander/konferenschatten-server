/*
 * This file is generated by jOOQ.
*/
package se.olander.konferenschatten.jooq.konferenschatten.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class Message implements Serializable {

    private static final long serialVersionUID = -111108606;

    private Integer   id;
    private Timestamp timestamp;
    private String    username;
    private String    text;
    private String    imageUrl;
    private Object    data;

    public Message() {}

    public Message(Message value) {
        this.id = value.id;
        this.timestamp = value.timestamp;
        this.username = value.username;
        this.text = value.text;
        this.imageUrl = value.imageUrl;
        this.data = value.data;
    }

    public Message(
        Integer   id,
        Timestamp timestamp,
        String    username,
        String    text,
        String    imageUrl,
        Object    data
    ) {
        this.id = id;
        this.timestamp = timestamp;
        this.username = username;
        this.text = text;
        this.imageUrl = imageUrl;
        this.data = data;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Message (");

        sb.append(id);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(username);
        sb.append(", ").append(text);
        sb.append(", ").append(imageUrl);
        sb.append(", ").append(data);

        sb.append(")");
        return sb.toString();
    }
}
