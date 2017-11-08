package com.android.minht.realtimechat;

import java.util.Date;

/**
 * Created by minht on 11/8/2017.
 */

public class Message {
    private String id, message;
    private Date message_time;

    public Message() {
    }

    public Message(String id, String message, Date message_time) {
        this.id = id;
        this.message = message;
        this.message_time = message_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getMessage_time() {
        return message_time;
    }

    public void setMessage_time(Date message_time) {
        this.message_time = message_time;
    }
}
