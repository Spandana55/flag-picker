package com.apple.flagpicker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ContinentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -209944856017256795L;

	public ContinentNotFoundException(String exception) {
		super(exception);
	}

}
