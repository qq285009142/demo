package com.example.demo.pojo;

import java.io.Serializable;
import java.sql.Date;

public class User implements Serializable {
    private String id;
    private String name;
    private String passWord;
    private Date createTime;
    private String creatrUser;
    private Date modfyTime;
    private String modfyUser;
}
