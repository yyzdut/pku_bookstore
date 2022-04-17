package com.pkurw.bookstore.mapper;

import com.pkurw.bookstore.bean.bookMessage;
import com.pkurw.bookstore.bean.bookMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface bookMessageMapper {
    long countByExample(bookMessageExample example);

    int deleteByExample(bookMessageExample example);

    int deleteByPrimaryKey(Integer bookId);

    int insert(bookMessage record);

    int insertSelective(bookMessage record);

    List<bookMessage> selectByExample(bookMessageExample example);

    bookMessage selectByPrimaryKey(Integer bookId);

    int updateByExampleSelective(@Param("record") bookMessage record, @Param("example") bookMessageExample example);

    int updateByExample(@Param("record") bookMessage record, @Param("example") bookMessageExample example);

    int updateByPrimaryKeySelective(bookMessage record);

    int updateByPrimaryKey(bookMessage record);
}