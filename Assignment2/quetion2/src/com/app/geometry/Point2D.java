package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	private int x;
	private int y;
	
	
	Scanner sc=new Scanner(System.in);
	public Point2D(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public String getDetails()
	{
		return("("+x +","+y+")");
	}
	
	
	public boolean isEqual(Point2D p2)
	{
		return (this.x == p2.x && this.y == p2.y);
	}
	
	public double calculateDistance(Point2D p2)
	{
		double x = this.x -p2.x;
		double y = this.y- p2.y;
		
		return Math.sqrt(Math.pow(x,2)+(Math.pow(y,2)));
	}
	
	
	

}
