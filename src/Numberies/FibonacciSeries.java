package Numberies;
//19.	Write a program for Fibonacci series.
public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,total;
		int n=5;
		System.out.print(a+" "+b+" ");
		for(int i=0;i<=n;i++) {
			total=a+b;
			System.out.print(total+" ");//0 1 1 2 3 5 8 13 
			a=b;
			b=total;
			
		}

	}

}

//0 1 1 2 3 5 8 13 