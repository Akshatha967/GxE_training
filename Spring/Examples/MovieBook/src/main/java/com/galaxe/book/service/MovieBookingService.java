package com.galaxe.book.service;

import java.util.List;


import com.galaxe.book.model.BookingModel;

public interface MovieBookingService {

	public BookingModel getBooking(int id);
	
	public BookingModel bookMovie(BookingModel bm);
	
	public BookingModel modifyBooking(BookingModel bm);
	public void  cancelBooking(int id) ;
	public List<BookingModel> getallBooking() ;
}
