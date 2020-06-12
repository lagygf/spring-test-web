package com.edu.service;

import java.util.List;

import com.edu.bean.moveBooking;

public interface MoveBookingService {

	List<moveBooking> getAll();

	moveBooking selectmoveById(moveBooking moveBooking);

	void updatemove(moveBooking moveBooking);

	void insert(moveBooking moveBooking);

}
