import java.util.Scanner;

public class quetion1 {

	public static void main(String[] args) {
		
		int num;
		
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("enter number :");
	  num=sc.nextInt();
	  
	  
	  System.out.println("given number :"+num);
	  System.out.println("binary equivalent :"+Integer.toBinaryString(num));
      System.out.println("octal equivalent :"+Integer.toOctalString(num));
      System.out.println("hexadecimal equivalent :"+Integer.toHexString(num));
      
      
	}
	

}
