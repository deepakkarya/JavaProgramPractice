package stringExamples;

public class ReverseString {
	

	public static void main(String[] args) {
		
		String sentence ="This is test for string reverse";
		String reversed =reverse(sentence);
		
		System.out.println("Original string is: "+sentence);
		System.out.println("Reversed string is: "+reversed);
	}

	private static String reverse(String sentence) {
		
		if(sentence.isEmpty()) {
			return sentence;
			}
		
		return reverse(sentence.substring(1))+sentence.charAt(0);
		
		
		}
		
		
	}

	