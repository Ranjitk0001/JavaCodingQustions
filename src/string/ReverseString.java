package string;

public class ReverseString {
public static void main(String[] args) {
	String str="hello";
//	Without calling method is approach 1&2
//	Approach -1:- Using toCharArray() method.
	char[] chArr=str.toCharArray();
	for(int i=chArr.length-1;i>=0;i--) {
//		System.out.println(chArr[i]);
		System.out.print(chArr[i]);
	}
	
	System.out.println("");
//	Approach 2:- Using chartAt(int index) method.
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));//olleho
	}
	System.out.println("");
//	Approach 3:- Using java.lang.StringBuffer class provided reverse() method.
	StringBuffer sb= new StringBuffer(str);
	System.out.println(sb.reverse());
	
//	Approach 4:-Using java.lang.StringBuilder class provided reverse() method.
	StringBuilder sbuilder=new StringBuilder(str);
	System.out.println(sbuilder.reverse());
}
}
