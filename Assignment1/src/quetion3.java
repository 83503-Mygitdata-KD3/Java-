import java.util.Scanner;

public class quetion3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int choice;
		int bill=0;
		
   do {

  	
  	 System.out.println("1:dosa 50rs");
  	 System.out.println("2:samosa 12rs");
  	 System.out.println("3:idlii 30rs");
  	 System.out.println("4:generate bill");
     System.out.println("enter your choice :");
     choice=sc.nextInt();
   
   
   switch(choice)
   {
      case 1:bill+=50;
             break;
      
      case 2:bill+=12;
             break;
      
      case 3:bill+=30;
            break;
            
      case 4:System.out.println("total bill :"+bill);
      break;
      
      default:
    	  System.out.println("wrong values");
    	  break;
      
   }
   
   
   }while(choice !=0);
     
     
	}

}
