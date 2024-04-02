import java.util.Scanner;

public class quetion2 {

	public static void main(String[] args) {
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter num1 :");
		if(sc.hasNextDouble())
		{
			num1=sc.nextDouble();
		}
		else
		{
			System.out.println("enter value is not double type ");
			return;
		}
		
		System.out.println("enter num2 :");
		if(sc.hasNextDouble())
		{
			num2=sc.nextDouble();
		}
		else
		{
			System.out.println("enter value is not double type");
			return;
		}
		System.out.println("value 1 :"+num1);
		System.out.println("value 2 :"+num2);
		System.out.println("average of 2 values :"+(num1+num2)/2);
		
		}

}
