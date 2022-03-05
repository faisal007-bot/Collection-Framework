package collection;

import java.util.ArrayList;

public class MyArrayList {
	public static void main(String[] args) {
//		underlying datastructure for arraylist is dynamic array or resizable array
//		it implements the random access interface and its non synchronized
//		it allows multiple null values and duplicate values 
//		it maintains insertion order
//		it implements the list interface
//		better for data retrieval worst for data manipulation
		
//		constructors of arraylist
//		it creates the arraylist object with 10 capacity
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		it creates the arraylist object with provided initial capacity
//		ArrayList<Integer> al1 = new ArrayList<Integer>(100);
//		it creates the arraylist object with provided collection object
//		ArrayList<Integer> al2 = new ArrayList<Integer>(al);
		
//		adding some elements to perform operations
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(7);al1.add(87);al1.add(6);al1.add(3);al1.add(1);al1.add(3);
		al.add(57);al.add(8);al.add(46);al.add(6);al.add(46);al.add(57);
		al.addAll(al1);
		System.out.println(al);
		
//		only 3 new methods present in the arraylist rest of the methods are inherited 
//		from collection and list interface
		
//		clone method is used to create the shallow cloned object of the provided collection
//		Object clone = al.clone();
//		System.out.println(clone);
		
//		it increases the capacity according the provided value
//		mostly used if we created the collection object using default constructor
//		al.ensureCapacity(20);
		
//		it reduces the capacity of the collection to the current size of the collection
//		al.trimToSize();
	}
}
