package com.cg.CompanyManagementApp.globalexceptionhandler;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.cg.CompanyManagementApp.exception.EmployeesNotFoundException;
import com.cg.CompanyManagementApp.exception.ErrorDetails;

@ControllerAdvice
public class GlobalExceptionalHandler {
	@ExceptionHandler(EmployeesNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleEmployeesNotFoundException(EmployeesNotFoundException ex,
			WebRequest request) {
		ErrorDetails errdetails = new ErrorDetails(HttpStatus.NOT_FOUND.value(), ex.getMessage(),
				request.getDescription(false), LocalDateTime.now());
		return new ResponseEntity<ErrorDetails>(errdetails, HttpStatus.NOT_FOUND);
	}
}
