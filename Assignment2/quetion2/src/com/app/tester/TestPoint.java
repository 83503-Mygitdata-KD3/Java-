package tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println("Enter two numbers : ");
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		Point2D p1 = new Point2D(x1,x2);
		System.out.println("Enter two numbers : ");
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		Point2D p2 = new Point2D(y1,y2);
		
		System.out.println("Point 1 : "+p1.getDetails());
		System.out.println("POint 2 : "+p2.getDetails());
		
		if(p1.isEqual(p2))
		{
			System.out.println("P1 and p2 are same");
		}
		else
		{
			double distance = p1.calculateDistance(p2);
			System.out.println("Distance : "+distance);
		}
	}

}
