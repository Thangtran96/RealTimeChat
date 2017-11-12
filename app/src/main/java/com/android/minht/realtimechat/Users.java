package com.android.minht.realtimechat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by minht on 11/12/2017.
 */

public class Users {
    private String uid, username, passsword, email, imgProflie;
    private Map<String,Boolean> groups = new HashMap<>();

    public Users() {
    }

    public Users(String uid, String username, String passsword, String email) {
        this.uid = uid;
        this.username = username;
        this.passsword = passsword;
        this.email = email;
    }

    public Users(String uid, String username, String passsword, String email, String imgProflie, Map<String, Boolean> groups) {
        this.uid = uid;
        this.username = username;
        this.passsword = passsword;
        this.email = email;
        this.imgProflie = imgProflie;
        this.groups = groups;
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

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImgProflie() {
        return imgProflie;
    }

    public void setImgProflie(String imgProflie) {
        this.imgProflie = imgProflie;
    }

    public Map<String, Boolean> getGroups() {
        return groups;
    }

    public void setGroups(Map<String, Boolean> groups) {
        this.groups = groups;
    }
}
