
public class Student implements Comparable<Student>{
	
	

	private int roll;
	private String name;
	private String city;
	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public double getMarks() {
		return marks;
	}

	private double marks;

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	// natural
	@Override
	public int compareTo(Student o) {

		return (this.roll - o.roll);
	}

	public static void main(String[] args) {

	}

}
