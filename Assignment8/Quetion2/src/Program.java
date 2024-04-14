
import java.util.*;
public class Program {

	public static void main(String[] args) {
		Student arr[] = new Student[5];
		arr[0] = new Student(3, "Akshata", "Nanded", 77);
		arr[1] = new Student(2, "Tejas", "Jamod", 70);
		arr[2] = new Student(4, "Golya", "Goa", 71);
		arr[3] = new Student(1, "Nishant", "Up", 73);
		arr[4] = new Student(5, "Ansh", "Mp", 72);
		Scanner sc = new Scanner(System.in);

		class StudentCityComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getCity().compareTo(o2.getCity());

				return value;
			}

		}

		class StudentMarksComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				int value = Double.compare(o2.getMarks(),o1.getMarks());

				return value;
			}

		}

		class StudentNameComparator implements Comparator<Student> {

			@Override
			public int compare(Student o1, Student o2) {
				int value = o1.getName().compareTo(o2.getName());
				return value;
			}

		}

				int choice;

		do {

			System.out.println("0.exit");
			System.out.println("1. sorted on their city (asc)");
			System.out.println("2. sorted on their on marks (desc)");
			System.out.println("3. sorted on their on name (asc)");
			System.out.println("Enter the choice  ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {

				System.out.println("Thank You ! ");
			}
				break;

			case 1: {
				Comparator<Student> StudCityComparator = new StudentCityComparator();
				Arrays.sort(arr, StudCityComparator);
				for (Student s1 : arr)
					System.out.println(s1);
			}
				break;
			case 2: {

				Comparator<Student> StudentMarksComparator = new StudentMarksComparator();
				Arrays.sort(arr, StudentMarksComparator);
				for (Student s1 : arr)
					System.out.println(s1);
			}
				break;
			case 3: {

				Comparator<Student> StudentNameComparator = new StudentNameComparator();
				Arrays.sort(arr, StudentNameComparator);
				for (Student s1 : arr)
					System.out.println(s1);
			}
				break;

			default:
				System.out.println("Invalid value ");
			}

		} while (choice != 0);
		
	}

}
