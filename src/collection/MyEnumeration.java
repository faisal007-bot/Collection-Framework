package collection;

import java.util.Enumeration;
import java.util.Vector;

public class MyEnumeration {
	public static void main(String[] args) {
		
//		enumeration 
//		it can be only used with legacy class for iteration 
//		it contains 2 methods
//		hasMoreElements() and nextElement()
		Vector<Integer> vector = new Vector<Integer>();
		vector.addElement(47);
		vector.addElement(7);
		vector.addElement(847);
		vector.addElement(40);
		vector.addElement(45);
		
//		getting the object of enumeration for iterating the collection
		Enumeration<Integer> enumeration = vector.elements();
		
//		hasMoreElement() returns boolean if more elements are present in the collection then
//		it returns true else it returns falls and stops iteration
		while(enumeration.hasMoreElements()) {
			
//			nextElement() returns the next element present in the collection
			System.out.print(enumeration.nextElement()+"\t");
		}
	}
}
