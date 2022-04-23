package com.pkurw.bookstore.controller;

import com.pkurw.bookstore.bean.BookMessage;
import com.pkurw.bookstore.bean.Result;
import com.pkurw.bookstore.bean.UserMessage;
import com.pkurw.bookstore.service.BorrowBook;
import com.pkurw.bookstore.service.ScreenBook;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/borrow")
@Api(tags = "用户借书")
public class BorrowController {

    @Autowired
    BorrowBook borrowBook;

    @ApiOperation(value = "用户点击借书按钮,实现借书操作")
    @PostMapping("/single")
    public Result borrowBook(UserMessage userMessage, BookMessage bookMessage) {
        return borrowBook(userMessage, bookMessage);
    }
}
