package com.pkurw.bookstore.mapper;

import com.pkurw.bookstore.bean.BookMessage;

import java.util.List;

public interface BookMessageMapper {

    int deleteByPrimaryKey(Integer bookId);

    int insert(BookMessage record);

    int insertSelective(BookMessage record);

    BookMessage selectByPrimaryKey(Integer bookId);

    List<BookMessage> selectByBookName(String bookName);

    List<BookMessage> selectByBookAuthor(String Author);

    int updateByPrimaryKeySelective(BookMessage record);

    int updateByPrimaryKey(BookMessage record);
}