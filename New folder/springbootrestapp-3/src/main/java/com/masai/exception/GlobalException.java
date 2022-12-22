package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.model.MyErrorDetails;

@ControllerAdvice
public class GlobalException {

//	@ExceptionHandler(IllegalArgumentException.class)
//	public ResponseEntity<String> myExpHandler(IllegalArgumentException ie) {
//	System.out.println("inside myHandler method...");
//	return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
//	}

	
//	@ExceptionHandler(InvalidRollNumberException.class)
//	public ResponseEntity<String> myExpHandler(InvalidRollNumberException ie) {
//	System.out.println("inside myHandler method...");
//	return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
//	}
	
	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<String> myAnyExpHandler(Exception ie) {
//	System.out.println("inside myHandler method...");
//	return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
//	}
	
	
	
	
	@ExceptionHandler(InvalidRollNumberException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(InvalidRollNumberException ie,WebRequest req) {
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
	
	return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myAnyExpHandler(Exception ie,WebRequest req) {
	
		MyErrorDetails err = new MyErrorDetails();
		err.setTimestamp(LocalDateTime.now());
		err.setMessage(ie.getMessage());
		err.setDetails(req.getDescription(false));
		
		
	return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}

	
	//to handle Not found exception
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req) {
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}

	
	
	
	
}
