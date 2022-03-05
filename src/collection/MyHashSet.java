package collection;

import java.util.HashSet;

public class MyHashSet {
//	underlying data structure for hashset in hashtable
//	elements are inserted based on their hashcode
//	hashing related algorithms are better for search operations
//	duplicate values are not allowed and only one null element is allowed
//	insertion order is not preserved and it is non synchronized
//	implements set and collection interface
//	inherits all the methods of the set and collection interface
	public static void main(String[] args) {
		
//		load factor means at which ratio the new set object will be created 
//		0.75 specifies at 75% new hashset will be created
		
//		constructors of the hashset
		
//		constructor with default initial capacity of 16 and load factor of 0.75
//		HashSet<Integer> hs = new HashSet<Integer>();
		
//		constructor with provided initial capacity and load factor of 0.75
//		HashSet<Integer> hs1 = new HashSet<Integer>(100);
		
//		constructor with provided initial capacity and provided load factor
//		HashSet<Integer> hs2 = new HashSet<Integer>(100,0.3f);
		
//		constructor to create the hashset using provided collection object
//		HashSet<Integer> hs3 = new HashSet<Integer>(hs);
		
//		adding some elements to perform operations on hashset
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(47);hs.add(58);hs.add(null);hs.add(78);hs.add(47);
//		if we try to duplicate it will return false and element wont be inserted
//		it doesnt throws any compile or runtime exceptions
		System.out.println(hs);
		
//		hashset doesnt contain any of its specific methods
	}
}
