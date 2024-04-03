
public class Invoice {

	
		
		private String part_number;
		private String part_description;
		private int quantity;
		private double price;
		public Invoice() {
			part_number="";
			part_description="";
			quantity=0;
			price=0.0;
			
		}
		public Invoice(String part_number, String part_description, int quantity, double price) {
			super();
			this.part_number = part_number;
			this.part_description = part_description;
			this.quantity = quantity;
			this.price = price;
		}
		public String getPart_number() {
			return part_number;
		}
		public void setPart_number(String part_number) {
			this.part_number = part_number;
		}
		public String getPart_description() {
			return part_description;
		}
		public void setPart_description(String part_description) {
			this.part_description = part_description;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
	
		public void calculateInvoice(int quantity,double price)
		{
			
			System.out.println("Invoic ::" +(quantity*price));
		}
		
      		
		

	}

	


