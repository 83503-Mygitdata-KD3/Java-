import java.util.*;



public class program {

	public static void main(String[] args) {
		
		Set<bookDetails> list= new HashSet<>();
		Scanner sc = new Scanner(System.in);
		
		class comparatorCategory implements Comparator<bookDetails>{

			@Override
			public int compare(bookDetails o1, bookDetails o2) {
				
				
				
				return o1.getcategory().name().compareTo(o2.getcategory().name());
			}
			
			
			
		}
		class comparatorAuthorName implements Comparator<bookDetails> {

			@Override
			public int compare(bookDetails o1, bookDetails o2) {
				
				return o1.authorName.compareTo(o2.authorName);
			}
			
			
		}
		

		Comparator<bookDetails> com = new comparatorAuthorName();
		Comparator<bookDetails> category=new comparatorCategory();

		int choice;

		do {
			System.out.println("0. Exit ");
			System.out.println("1.Add book details - ");
			System.out.println("2.Display all books");
			System.out.println("3. Sort the book details as per category");
			System.out.println("4. Sort the book details as per author ");
			System.out.println("5. Find book by id. - ");

			System.out.println("Enter choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank You ...!");
				

				break;
				
			case 1:
			{
				bookDetails book=new bookDetails();
				book.addBook(sc);
				list.add(book);
				
				
				
			}

				break;
			case 2:
			{
				for(bookDetails e1:list) {
					System.out.println(e1);
				}
			}

				break;
			case 3:
				
			{
				
				 ArrayList<bookDetails> a1=new ArrayList<>(list);
				  Collections.sort(a1,category);
				  
				  for(bookDetails ele:a1) {
					  System.out.println(ele);
				  }
		
				
			}

				break;
			case 4:
			
			  ArrayList<bookDetails> a1=new ArrayList<>(list);
			  Collections.sort(a1,com);
			  
			  for(bookDetails ele:a1) {
				  System.out.println(ele);
			  }
	
			

				break;
			case 5:

			bookDetails s1 = new bookDetails();
			System.out.println("Enter the id ");
			String id=sc.next();

				s1.setIsbn(id);

				if (list.contains(s1)) {
					for(bookDetails book :list) {
						
						 if (book.getIsbn().equals(id)) {
							 System.out.println(book);
							 break;
						 }
						
					}
				
				}else{
					System.out.println("not exits !..");
				}

				break;
			default:
				break;
			}

		} while (choice != 0);

	}

}