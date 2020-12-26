package collectionGenerics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTable {

	public static void main(String[] args) {
		
		Map<String,String> phoneBook =new HashMap<>();
		phoneBook.put("Deepak", "240-907-4444");
		phoneBook.put("Anil", "713-252-1907");
		phoneBook.put("Rahul", "914-654-5555");
		
		Set<String> sPhone=phoneBook.keySet();
		for(String s:sPhone) {
			System.out.println(s+"'s phone number is: "+phoneBook.get(s));
		}
		
		//entry is the interface inside map interface and in map we have method entry set which gives us set of entries
		
		Set<Map.Entry<String, String>> values=phoneBook.entrySet();
		for(Map.Entry<String, String> e: values) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		//hashmap is not thread safe and unsynchronized but hash table is thread safe and synchronized.
		//hash map is fast but table is slow
		//map works with single thread but table works with multiple threads
		//map allows one null key entry but table doesn't allow null key entry
		

	}

}
