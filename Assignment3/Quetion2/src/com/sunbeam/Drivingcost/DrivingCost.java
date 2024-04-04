package com.sunbeam.Drivingcost;

import java.util.Scanner;

public class DrivingCost {
	private int miles;
	private double gasoline;
	private double gallon;
	private double parkfees;
	private double toll;
	private double totalcost;
	
	Scanner sc=new Scanner(System.in);
	
	 public DrivingCost()
	{
		miles=0;
		gasoline=0.0;
		gallon=0.0;
		parkfees=0.0;
		toll=0.0;
	}
	 public DrivingCost(int miles,double gasoline,double gallon,double parkfees,double toll)
	{
		this.miles=miles;
		this.gasoline=gasoline;
		this.gallon=gallon;
		this.parkfees=parkfees;
		this.toll=toll;		
	}
	public int getMiles() {
		return miles;
	}
	public void setMiles(int miles) {
		this.miles = miles;
	}
	public double getGasoline() {
		return gasoline;
	}
	public void setGasoline(double gasoline) {
		this.gasoline = gasoline;
	}
	public double getGallon() {
		return gallon;
	}
	public void setGallon(double gallon) {
		this.gallon = gallon;
	}
	public double getParkfees() {
		return parkfees;
	}
	public void setParkfees(double parkfees) {
		this.parkfees = parkfees;
	}
	public double getToll() {
		return toll;
	}
	public void setToll(double toll) {
		this.toll = toll;
	}
	 
	 public void accept()
	 {
		 System.out.println("enter miles :");
		 miles=sc.nextInt();
		 System.out.println("enter gasoline :");
		 gasoline=sc.nextDouble();
		 System.out.println("enter gallon :");
		 gallon=sc.nextDouble();
		 System.out.println("enter parkfees :");
		 parkfees=sc.nextDouble();
		 System.out.println("enter toll :");
		 toll=sc.nextDouble();
		 totalcost=miles*gasoline*gallon*parkfees*toll;
		 
	 }
	 public void display()
	 {
		 
		 System.out.println("miles :"+miles);
		 System.out.println("gasoline :"+gasoline);
		 System.out.println("gallon :"+gallon);
		 System.out.println("parkfees :"+parkfees);
		 System.out.println("toll :"+toll);
		 System.out.println("Total daily driving cost :"+totalcost);
	 }
	 
	 

}

		
