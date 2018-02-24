package com.my.model;

import java.util.Date;

/**
 * Created by zunyun on 17-12-7.
 */
public class User {
    public static final String field_name = "name";

    private String name;
    private String password;
    private String group;
    private String ip;
    private Date createdAt;
    private Date lastLoggedInAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastLoggedInAt() {
        return lastLoggedInAt;
    }

    public void setLastLoggedInAt(Date lastLoggedInAt) {
        this.lastLoggedInAt = lastLoggedInAt;
    }
}
