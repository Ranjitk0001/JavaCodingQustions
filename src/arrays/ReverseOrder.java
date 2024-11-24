package arrays;

public class ReverseOrder {

	public static void main(String[] args) {
		String[] names = { "Sachin", "gangyly", "Sehwag" };
		System.out.println("==Approach - 1 :- For loop==");
		for (int  i=names.length-1; i>=0; i--) {
			System.out.println(names[i]);
		}
	}

}
