package tester;

import java.util.Scanner;

public class TestPointArray1 {
	private int xaxis;
	private int yaxis;
	
//	Scanner sc = new Scanner(System.in);
Scanner sc=new Scanner(System.in);
	
	public void accept() {
		System.out.println("Enter the x axis : ");
		xaxis = sc.nextInt();
		System.out.println("Enter the y axis : ");
		yaxis = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("X-axis : "+xaxis);
		System.out.println("Y-axis : "+yaxis);
	}
	
	public double calculateDistance(TestPointArray1 p2)
	{
		double 	x = this.xaxis -p2.xaxis;
		double y = this.yaxis -p2.yaxis;
		return Math.sqrt(Math.pow(x,2)+ Math.pow(y, 2));
	}
	
	public boolean isEqual(TestPointArray1 p2)
	{
		return (this.xaxis == p2.xaxis && this.yaxis == p2.yaxis) ;
	}

}
