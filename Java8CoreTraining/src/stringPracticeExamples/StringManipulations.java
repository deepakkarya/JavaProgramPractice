package stringPracticeExamples;

public class StringManipulations {

	public static void main(String[] args) {
		String str="Hello_world_test_selenium";
		
		String strArray[]=str.split("_");
		for (String s:strArray) {
			System.out.println(s);
		}
		String str1="Hello";
		String str2="Hello";
		String str3="HELLO";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		String stArray[]= {"Deepak", "keep","studying"};
		String stString="";
		
		for(String s:stArray) {
			stString=stString+s+" ";
		}
		System.out.println("Concatenated string is:"+stString);
		
		String pStr="AMMH";
		String rpStr="";
		int len=pStr.length();
		for(int i=len-1;i>=0;i--) {
			rpStr=rpStr+pStr.charAt(i);
		}
		System.out.println("String is palindrome: "+pStr.contentEquals(rpStr));

	}

}
