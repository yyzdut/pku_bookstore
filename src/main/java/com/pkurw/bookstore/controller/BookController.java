package com.pkurw.bookstore.controller;

import com.pkurw.bookstore.bean.BookMessage;
import com.pkurw.bookstore.bean.Result;
import com.pkurw.bookstore.service.ScreenBook;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yuyizhe <yyz@stu.pku.edu.cn>
 * Created on 2022-04-20
 * @description：首页书籍界面
 */
@RestController
@RequestMapping("/book")
@Api(tags = "首页显示书籍")
public class BookController {

    @Autowired
    ScreenBook screenBook;

    @ApiOperation(value = "通过书籍名称查找书籍，显示在首页")
    @PostMapping("/byname")
    public Result<List<BookMessage>> getBookByName(@RequestBody String bookName) {
        System.out.println("successful");
        Result<List<BookMessage>> result = screenBook.getBookMessageByName(bookName);
        System.out.println(bookName);
        return result;
    }

    @ApiOperation(value = "通过作者名称查找书籍，显示在首页")
    @PostMapping("/byauthor")
    public Result<List<BookMessage>> getBookByAuthor(String bookAuthor) {
        return screenBook.getBookMessageByAuthor(bookAuthor);
    }

    @ApiOperation(value = "全部")
    @RequestMapping("/all")
    public Result<List<BookMessage>> getBookAll() {
        return screenBook.getBookMessageAll();
    }
}
