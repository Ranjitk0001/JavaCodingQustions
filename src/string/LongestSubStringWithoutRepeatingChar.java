package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeatingChar {

	public static void main(String[] args) {
		LengthOfLongestSubString("abbac"); 

	}
	
	public static void LengthOfLongestSubString(String s) {
		String LongestSubString =null;
		int LongestSubStringLength=0;
		Map<Character,Integer>map=new LinkedHashMap<>();
		
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			
			if(!map.containsKey(ch)) {
				map.put(ch,i);//a=0 b=1 c=2
			}
			else {
				i=map.get(ch);
				map.clear();
			}
			
		  if(map.size() > LongestSubStringLength) {
			  LongestSubStringLength=map.size();
			  LongestSubString=map.keySet().toString();
		  }	
		}
		
		System.out.println("The Longest subString :-"+ LongestSubString);
		System.out.println("The Longest subString Length:"+LongestSubStringLength);
	}

}

//The Longest subString :-[b, a, c]
//The Longest subString Length:3

