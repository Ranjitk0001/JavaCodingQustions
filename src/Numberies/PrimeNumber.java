package Numberies;
//17.	Write a program to find prime number.
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		// scanner.close();  
		if (number % 2 == 0) {
			System.out.println("It is not prime Number:-" + number);
		} else {
           System.out.println("It is  prime Number:-" + number);
		}

	}

}
//It is  prime Number:-7