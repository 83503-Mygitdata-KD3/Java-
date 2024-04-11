import java.util.Scanner;

public class CheckStringPallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		
		System.out.println("enter a string :");
		str=sc.next();
		
		StringBuilder str1=new StringBuilder(str);
		
		str1.reverse();
		
		if(str.equals(str1.toString()))
		System.out.println("string is pallindrome");
		else 
			
		System.out.println("string is not pallindrome");
		
		
		
	}

}
