package string;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {
	public static void main(String[] args) {
		String input= "hello";
		Map<Character,Integer> map =new HashMap();
		char chars[]=input.toCharArray();
		
		for(char ch:chars) {
			if(!map.containsKey(ch)) {
				map.put(ch,1);
			}
			else {
				int value=map.get(ch);
				map.put(ch,value+1);
			}
		}//end of for loop
		System.out.println(map);//{e=1, h=1, l=2, o=1} order is not maitain cause HashMap
		
	}

}
