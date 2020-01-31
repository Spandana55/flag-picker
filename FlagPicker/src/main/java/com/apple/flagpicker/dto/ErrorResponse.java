package com.apple.flagpicker.dto;

import java.util.ArrayList;
import java.util.List;

public class ErrorResponse {

	private String message;

	private List<String> exception = new ArrayList<>();

	public ErrorResponse(String message, List<String> exception) {
		super();
		this.message = message;
		this.exception = exception;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<String> getException() {
		return exception;
	}

	public void setException(List<String> exception) {
		this.exception = exception;
	}
}
