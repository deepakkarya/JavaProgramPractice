package stringExamples;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String sentence="This is test   for removal of white spaces ";
		System.out.println("Original sentence is: "+sentence);
		
		sentence=sentence.replaceAll("\\s", "");
		System.out.println("New sentence is: "+sentence);
		

	}

}
