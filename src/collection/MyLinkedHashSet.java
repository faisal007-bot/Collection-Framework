package collection;

import java.util.LinkedHashSet;

public class MyLinkedHashSet {
//	underlying data structure for linkedhashset is hashtable and linkedlist
//	linkedlist data structure is used to maintain insertion order
//	elements are stored on the basis of their hashcode
//	duplicate values are not allowed and single null value is allowed
//	it is non synchronized and insertion order is preserved
//	better for searching related operations
//	implements set and collection interface
//	inherits all the methods of the set and  collection interface
	public static void main(String[] args) {
		
//		constructors of the linkedhashset
		
//		constructor with default initial capacity 16 and load factor of 0.75
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		
//		constructor with provided initial capacity and load factor of 0.75
//		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<Integer>(56);
		
//		constructor with provided initial capacity and provided load factor
//		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<Integer>(100, 0.5f);
		
//		constructor with the elements of the provided collection object
//		LinkedHashSet<Integer> lhs3 = new LinkedHashSet<Integer>(lhs2);
		
//		adding some elements to perform operations on linkedhashset
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(47);lhs.add(58);lhs.add(null);lhs.add(78);lhs.add(47);
//		if we try to duplicate it will return false and element wont be inserted
//		it doesnt throws any compile or runtime exceptions
		System.out.println(lhs);
		
//		linkedhashset doesnt contain any of its specific methods
	}
}
