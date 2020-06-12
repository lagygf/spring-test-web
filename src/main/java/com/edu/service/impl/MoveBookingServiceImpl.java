package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.bean.moveBooking;
import com.edu.mapper.moveBookingMapper;
import com.edu.service.MoveBookingService;

@Service
@Transactional
public class MoveBookingServiceImpl implements MoveBookingService {
	@Autowired
	private moveBookingMapper moveBookingMapper;

	@Override
	public List<moveBooking> getAll() {
		// TODO Auto-generated method stub
		return moveBookingMapper.selectByExample(null);
	}

	@Override
	public moveBooking selectmoveById(moveBooking moveBooking) {
		// TODO Auto-generated method stub
		return moveBookingMapper.selectByPrimaryKey(moveBooking.getId());
	}

	@Override
	public void updatemove(moveBooking moveBooking) {
		// TODO Auto-generated method stub
		moveBookingMapper.updateByPrimaryKeySelective(moveBooking);
	}

	@Override
	public void insert(moveBooking moveBooking) {
		// TODO Auto-generated method stub
		moveBookingMapper.insert(moveBooking);
	}

}
