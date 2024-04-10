package com.sunbeam;
import java.util.Scanner;
public class SalariedEmployee extends Employee{
	
	private double salary;
	private  int hrs;
	
	public SalariedEmployee()
	{
		this.salary = 5000;
		this.hrs = 8;
	}
	
	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter the salary : ");
		this.salary = sc.nextDouble();
		System.out.println("Enter the hours : ");
		this.hrs = sc.nextInt();
		
	}

	@Override
	public void displayEmployee() {
		System.out.println(this.toString());
	}
	
	@Override
	public void calculateSalary() {
		if(salary > 0)
		{
			double salary = this.salary*hrs;
			System.out.println("Week Salary : "+salary);
		}
		else
			System.out.println("Invalid Salary !!");
	
		
	}

}
