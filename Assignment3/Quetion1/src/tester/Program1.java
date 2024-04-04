package tester;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Points : ");
		int points = sc.nextInt();
		TestPointArray1 [] test = new TestPointArray1[points];
		int startPoint;
		int endPoint;
		for(int i =0;i<test.length;i++)
		{
			test[i] = new TestPointArray1();
			test[i].accept();
		}
		int choice;
		do
		{
			System.out.println("1:Display Details of Specific Point ");
			System.out.println("2: Display x,y coordinates of all points ");
			System.out.println("3: 2 indices for the points , validate the indices ");
			System.out.println("4: Exit");
			System.out.println("Enter your choice : ");
			choice= sc.nextInt();
			
			switch (choice) {
			case 1:
			{
				System.out.println("Enter the index : ");
				int index = sc.nextInt();
				if(index <test.length)
				{
					test[index].display();
				}
				else
					System.out.println("Invalid index,please retry !!!");
			}
		
				break;
			case 2:
				for(int i = 0;i<test.length;i++)
				{
					test[i].display();
				}
				break;
				
			case 3:
				System.out.println("Enter the start point : ");
				startPoint = sc.nextInt();
				System.out.println("Enter the end point : ");
				endPoint = sc.nextInt();
				if(startPoint != endPoint)
				{
					if(((-1< startPoint) && (startPoint<= test.length)) && ((-1<endPoint) && (endPoint<= test.length)))
					{
						if(test[startPoint].isEqual(test[endPoint]))
						{
							System.out.println("Start Point and end point are same !!");
						}
						else
						{
							double distance = test[startPoint].calculateDistance(test[endPoint]);
							System.out.println("Distance : "+distance);
						}
					}
					else
					{
						System.out.println("Boundary condition is false !!!");
					}
				}
				break;
				
			case 4:
				choice = 0;
				break;
			}
		}while (choice != 0);
	
	}
}