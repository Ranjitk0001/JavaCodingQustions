package arrays;

import java.util.stream.Stream;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] names = { "Sachin", "gangyly", "Sehwag" };

		System.out.println("==Approach - 1 :- For loop==");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println("==Approach - 2 :- For each==");
		for (String n:names) {
			System.out.println(n);
		}
		
		System.out.println("==Approach - 3 :- For Stream ==");
		Stream.of(names).forEach(name-> System.out.println(name));
	}

}
