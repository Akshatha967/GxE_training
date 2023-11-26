package com.galaxe.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.HttpMessageReader;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpHeaders;
import com.galaxe.book.model.BookingModel;
import com.galaxe.book.service.MovieBookingService;
import com.galaxe.exce.MoviebookException;

@RestController
@RequestMapping("/booking-service")
public class BookingController {

	@Autowired
	private MovieBookingService boookingserv;
	
	//@GetMapping("/get-bookdet/{id}")
	// using request headers
	//@GetMapping("/get-bookdet")
	// using query request @RequestParam("id")
	@GetMapping("/get-bookdet")
	public ResponseEntity<?> getBookingDetails(@RequestHeader("id") int id) throws MoviebookException{
		try {
			HttpHeaders hh = new HttpHeaders();
			hh.add("alert", "Booking at 9 pm");
			ResponseEntity<BookingModel> bm = new ResponseEntity<>(boookingserv.getBooking(id),hh,HttpStatus.OK);
			return bm;
		}catch(Exception e) {
			throw new MoviebookException("booking not found");
		}
	}
	
	@PostMapping("/book")
	public BookingModel book(@RequestBody BookingModel bm){
		return boookingserv.bookMovie(bm);
	}
	
	@PutMapping(value ="/modify-booking/{id}", consumes="application/json", produces="application/xml")
	//@PutMapping(value="/modify-booking/{id}", consumes="application/xml")
	public BookingModel modify(@PathVariable int id,@RequestBody BookingModel bm){
		return boookingserv.modifyBooking(bm);
	}
	
	
	@DeleteMapping("/delete_book/{id}")
	public void cancel(@PathVariable int id){
		 boookingserv.cancelBooking(id);
	}
	
	@GetMapping("/getall-book")
	public List<BookingModel> getallBooking(){
		return  boookingserv.getallBooking();
	}
	
}


/*
 get 
 http://localhost:8080/booking-service/get-bookdet/1
 */


/*
 post :  
 http://localhost:8080/booking-service/book
 {
"language":"english",
"bookingDate":"2022-09-09",
"seats":1,
"movie":"MIP"
}
*/


/*
 put: 
http://localhost:8080/booking-service/modify-booking/1
 */


/*
http://localhost:8080/booking-service/delete_book/1

*/