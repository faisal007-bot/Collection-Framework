package collection;

import java.util.Comparator;
//import java.util.SortedSet;
import java.util.TreeSet;

public class MyTreeset {
//	underlying datastructure for treeset is binary tree
//	elements are stored on the basis of natural sorting order or custom sorting order
//	duplicates are not allowed and null insertion is not possible
//	only homogenous elements are allowed
//	for heterogenous objects default sorting throws exception
//	all the elements of the treeset must be homogenous and must impleement the comparable
//	interface for comparison
//	it is non synchronized
//	it implements the collection, set , sortedset and navigableset interface
//	all the methods of collection set , sortedset and navigableset is inherited
//	better for searching related operations
	public static void main(String[] args) {
		
//		constructors of the treeset
		
//		it creates an empty treeset object
//		TreeSet<Integer> ts = new TreeSet<Integer>();
		
//		it creates treeset object using another collection
//		TreeSet<Integer> ts1 = new TreeSet<Integer>(ts);
		
//		treeset object using comparator
//		SortedSet<Integer> ts2 = new TreeSet<Integer>(new MyComparator2());
		
//		it cretaes treeset object using the sortedset object
//		TreeSet<Integer> ts3 = new TreeSet<Integer>(ts2);
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(67);ts.add(7);ts.add(9);ts.add(90);ts.add(76);
		System.out.println(ts);
		
//		methods of the treeset
		
//		treeset doesnt contains any of its own specific methods
		
	}
}
class MyComparator2 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return 0;
	}
	
}
