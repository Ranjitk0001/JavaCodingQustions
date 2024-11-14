package string;

import java.util.Arrays;

public class SortStringChar {

	public static void main(String[] args) {
		
		//Approach 1:-without using sort method
		String str = "java";
		char arr[] = str.toCharArray();
		// System.out.println(arr);
		char temp;
		// Bubble sort approach to sort characters in ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					// Swap characters
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println("Without  Method :-"+ new String(arr));
		
//		Approach 2:-with using sort method
		String str1 = "java Code";
		char charArray[] = str1.toCharArray();
		Arrays.sort(charArray);
        System.out.println("With Method :-"+new String(charArray));
	}

}
