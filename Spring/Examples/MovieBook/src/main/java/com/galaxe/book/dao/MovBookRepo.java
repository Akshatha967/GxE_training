package com.galaxe.book.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;

import com.galaxe.book.model.BookingModel;

@Service
public class MovBookRepo {

	private AtomicInteger bookid = new AtomicInteger(0);
	private Map<Integer, BookingModel> bookdet = new HashMap();
	
	public BookingModel getBooking(int id) {
		System.out.println(bookdet.get(id));
		return bookdet.get(id);
	}
	
	public BookingModel bookMovie(BookingModel bm) {
		int id = bookid.incrementAndGet();
		bookdet.put( id , bm);
		bm.setId(id);
		System.out.println(bm);
		return bm;
		
	}
	
	public BookingModel modifyBooking(BookingModel bm) {
		
		bookdet.put( bm.getId() , bm);
		System.out.println(bookdet.get(bm.getId()));
		return bm;
		
	}
	public void  cancelBooking(int id) {
		System.out.println(bookdet.get(id));
		bookdet.remove(id);
		System.out.println(bookdet.get(id));
		//return bm;
		
	}
	
	public List<BookingModel> getallBooking() {
		List<BookingModel> bm = new ArrayList<>();
		Set<Integer> keys = bookdet.keySet();
		for(Integer key : keys)
		{
			bm.add(bookdet.get(key));
		}
		return bm;
	}
}
