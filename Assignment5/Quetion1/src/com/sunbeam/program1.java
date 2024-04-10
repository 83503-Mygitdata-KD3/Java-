package com.sunbeam;
import java.util.Scanner;

public class program1 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Employee e = new SalariedEmployee();
//		e.acceptEmployee(sc);
//		e.displayEmployee();
//		e.calculateSalary();
		
//		Employee e = new HourlyEmployee();
//		e.acceptEmployee(sc);
//		e.displayEmployee();
//		e.calculateSalary();
		
//		Employee e = new CommisionEmployee();
//		e.acceptEmployee(sc);
//		e.displayEmployee();
//		e.calculateSalary();
//		
//		Employee e = new BaseplusCommisionEmployee();
//		e.acceptEmployee(sc);
//		e.displayEmployee();
//		e.calculateSalary();
		
		int choice;
		Employee e ;
		do
		{
			System.out.println("1 : Salaried Employee ");
			System.out.println("2 : Hourly Employee ");
			System.out.println("3: Commision Employee ");
			System.out.println("4: Base Pluse commision Employee ");
			System.out.println("Enter your choice : ");
			choice =sc.nextInt();
			if(choice == 1)
			{
				System.out.println("============ Salaried Employee ==============");
				e =  new SalariedEmployee();
				e.acceptEmployee(sc);
				e.displayEmployee();
				e.calculateSalary();
			}
			else if(choice == 2)
			{
				System.out.println("============ Hourly Employee ==============");
				e = new HourlyEmployee();
				e.acceptEmployee(sc);
				e.displayEmployee();
				e.calculateSalary();
			}
			else if(choice == 3)
			{
				System.out.println("============ Commision Employee ==============");
				e = new CommisionEmployee();
				e.acceptEmployee(sc);
				e.displayEmployee();
				e.calculateSalary();
			}
			else if(choice == 4)
			{
				System.out.println("============ BasePlusCommission Employee ==============");
				e = new BaseplusCommisionEmployee();
				e.acceptEmployee(sc);
				e.displayEmployee();
				e.calculateSalary();
				
				if(e instanceof BaseplusCommisionEmployee)
				{
					BaseplusCommisionEmployee b = (BaseplusCommisionEmployee) e;
					((BaseplusCommisionEmployee) e).setBaseSalary(b.getBaseSalary()*0.1);
				}
				e.calculateSalary();
			}
			else 
			{
				System.out.println("Invalid choice !!");
				break;
			}
				
		}while(choice != 0);
	}

}
