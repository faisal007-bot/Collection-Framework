package collection;

//import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class MyMap {
// if we want to store objects in the form of key and value then map is a good choice
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer,String>();
		Map<Integer, String> m1 = new HashMap<Integer,String>();
		m.put(34, "lacentix");m.put(67, "cipher");m.put(7, "neko");
		m.put(3, "faiz");m.put(9, "deadeye");
		System.out.println(m);
		m1.put(320, null);m1.put(372, "decode");m1.put(332, "encrypt");
		
//		clear method is used to remove all the elements present in the map
//		m.clear();
		
//		checks whether provided key is present or not
//		boolean containsKey = m.containsKey(7);
		
//		checks whether provided value is present or not
//		boolean containsValue = m.containsValue("deadeye");
		
//		returns the set of entry which contains key and value pairs
//		we can iterate over the set of entry using the map.Entry inner interface
//		it contains getKey() and getValue() methods to get the key and value of the 
//		each individual object 
//		bcoz each key and value pair in map is known as an Entry
//		Set<Entry<Integer, String>> entrySet = m.entrySet();
//		for(Map.Entry<Integer, String> es:entrySet) {
//			System.out.println(es.getKey()+" "+es.getValue());
//		}
		
//		it checks whether the provided map is equal to the this map using the reference 
//		comparison if both the maps contains the same reference elements then it returns 
//		true else it returns false
//		boolean equals = m.equals(m1);
//		System.out.println(equals);
		
//		foreach method is used to iterate over the elements of the provided map
//		it takes 2 parameters key and value for map object
//		m.forEach((k,v)->System.out.println(k+" "+v));
		
//		it returns the value mapped to the provided key
//		String value = m.get(67);
//		System.out.println(value);
		
//		it returns the value mapped with the provided key 
//		if the provided key is not mapped with any any then it will return the default value
//		String value = m.getOrDefault(65, "not present");
//		System.out.println(value);
		
//		it checks whether the map is empty or not
//		boolean empty = m.isEmpty();
//		System.out.println(empty);
		
//		it returns the set representation of the keys present in the map
//		Set<Integer> keySet = m.keySet();
//		keySet.forEach(k->System.out.print(k+" "));
		
//		put method is used to insert the key and value in the map
//		m.put(null, null);
//		System.out.println(m);
		
//		putAll method is used to insert provided map into this map
//		m.putAll(m1);
//		System.out.println(m);
		
//		it inserts the key and value only if the key is not present in the map
//		m.putIfAbsent(35, "duplicate");
		
//		remove method removes the entry of the provided key from the map
//		m.remove(34);
		
//		it removes the entry from the map only if the provided key and value matches in the map
//		m.remove(7, "nek");

//		it replaces the value of the provided key with the provided value
//		m.replace(34, "changed");
		
//		it replaces the value of the provided key only if the provided key and value matches
//		the entry present in the map else value will not be changed
//		m.replace(34, "lacentix", "changed");
		
//		it returns the current size of the map
//		int size = m.size();
//		System.out.println(size);
		
//		it returns the string representation of the map
//		String string = m.toString();
//		System.out.println(string);
		
//		it returns the collection representation of all the values present in the map
//		Collection<String> values = m.values();
//		values.forEach(element->System.out.print(element+" "));
	}
}
