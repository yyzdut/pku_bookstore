package com.pkurw.bookstore.bean;

import java.util.Date;

public class borrowMessage {
    private Integer borrowId;

    private Integer bookId;

    private Date brrowTime;

    private Date returnTime;

    private Integer userId;

    private Integer bookNumber;

    public Integer getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(Integer borrowId) {
        this.borrowId = borrowId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Date getBrrowTime() {
        return brrowTime;
    }

    public void setBrrowTime(Date brrowTime) {
        this.brrowTime = brrowTime;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(Integer bookNumber) {
        this.bookNumber = bookNumber;
    }
}