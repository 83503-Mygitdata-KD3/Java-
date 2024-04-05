package com.app.airline;

import java.util.Scanner;

public class airline {


    static int index=1;
    static int index2=6;
	public static void main(String[] args) {
		


			Scanner sc= new Scanner(System.in);
			
			boolean [] arr =new boolean[11];
			
			int choice;
			do {
				
				System.out.println("1.first class ");
				System.out.println("2.Economy class ");

				System.out.println("3.boarding pass ");
				System.out.println("0.exit");
				choice =sc.nextInt();

				
				switch (choice) {
				
				case 0:
					System.out.println("Thank You !  ");
					break;
					
				case 1:
					
				{  
				if(index>5) {
					
					System.out.println("seat is full in 1 st classs ");
					
					
				}else {
					if(index<=5)
					arr[index++]=true;
					System.out.println("seat booked !");

				}}
					break;
				case 2:{
					if(index2>10) {
						int n;
						System.out.println("Economy is full..! do you want to book 1st class seat (1. yes) (2.no)");
						n=sc.nextInt();
						if(n==1) {
							if(index>5) {
								
								System.out.println("here also seats are  full . Next flight leaves in 3 hours. ");
								
								
							}else {
								if(index<=5)
								arr[index++]=true;
							
							}
							
							
						}
						else if(n==2) {
							System.out.println("Next flight leaves in 3 hours.");
						}
						
					}
				if(index2<=10)
					arr[index2++]=true;
				System.out.println("seat booked !");

					
				}
				break;
				case 3:{
					int n;
					
					System.out.println(" enter seat no ");
					n= sc.nextInt();
					
						if(arr[n]) {
							if(n>5) {
								
								
								System.out.println("seat no - "+ n);
								System.out.println("seat type  - "+ "Economy ");
								

								
							}else if(n<=5) {
								
								System.out.println("seat no - "+ n);
								System.out.println("seat type  - "+ "First class ");
								
							}
							
							
							 
							
						}else {
							 System.out.println(" seat is empty ");
						}
						
					
					
					
				}
				break;
				

				default:
					System.out.println("invaild choice");
					break;
				}
				
			}while (choice!=0);
	

	}
}