package string;

public class CharWithOccuraceAndReplace {

	public static void main(String[] args) {
		 
		String input ="opentext";
		
		char charToReplace='t';
//		expected output = open1ex2
		
//		check char present in string or not
		if(input.indexOf(charToReplace)==-1) {
			System.out.println("Given Character Not Available In Input String...");
			System.exit(0);
		}
		
//		Logic to replace char occurance in string
		char []arr=input.toCharArray();
		int cnt =1 ;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==charToReplace) {// o==t p==t e==t n==t t==t
				arr[i] = String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(arr);//open1ex2
		
		
		
//		Another way  is Using function
		int cnts =1 ;
		for(int i=0;i<input.length();i++) {
			char ch =input.charAt(i);
			if(ch==charToReplace) {//t==t>1 t==t>2
//				input=input.replace(String.valueOf(charToReplace),String.valueOf(cnts));
				input=input.replaceFirst(String.valueOf(charToReplace),String.valueOf(cnts));
				cnts++;
			}
		}
		System.out.println(input);

	}

}
