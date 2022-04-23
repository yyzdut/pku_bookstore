package com.pkurw.bookstore.bean;

import lombok.Data;

@Data
public class BookMessage {
    private Integer bookId;

    private String bname;

    private Integer bookNumber;

    private String author;

    private String status;

    private Integer bookAmount;

}