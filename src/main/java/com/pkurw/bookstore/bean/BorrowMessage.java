package com.pkurw.bookstore.bean;

import lombok.Data;

import java.util.Date;

@Data
public class BorrowMessage {

    private Integer borrowId;

    private Integer bookId;

    private Date brrowTime;

    private Date returnTime;

    private Integer userId;

    private Integer bookNumber;

}