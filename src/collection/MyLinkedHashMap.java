package collection;

import java.util.LinkedHashMap;

public class MyLinkedHashMap {
//	underlying data structure for linkedhashmap is hashtable and linkedlist
//	it uses hashcode of the keys to store them and it uses the linkedlist to maintain
//	the insertion order 
//	it uses hashing algorithm hence search operation is quite fast in linkedhashmap
//	duplicate keys are not allowed but duplicate values are allowed
//	only single null key is allowed but multiple null values are allowed
//	it is non synchronized
//	insertion order is preserved
//	it implements the map , cloneable and serializable interface
//	all the methods of the map interface is inherited in it
	public static void main(String[] args) {
		
//		constructors of linkedkashmap
		
//		default constructor with capacity 16 and load factor of 0.75
//		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
		
//		constrcutor with provided initial capacity and load factor of 0.75
//		LinkedHashMap<Integer, String> hm1 = new LinkedHashMap<Integer, String>(45);
		
//		constructor with provided initial capacity and provided load factor
//		LinkedHashMap<Integer, String> hm2 = new LinkedHashMap<Integer, String>(34, 0.5f);
		
//		constructor with provided map object
//		LinkedHashMap<Integer, String> hm3 = new LinkedHashMap<Integer, String>(hm2);
		
//		adding some elements to perform hashmap methods
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer,String>();
		LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<Integer,String>();
		lhm.put(34, "lacentix");lhm.put(67, "cipher");lhm.put(7, "neko");
		lhm.put(3, "faiz");lhm.put(9, "deadeye");
		System.out.println(lhm);
		lhm1.put(320, null);lhm1.put(372, "decode");lhm1.put(332, "encrypt");
		
//		it doesnt contain any new methods
	}
}
