import java.util.Scanner;

public class CountWordsOfString {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		 String str;
		 
		 System.out.println("enter a string :");
		 str=sc.nextLine();
		// String str1=str.trim();
		 
		 String[] str2=str.split(" ");
		 
		 
		 System.out.println("no of words in string :"+str2.length);

	}

}
