package com.pkurw.bookstore.mapper;

import com.pkurw.bookstore.bean.BorrowMessage;

public interface BorrowMessageMapper {

    int deleteByPrimaryKey(Integer borrowId);

    int insert(BorrowMessage record);

    int insertSelective(BorrowMessage record);

    BorrowMessage selectByPrimaryKey(Integer borrowId);

    int updateByPrimaryKeySelective(BorrowMessage record);

    int updateByPrimaryKey(BorrowMessage record);

}