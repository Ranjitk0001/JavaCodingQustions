package arrays;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int a[] = { 1, 4, 3, 5, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(a[i]>a[j]) {
					//swap
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(a));// [1, 2, 3, 4, 5, 6]
		
		Arrays.sort(a);
		System.out.println("Sort Arrays In-built Method:-"+Arrays.toString(a));
	}

}
