package com.sunbeam;
import java.util.Scanner;

public class BaseplusCommisionEmployee extends CommisionEmployee{
	
	private double baseSalary;

	@Override
	public void acceptEmployee(Scanner sc) {
		super.acceptEmployee(sc);
		System.out.println("Enter Base Salary : ");
		baseSalary = sc.nextDouble();
		
	}
	
	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary()
	{
		return baseSalary;
	}
	@Override
	public void displayEmployee() {
		System.out.println(this.toString()+"\n"+"Gross Sales : "+this.getGrossSalary()+"\n"+"Commision Rate : "+this.getCommisionRate()+"\n"+"Base Salary : "+baseSalary);
	}

	@Override
	public void calculateSalary() {
		double salary = (this.getGrossSalary() * this.getCommisionRate()) + this.getBaseSalary();
		System.out.println("Base plus commision salary : "+salary);
	}


}
