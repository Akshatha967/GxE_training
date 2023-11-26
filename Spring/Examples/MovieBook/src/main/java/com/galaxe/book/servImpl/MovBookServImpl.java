package com.galaxe.book.servImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxe.book.dao.MovBookRepo;
import com.galaxe.book.model.BookingModel;
import com.galaxe.book.service.MovieBookingService;

@Service
public class MovBookServImpl implements MovieBookingService {

	//
	@Autowired
	private MovBookRepo  bookingrep;
	
	@Override
	public BookingModel getBooking(int id) {
		// TODO Auto-generated method stub
		return bookingrep.getBooking(id);
	}

	@Override
	public BookingModel bookMovie(BookingModel bm) {
		// TODO Auto-generated method stub
		return bookingrep.bookMovie(bm);
	}

	@Override
	public BookingModel modifyBooking(BookingModel bm) {
		// TODO Auto-generated method stub
		return bookingrep.modifyBooking(bm);
	}

	@Override
	public void cancelBooking(int id) {
		// TODO Auto-generated method stub

		bookingrep.cancelBooking(id);
	}

	@Override
	public List<BookingModel> getallBooking() {
		// TODO Auto-generated method stub
		return bookingrep.getallBooking();
	}

}
