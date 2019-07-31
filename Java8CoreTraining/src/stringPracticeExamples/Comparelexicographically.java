package stringPracticeExamples;

public class Comparelexicographically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "This is Exercise 3";                                                                                  
		String str2= "THIS IS EXERCISE 2";
		
		int result=str1.compareToIgnoreCase(str2);
		if(result<0) {
			System.out.println("\"" + str1 +"\"" + " is less than " + "\"" +  str2 +"\""  );
		}
		else if (result==0) {System.out.println("String1 is equal string2 ");}
		else if (result>0) {System.out.println("String1 is greater than string2 ");}
	}

}
