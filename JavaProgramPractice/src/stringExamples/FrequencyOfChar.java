package stringExamples;

public class FrequencyOfChar {

	public static void main(String[] args) {
		String sentence="This website is awesome";
		char ch='e';
		int freq=0;
		
		for (int i=0;i<sentence.length();i++) {
			
			if(ch==sentence.charAt(i)) {
				freq++;
			}
			
		}
		System.out.println("Number of occurences for e is: 0"+freq);
		

	}

}
