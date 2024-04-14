
import java.util.*;
public class Program {
	
	public static <T> void Selection(T[] arr, Comparator<T> c) {
		int n = arr.length;

		for (int i = 0; i < n -1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {

					T temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		
		class Test  implements Comparator<Integer>{

			@Override
			public int compare(Integer o1, Integer o2) {
				int value = Integer.compare(o1,o2);
				return value;
			}
			
			
		}
		Test t1=new Test();
		
		
		
		Integer arr[]= {11,122,12,23};
		System.out.print("before ");
		for(Integer ele:arr) {
			System.out.println(ele);
		}

		Selection(arr, t1);
		System.out.print("After  ");
		
		for(Integer ele:arr) {
			System.out.println(ele);
		}
		
		
	}

}
