package com.example.demo.pojo;

import java.sql.Date;

public class User {
    private String id;

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

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatrUser() {
        return creatrUser;
    }

    public void setCreatrUser(String creatrUser) {
        this.creatrUser = creatrUser;
    }

    public Date getModfyTime() {
        return modfyTime;
    }

    public void setModfyTime(Date modfyTime) {
        this.modfyTime = modfyTime;
    }

    public String getModfyUser() {
        return modfyUser;
    }

    public void setModfyUser(String modfyUser) {
        this.modfyUser = modfyUser;
    }

    private String name;
    private String passWord;
    private Date createTime;
    private String creatrUser;
    private Date modfyTime;
    private String modfyUser;
}
