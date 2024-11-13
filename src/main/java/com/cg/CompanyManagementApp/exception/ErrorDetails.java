package com.cg.CompanyManagementApp.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

	private int statusCode;
	private String message;
	private String details;
	private LocalDateTime dateTime;

	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorDetails(int statusCode, String message, String details, LocalDateTime dateTime) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.details = details;
		this.dateTime = dateTime;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

}

