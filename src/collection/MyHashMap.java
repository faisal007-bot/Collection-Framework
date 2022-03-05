package collection;

import java.util.HashMap;
//import java.util.Map;

public class MyHashMap {
//	underlying data structure for hashmap is hashtable
//	objects are stored on the basis of the hashcode of key hence search operation is quite fast
//	duplicate keys are not allowed but duplicate values are allowed
//	only one null key is allowed but multiple null values are allowed
//	insertion order is not preserved
//	it is non synchronized
//	it implements the map cloneable and serializable interface
	public static void main(String[] args) {
		
//		constructors of hashmap
		
//		default constructor with capacity 16 and load factor of 0.75
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
//		constrcutor with provided initial capacity and load factor of 0.75
//		HashMap<Integer, String> hm1 = new HashMap<Integer, String>(45);
		
//		constructor with provided initial capacity and provided load factor
//		HashMap<Integer, String> hm2 = new HashMap<Integer, String>(34, 0.5f);
		
//		constructor with provided map object
//		HashMap<Integer, String> hm3 = new HashMap<Integer, String>(hm2);
		
//		adding some elements to perform hashmap methods
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		HashMap<Integer, String> hm1 = new HashMap<Integer,String>();
		hm.put(34, "lacentix");hm.put(67, "cipher");hm.put(7, "neko");
		hm.put(3, "faiz");hm.put(9, "deadeye");
		System.out.println(hm);
		hm1.put(320, null);hm1.put(372, "decode");hm1.put(332, "encrypt");
		
//		hashmap contains only one specific method
		
//		clone method is used to create the shallow clone of the provided map
//		Object clone = hm.clone();
//		System.out.println(clone);
		
	}
}
