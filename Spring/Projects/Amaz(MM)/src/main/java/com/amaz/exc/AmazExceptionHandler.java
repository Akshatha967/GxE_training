package com.amaz.exc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AmazExceptionHandler {

	@ExceptionHandler(value = {ResNotFound.class})
	public ResponseEntity<?> moviebookExchandler(ResNotFound exc){
		ResponseEntity<String> re = new ResponseEntity<>(exc.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		return re;
	}
}
