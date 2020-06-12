package com.edu.mapper;

import com.edu.bean.moveBooking;
import com.edu.bean.moveBookingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface moveBookingMapper {
    long countByExample(moveBookingExample example);

    int deleteByExample(moveBookingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(moveBooking record);

    int insertSelective(moveBooking record);

    List<moveBooking> selectByExample(moveBookingExample example);

    moveBooking selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") moveBooking record, @Param("example") moveBookingExample example);

    int updateByExample(@Param("record") moveBooking record, @Param("example") moveBookingExample example);

    int updateByPrimaryKeySelective(moveBooking record);

    int updateByPrimaryKey(moveBooking record);
}