package collection;

import java.util.ArrayList;
import java.util.Collection;
//import java.util.Iterator;
//import java.util.Spliterator;

public class MyCollection {
	public static void main(String[] args) {
		
		Collection<Integer> c = new ArrayList<Integer>();
		Collection<Integer> c1 = new ArrayList<Integer>();
		c1.add(7);c1.add(87);c1.add(6);c1.add(3);c1.add(1);c1.add(3);
		
		
//		methods of collection class and all the classes of the collection framework contains 
//		these methods except the map interface and its implemented classes
//		all collection classes implements the cloneable and serializable interface
		
//		add method is used to add the element at the end of the collection
		c.add(57);c.add(8);c.add(46);c.add(6);c.add(46);c.add(57);
//		System.out.println(c);
		
//		addAll method is used to add another at the end of collection into this collection 
		c.addAll(c1);
//		System.out.println(c);
		
//		clear method is used to remove all the elements present in the collection
//		c.clear();
//		System.out.println(c);
		
//		contains method checks whether the provided object is present or not
//		boolean isPresent = c.contains(57);
//		System.out.println("element is present ? "+isPresent);
		
//		containsAll method check whether this collection contains the provided collection or not
//		boolean containsAll = c.containsAll(c1);
//		System.out.println("another collection is present ? "+containsAll);
		
//		it checks whether both the collection contains the same objects using the 
//		reference conparison of object class
//		boolean equals = c.equals(c1);
//		System.out.println(equals);
		
//		foreach method is used to iterate over the elements of the collection
//		c.forEach(element->System.out.print(element+" "));
		
//		checks whether the collection is empty or not
//		boolean isEmpty = c.isEmpty();
//		System.out.println("collection is empty ? "+isEmpty);
		
//		it returns the iterator object for the collection object
//		Iterator<Integer> itr = c.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//		}
		
//		remove method is used to remove the first occurence of the provided element
//		c.remove(57);
//		System.out.println(c);
		
//		removeAll method is used to remove the provided collection from this collection
//		c.removeAll(c1);
//		System.out.println(c);
		
//		removeIf method removes all the elements that satisfies the provided condition or predicate
//		c.removeIf(a->a%2==0);
//		System.out.println(c);
		
//		removes all the elements of the this collection that are not present in the provided collection
//		c.retainAll(c1);
//		System.out.println(c);
		
//		returns the current size of the collection
//		int size = c.size();
//		System.out.println("size of the collection = "+size);
		
//		spliterator method returns the object of spliterator which is used for iteration
//		Spliterator<Integer> sitr = c.spliterator();
//		for(int i=0;i<c.size();i++) {
			
//			tryAdvance method is used to iterate over the collection
//			sitr.tryAdvance(e->System.out.print(e+" "));
//		}
		
//		foreachremaining method is also used to iterate over the elements of the collection
//		sitr.forEachRemaining(e->System.out.print(e+" "));
		
//		toarray method is used to convert the collection into the object array
//		Object[] array = c.toArray();
//		for(Object o:array) {
//			System.out.print(o+" ");
//		}
		
//		toString method is used to convert the collection into the string
//		String string = c.toString();
//		System.out.println(string);
	}
}
