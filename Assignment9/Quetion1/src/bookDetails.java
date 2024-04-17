import java.util.Objects;
import java.util.Scanner;




public class bookDetails implements Comparable<bookDetails> {

	String isbn;
	double price;
	String authorName;
	int quantity;
	 private Category category;

	enum Category {
		
		FICTION, NONFICTION, SCIENCE, HISTORY, BIOGRAPHY
	}
	public bookDetails() {
		
	}

	public bookDetails(String isbn, double price, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}


public Category getcategory() {
	return category;
}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		bookDetails other = (bookDetails) obj;
		return Objects.equals(isbn, other.isbn);
	}

	public void addBook(Scanner sc) {
	    System.out.println("Enter isbn - ");
	    isbn = sc.next();
	    System.out.println("Enter price - ");
	    price = sc.nextDouble();
	    System.out.println("Enter Author Name - ");
	    authorName = sc.next();
	    System.out.println("Enter Quantity  - ");
	    quantity = sc.nextInt();
	    System.out.print("Enter category IN upper case(FICTION, NONFICTION, SCIENCE, HISTORY, BIOGRAPHY): ");
	    
	    category = Category.valueOf(sc.next());
	}


	@Override
	public String toString() {
		return "bookDetails [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity="
				+ quantity+"Category "+ category +"]";
	}

	@Override
	public int compareTo(bookDetails o) {
	
		return this.isbn.compareTo(o.isbn);
	}
	
	

}