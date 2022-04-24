package com.pkurw.bookstore.service;

import com.pkurw.bookstore.bean.BookMessage;
import com.pkurw.bookstore.bean.Result;
import com.pkurw.bookstore.bean.UserMessage;

/**
 * @author yuyizhe <yyz@stu.pku.edu.cn>
 * Created on 2022-04-20
 * @description：
 */
public interface BorrowBook {

    Result clickBorrow(UserMessage userMessage, BookMessage bookMessage);
}
