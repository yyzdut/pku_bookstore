package com.pkurw.bookstore.service;

import com.pkurw.bookstore.bean.BookMessage;
import com.pkurw.bookstore.bean.Result;
import com.pkurw.bookstore.mapper.BookMessageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface ScreenBook {

    Result<List<BookMessage>> getBookMessageByName(String BookName);

    Result<List<BookMessage>> getBookMessageByAuthor(String Author);
}
