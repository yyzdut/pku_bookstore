package com.pkurw.bookstore.mapper;

import com.pkurw.bookstore.bean.borrowMessage;
import com.pkurw.bookstore.bean.borrowMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface borrowMessageMapper {
    long countByExample(borrowMessageExample example);

    int deleteByExample(borrowMessageExample example);

    int deleteByPrimaryKey(Integer borrowId);

    int insert(borrowMessage record);

    int insertSelective(borrowMessage record);

    List<borrowMessage> selectByExample(borrowMessageExample example);

    borrowMessage selectByPrimaryKey(Integer borrowId);

    int updateByExampleSelective(@Param("record") borrowMessage record, @Param("example") borrowMessageExample example);

    int updateByExample(@Param("record") borrowMessage record, @Param("example") borrowMessageExample example);

    int updateByPrimaryKeySelective(borrowMessage record);

    int updateByPrimaryKey(borrowMessage record);
}