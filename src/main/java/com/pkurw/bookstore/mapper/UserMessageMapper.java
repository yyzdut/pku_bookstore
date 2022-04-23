package com.pkurw.bookstore.mapper;

import com.pkurw.bookstore.bean.UserMessage;

public interface UserMessageMapper {

    int deleteByPrimaryKey(Integer userId);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    UserMessage selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}