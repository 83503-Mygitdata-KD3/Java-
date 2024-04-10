package com.sunbeam;
import java.util.Scanner;

public class CommisionEmployee extends Employee{
	
	private double grossSalary;
	private int commisionRate;

	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter the gross salary : ");
		grossSalary = sc.nextDouble();
		System.out.println("Enter the commision Rate : ");
		commisionRate = sc.nextInt();
	}
	
	

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public int getCommisionRate() {
		return commisionRate;
	}

	public void setCommisionRate(int commisionRate) {
		this.commisionRate = commisionRate;
	}

	@Override
	public void displayEmployee() {
	
		System.out.println(this.toString()+"\n"+"Gross Sales : "+grossSalary+"\n"+"Commision Rate : "+commisionRate);
	}

	@Override
	public void calculateSalary() {
		double salary = this.commisionRate * this.grossSalary;
		System.out.println("Commision Salary : "+salary);
	}



}
