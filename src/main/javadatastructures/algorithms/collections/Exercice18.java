package javadatastructures.algorithms.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercice18 {
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Kristian");
		map.put("family name", "Larssen");
		map.put("address", "Jumping Rd");
		map.put("mobile", "555-12345");
		map.put("pet", "cat");
		
		Iterator<Map.Entry<String, String>> iterator= map.entrySet().iterator();
		
		while (iterator.hasNext()) {
			Map.Entry<String,String> entry = (Map.Entry<String,String>) iterator.next();
			System.out.println("key="+entry.getKey());
			System.out.println(",value=" + entry.getValue());
			
		}
	}

}
