import java.util.HashMap;
import java.util.Map;

public class HashMapFunctions {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		//functionality of put() function
		hashMap.put(1, "Ajay");
		hashMap.put(2, "Priya");
		hashMap.put(3, "Asha");
		hashMap.put(4,"Navin");
		System.out.println("HashMap of the given data is: "+hashMap);
		
		//functionality of the get() function
		String result = hashMap.get(2);
		System.out.println("The value for the given key is: "+result);
		
		//functionality of the containsKey() function
		System.out.println(hashMap.containsKey(3));
		
		//functionality of the remove() function
		hashMap.remove(3);
		System.out.println("Updated Hashmap : "+hashMap);
		
		//Iterating using the loop
		for(Map.Entry<Integer, String> e : hashMap.entrySet()) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	}
}
