package com.pkurw.bookstore.service;

import com.pkurw.bookstore.bean.BookMessage;
import com.pkurw.bookstore.bean.Result;
import com.pkurw.bookstore.bean.UserMessage;

public interface BorrowBook {

    Result clickBorrow(UserMessage userMessage, BookMessage bookMessage);
}
