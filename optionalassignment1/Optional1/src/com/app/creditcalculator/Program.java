package com.app.creditcalculator;

import java.util.Scanner;

public class Program {
	
	private int accno;
	private int pendbal;
	private int total_items;
	private int total_credits;
	private int credit_limit;
	private int charges;
	private int new_balance;
	
	Scanner sc = new Scanner(System.in);
	
 public void accept()
 {
	 
	 System.out.println("enter accno :");
	 accno=sc.nextInt();
	 System.out.println("enter pendbal :");
	 pendbal=sc.nextInt();
	 System.out.println("enter total items :");
	 total_items=sc.nextInt();
	 System.out.println("enter total credits :");
	 total_credits=sc.nextInt();
	 System.out.println("enter credit limit :");
	 credit_limit=sc.nextInt();
 }
	public void display()
	{
		
		System.out.println("allowed credit :"+credit_limit);
		System.out.println("total items charged :"+total_items);
		System.out.println("total all credit applied in this month :"+total_credits);
		System.out.println("pending balance :"+pendbal);
		new_balance=(pendbal+total_items-total_credits);
		System.out.println("new balance :"+new_balance);
		
		if(new_balance > credit_limit)
		{
			System.out.println("Credit limit exceeded..");
		}
		else 
		{
			System.out.println("not exceeded credit limit");
		}
	}

}
