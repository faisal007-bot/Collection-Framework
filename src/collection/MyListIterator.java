package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class MyListIterator {
	public static void main(String[] args) {
//		listiterator is used to iterate over the elements of the list only 
//		we cant use it on other classes except list
//		it contains various methods
//		hasNext(),next(),nextIndex()
//		hasPrevious(),previous(),previousIndex()
//		add(),remove(),set()
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(46);
		al.add(54);
		al.add(13);
		al.add(99);
		al.add(75);
		al.add(56);
		System.out.println(al);
		
//		iterating the list in the forward direction
		
//		getting the object of listIterator
		ListIterator<Integer> litr = al.listIterator();
		
//		checks whether list contains more elements or not
		while(litr.hasNext()) {
			
//			returns the index of the element and element respectively
			System.out.print("["+litr.nextIndex()+" = "+litr.next()+"]");
		}
		
//		iterating the list in the backward direction
		
//		getting the object of listiterator
		ListIterator<Integer> litr2 = al.listIterator(al.size());
		
//		checks whether list contains more element
		System.out.println();
		while(litr2.hasPrevious()) {
//			returns the index of the element and element respectively
			System.out.print("["+litr2.previousIndex()+" = "+litr2.previous()+"]");
		}
		
//		performing operation on the list
		System.out.println();
		
//		getting the object of listiterator
		ListIterator<Integer> litr3 = al.listIterator();
		
//		checks whether list contains more element or not
		while(litr3.hasNext()) {
			
//			returns the next element
			Integer element = litr3.next();
			
			if(element==13) {
//				removes the element from the list
				litr3.remove();
			}
			else if(element==99) {
//				adds the element after the current element
				litr3.add(10000);
			}
			else if(element==46) {
//				changes the value of the element
				litr3.set(1);
			}
		}
		System.out.println(al);
	}
}
