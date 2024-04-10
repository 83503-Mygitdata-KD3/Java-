package com.sunbeam.exceptions;

public class ExceptionLineTooLong extends Exception{
	
	private  String str1;

	
	public ExceptionLineTooLong() {
		
	


	public ExceptionLineTooLong(String str1) {
		super(str1);

	}
	

  
	@Override
	public void printStackTrace() {
		
		super.printStackTrace();
	}


	
}

