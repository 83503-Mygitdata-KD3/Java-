package com.sunbeam.exceptions;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("enter a string :");
		String str=sc.next();
		try {
     	if(str.length()>80)
     	throw new ExceptionLineTooLong("string is too longg");

			System.out.println("string is :"+str);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
