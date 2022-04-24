package com.pkurw.bookstore.service;

import com.pkurw.bookstore.bean.BookMessage;
import com.pkurw.bookstore.bean.BorrowMessage;
import com.pkurw.bookstore.bean.Result;
import com.pkurw.bookstore.bean.UserMessage;
import com.pkurw.bookstore.mapper.BookMessageMapper;
import com.pkurw.bookstore.mapper.BorrowMessageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author yuyizhe <yyz@stu.pku.edu.cn>
 * Created on 2022-04-20
 * @description：
 */
@Service
public class BorrowBookimpl implements BorrowBook{

    @Resource
    BookMessageMapper bookMessageMapper;

    @Resource
    BorrowMessageMapper borrowMessageMapper;

    /**
     * 返回值为当前是否借书成功，以及借书完成后该书的返回值（已经写回到数据库中）
     */
    @Override
    public synchronized Result clickBorrow(UserMessage userMessage, BookMessage bookMessage) {
        Result result = new Result();
        int bookAmount = bookMessageMapper.selectByPrimaryKey(bookMessage.getBookId()).getBookAmount();
        if(bookAmount<=0) {
            result.setMsg("书籍已经全部被借出，请重试");
            result.setSuccess(true);
        }
        else {
            BorrowMessage borrowMessage = new BorrowMessage();
            borrowMessage.setBookId(bookMessage.getBookId());
            borrowMessage.setBookNumber(bookMessage.getBookId());
            Date date = new Date();
            long mid = date.getTime();
            long a = 2592000000L;
            Date todayDate = new Date(mid);
            Date returnDate = new Date(mid + a);
            borrowMessage.setBrrowTime(todayDate);
            borrowMessage.setReturnTime(returnDate);
            borrowMessage.setUserId(userMessage.getUserId());
            borrowMessageMapper.insert(borrowMessage);
            bookMessage.setBookAmount(bookAmount - 1);
            bookMessageMapper.updateByPrimaryKey(bookMessage);
            result.setSuccess(true);
            result.setMsg("借书成功！");
        }
        return result;
    }
}
