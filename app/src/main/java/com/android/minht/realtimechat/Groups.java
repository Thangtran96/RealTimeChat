package com.android.minht.realtimechat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by minht on 11/12/2017.
 */

public class Groups {
    private String uid, namegroup;
    private Map<String, Boolean> members = new HashMap<>();

    public Groups() {
    }

    public Groups(String uid, String namegroup, Map<String, Boolean> members) {
        this.uid = uid;
        this.namegroup = namegroup;
        this.members = members;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNamegroup() {
        return namegroup;
    }

    public void setNamegroup(String namegroup) {
        this.namegroup = namegroup;
    }

    public Map<String, Boolean> getMembers() {
        return members;
    }

    public void setMembers(Map<String, Boolean> members) {
        this.members = members;
    }
}
