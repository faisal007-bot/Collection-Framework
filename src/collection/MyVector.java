package collection;

//import java.util.Enumeration;
import java.util.Vector;

public class MyVector {
	public static void main(String[] args) {
//		underlying datastructure for vector is dynamic array or resizable array
//		it implements the random access interface and it is synchronized
//		multiple null values and duplicate values are allowed
//		better only if thread safety is required otherwise using arraylist is best choice
//		better for data retrieval
//		it implements the list interface and insertion order is preserved
//		it is legacy class
		
//		contructors of the vector
		
//		default constructor with 10 capacity
//		Vector<Integer> v = new Vector<Integer>();
		
//		constructor with provided initial capacity
//		Vector<Integer> v1 = new Vector<Integer>(100);
		
//		constructor with provided initial capacity and increment value
//		Vector<Integer> v2 = new Vector<Integer>(20, 5);
		
//		constructor with the provided collection object
//		Vector<Integer> v3 = new Vector<Integer>(v2);
		
//		it contains all the methods of the list and collection through inheritance
		
//		adding some elements to perform operations
		Vector<Integer> v = new Vector<Integer>();
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(7);v1.add(87);v1.add(6);v1.add(3);v1.add(1);v1.add(3);
		v.add(57);v.add(8);v.add(46);v.add(6);v.add(46);v.add(57);
		v.addAll(v1);
//		System.out.println(v);
		
//		methods of the vector
		
//		adds the element at the end of the collection
//		v.addElement(1);
		
//		returns the current capacity of the collection
//		int capacity = v.capacity();
		
//		returns the element present at the provided index
//		Integer element = v.elementAt(1);
		
//		elements returns the object of enumeration to 
//		iterate over the elements present in the collection
//		Enumeration<Integer> e = v.elements();
//		while(e.hasMoreElements()) {
//			System.out.print(e.nextElement()+" ");
//		}
		
//		returns the element present at the start of the collection
//		System.out.println(v.firstElement());
		
//		inserts the element at the provided index
//		this method takes index as a second parameter and value as a first parameter
//		v.insertElementAt(100, 0);
		
//		returns the element present at the end of the collection
//		System.out.println(v.lastElement());
		
//		removes all the elements present in the collection
//		v.removeAllElements();
		
//		removes the first occurence of the element from the collection
//		v.removeElement(57);
		
//		removes the element present at the provided index
//		v.removeElementAt(1);
		
//		sets the new value at the provided index
//		1st parameter = value and 2nd parameter = index
//		v.setElementAt(700, 0);
		
//		sets the new size of the collection 
		
//		if the size is less than current size then all the elements greater than current
//		new size will be removed
//		v.setSize(5);
//		System.out.println(v);
		
//		if the new size is greater than current size then all the new indexes will be 
//		filled with null
//		v.setSize(20);
//		System.out.println(v);
	}
}
