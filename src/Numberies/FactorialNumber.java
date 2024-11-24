package Numberies;
//18.	Write a program for finding factorial of a number.
//num=3:- 1*2*3 =6
public class FactorialNumber {

	public static void main(String[] args) {
		int n=3,fact=1;
		
		for (int i=1;i<=n;i++) {
			fact=fact*i;
//			fact*=i;
		}
  System.out.println("Factorial Number:-"+fact);//6
	}

}
//Factorial Number:-6