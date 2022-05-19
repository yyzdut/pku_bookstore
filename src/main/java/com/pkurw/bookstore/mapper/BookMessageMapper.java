package com.pkurw.bookstore.mapper;

import com.pkurw.bookstore.bean.BookMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMessageMapper {

    int deleteByPrimaryKey(Integer bookId);

    int insert(BookMessage record);

    int insertSelective(BookMessage record);

    BookMessage selectByPrimaryKey(Integer bookId);

    List<BookMessage> selectByBookName(@Param("bookName") String bookName);

    List<BookMessage> selectByBookAuthor(String Author);

    List<BookMessage> selectAll(String all);

    int updateByPrimaryKeySelective(BookMessage record);

    int updateByPrimaryKey(BookMessage record);
}