import java.util.Scanner;

public class ReverseString {
	
	
	public static void main(String[] args) {
		String str;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string :");
		str=sc.next();
		
	
		
		StringBuilder str1=new StringBuilder();
		str1.append(str);
		
		str1.reverse();
		
		System.out.println("reverse string :"+str1);
		
	}

}
