package com.pkurw.bookstore.mapper;

import com.pkurw.bookstore.bean.userMessage;
import com.pkurw.bookstore.bean.userMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface userMessageMapper {
    long countByExample(userMessageExample example);

    int deleteByExample(userMessageExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(userMessage record);

    int insertSelective(userMessage record);

    List<userMessage> selectByExample(userMessageExample example);

    userMessage selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") userMessage record, @Param("example") userMessageExample example);

    int updateByExample(@Param("record") userMessage record, @Param("example") userMessageExample example);

    int updateByPrimaryKeySelective(userMessage record);

    int updateByPrimaryKey(userMessage record);
}