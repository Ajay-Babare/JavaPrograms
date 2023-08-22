import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TypesOfMap {

	public static void main(String[] args) {
		//unordered
		HashMap<Integer, String> map = new HashMap<>();
		map.put(4, "Ajay");
		map.put(2, "Priya");
		map.put(9, "Siddharth");
		map.put(1, "Ram");
		System.out.println("HashMap class map output is : "+map);
		
		//order of insertion in preserved
		LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
		map1.put(4, "Ajay");
		map1.put(2, "Priya");
		map1.put(9, "Siddharth");
		map1.put(1, "Ram");
		System.out.println("LinkedHashMap class map output is : "+map1);
		
		//Sorted data on the basis of key
		TreeMap<Integer, String> map2 = new TreeMap<>();
		map2.put(4, "Ajay");
		map2.put(2, "Priya");
		map2.put(9, "Siddharth");
		map2.put(1, "Ram");
		map2.put(10, "Hyder");
		map2.put(5, "Shyam");
		System.out.println("TreeMap class map output is : "+map2);

	}

}
