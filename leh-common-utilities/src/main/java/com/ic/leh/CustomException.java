package com.ic.leh;

public class CustomException extends Exception {
	
	private String exceptionMsg;
	public CustomException (String exceptionMsg) {

		this.exceptionMsg = exceptionMsg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return exceptionMsg;
	}
	
}
