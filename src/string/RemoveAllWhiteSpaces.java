package string;

public class RemoveAllWhiteSpaces {
public static void main(String[] args) {
	
	String str ="  j a va s t   ar";
	System.out.println(str);
	
	String str1=str.replaceAll("\\s","");//by Using Unique cade
	System.out.println(str1);
	
	
}
}
