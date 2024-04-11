package com.sunbeam;
import java.util.Scanner;


	public class HourlyEmployee extends Employee {

		private int wage;
		private int hrs;
		private double salary;

		@Override
		public void acceptEmployee(Scanner sc) {
			super.acceptEmployee(sc);
			System.out.println("Enter the hourly wage : ");
			this.wage = sc.nextInt();
			System.out.println("Enter the hours worked : ");
			this.hrs = sc.nextInt();
		}
		

		
		@Override
		public void displayEmployee() {
			System.out.println(this.toString()+"\n"+"Hourly Wage : "+wage+"\n"+"Hours Worked : "+hrs);	
		}

		@Override
		public void calculateSalary() {
			if(hrs <=40)
			{
				salary = wage*hrs;
			}
			else if(hrs > 40)
			{
				salary = (40*this.wage) + (hrs - 40) * (wage*1.5);
			}
			
			System.out.println("Hours Employee Salary : "+salary);
		}

}
