package com.galaxe.book.model;

import org.springframework.stereotype.Component;

@Component
public class BookingModel {

	int id;
	String language;
	String bookingDate;
	int seats;
	private String movie;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	@Override
	public String toString() {
		return "BookingModel [id=" + id + ", language=" + language + ", bookingDate=" + bookingDate + ", seats=" + seats
				+ ", movie=" + movie + "]";
	}

	
}

/*
 {
"language":"english",
"bookingDate":"2022-09-09",
"seats":1
}
*/
