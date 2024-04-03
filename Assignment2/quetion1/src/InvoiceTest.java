import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {
		
		 int quantity;
		 double price;
		 Invoice i1=new Invoice();
			//i1.calculateInvoice(2, 50);
			
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter quantity :");
		quantity=sc.nextInt();
		
		System.out.println("enter price :");
		price=sc.nextDouble();
		
		if(quantity<0)
		{
		i1.setQuantity(0);	
		}
		else if (price <0)
		{
			i1.setPrice(0.0);
		}
		else
		{
			i1.calculateInvoice(quantity, price);
		}
		
	}

}
