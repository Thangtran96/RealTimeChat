package com.android.minht.realtimechat;

import android.graphics.Bitmap;

/**
 * Created by minht on 11/8/2017.
 */

public class User {
    private String id, name, auth;
    private Bitmap pic;

    public User() {
    }

    public User(String id, String name, String auth, Bitmap pic) {
        this.id = id;
        this.name = name;
        this.auth = auth;
        this.pic = pic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public Bitmap getPic() {
        return pic;
    }

    public void setPic(Bitmap pic) {
        this.pic = pic;
    }
}
