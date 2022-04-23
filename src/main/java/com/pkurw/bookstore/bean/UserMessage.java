package com.pkurw.bookstore.bean;

import lombok.Data;

import java.util.Date;

@Data
public class UserMessage {

    private Integer userId;

    private Date createTime;

    private String username;

    private String gender;

}