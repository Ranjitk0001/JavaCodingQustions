package Numberies;
//20.	Write a program for Armstrong number.:- 0, 1, 153 , 370 , 371, 407
/*no -153 -> length=3
 * 1:-1*1*1=1
 * 5:-5*5*5=125
 * 3:-3*3*3=17 
 * */
public class ArmstrongNumber {

	public static void main(String[] args) {
		int no=153;
		int len=0;
		int t1=no;
		
		while(t1!=0) {
			len=len+1;
			t1=t1/10;
		}
		
		int t2=no;
		int arm=0;
		int rem;
		while(t2!=0) 
		{
			int mul=1;
		    rem=t2%10;
			for(int i=1;i<=len;i++) 
			{
				mul=mul*rem;
			}
			arm=arm+mul;
			t2=t2/10;
		}

		if(arm==no) {
			System.out.println(no+" is armstrong");
		}else {
			System.out.println(no+" is not armstrong");
		}
	}
	

}
