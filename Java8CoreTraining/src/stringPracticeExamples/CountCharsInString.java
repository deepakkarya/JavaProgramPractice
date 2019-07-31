package stringPracticeExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharsInString {

	public static void main(String[] args) {
		
		String str="This is sample for char count in string";
		countCharInString(str);

	}
	//hash set and map use hash code and won't give result in sequence

	private static void countCharInString(String str) {
		
		Map<Character,Integer> charCountMap=new HashMap<Character,Integer>();
		
		for(int i=0;i<=str.length()-1;i++) {
			
			char c=str.charAt(i);
			if(c==' ') {
				continue;
			}
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			}else {
				charCountMap.put(c, 1);
			}
			
		}
		//System.out.println("characters and their occurences are"+charCountMap);
		
		Set<Character> keys=charCountMap.keySet();
		for(Character key:keys) {
			System.out.println("Occurence of character: "+key+" is "+charCountMap.get(key));
		}
		
	}

}
