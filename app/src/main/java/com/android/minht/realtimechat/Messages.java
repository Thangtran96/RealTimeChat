package com.android.minht.realtimechat;

import java.util.Date;

/**
 * Created by minht on 11/12/2017.
 */

public class Messages {
    private String uidGroup, uid, username, message;
    private Date timestamp;

    public Messages() {
    }

    public Messages(String uidGroup, String uid, String username, String message, Date timestamp) {
        this.uidGroup = uidGroup;
        this.uid = uid;
        this.username = username;
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getUidGroup() {
        return uidGroup;
    }

    public void setUidGroup(String uidGroup) {
        this.uidGroup = uidGroup;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
