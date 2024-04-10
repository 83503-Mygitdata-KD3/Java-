package com.sunbeam;
import java.util.Scanner;

public abstract class Employee implements Acceptable{
	String firstName;
	String lastName;
	String socialSecurityNumber;
	
	public Employee() {
		super();
	}
	
	
	@Override
	public void acceptEmployee(Scanner sc) {
		System.out.println("Enter the first name : ");
		this.firstName = sc.next();
		System.out.println("Enter the last name : ");
		this.lastName = sc.next();
		System.out.println("Enter the SSN : ");
		this.socialSecurityNumber = sc.next();
	}


	@Override
	public void displayEmployee() {
		System.out.println(this.toString());
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	
	public String toString()
	{
		return ("Name : "+firstName+" "+lastName+"\n"+"Social Security Number (SSN) : "+socialSecurityNumber);
	}
	
	
	
	public abstract void calculateSalary();


}
