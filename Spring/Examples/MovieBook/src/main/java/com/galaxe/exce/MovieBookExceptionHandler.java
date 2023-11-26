package com.galaxe.exce;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MovieBookExceptionHandler {

	 @ExceptionHandler(value = {MoviebookException.class})
	public ResponseEntity<?> moviebookExchandler(MoviebookException exc){
		ResponseEntity<String> re = new ResponseEntity<>(exc.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		return re;
	}
}
