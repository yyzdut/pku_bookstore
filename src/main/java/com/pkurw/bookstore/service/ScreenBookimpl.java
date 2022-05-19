package com.pkurw.bookstore.service;

import com.pkurw.bookstore.bean.BookMessage;
import com.pkurw.bookstore.bean.Result;
import com.pkurw.bookstore.mapper.BookMessageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yuyizhe <yyz@stu.pku.edu.cn>
 * Created on 2022-04-20
 * @description：
 */
@Service
public class ScreenBookimpl implements ScreenBook {
    @Resource
    BookMessageMapper bookMessageMapper;

    @Override
    public Result<List<BookMessage>> getBookMessageByName(String bookName) {
        List<BookMessage> list = new ArrayList<>();
        list = bookMessageMapper.selectByBookName(bookName);
        Result result = new Result();
        result.setSuccess(true);
        result.setDetail(list);
        return result;
    }

    @Override
    public Result<List<BookMessage>> getBookMessageByAuthor(String Author) {
        List<BookMessage> list;
        list = bookMessageMapper.selectByBookAuthor(Author);
        Result result = new Result();
        result.setSuccess(true);
        result.setDetail(list);
        return result;
    }

    @Override
    public Result<List<BookMessage>> getBookMessageAll() {
        List<BookMessage> list;
        list = bookMessageMapper.selectAll("aaa");
        Result result = new Result();
        result.setSuccess(true);
        result.setDetail(list);
        return result;
    }
}
