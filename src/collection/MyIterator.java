package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class MyIterator {
	public static void main(String[] args) {
//		Iterator is used to iterate over the elements of the collection
//		it is an universal iterator which is applicable for all classes of the collection except map
//		it contains 3 methods --> hasNext() , next() , remove()
//		iterating list
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(12);
		arrayList.add(42);
		arrayList.add(56);
		arrayList.add(67);
		arrayList.add(90);
		System.out.println(arrayList);
		
//		getting the object of iterator
		Iterator<Integer> itr = arrayList.iterator();
		
//		it checks whether the collection contains more element or not
		while(itr.hasNext()) {
			
//			it returns the element of the collection
			Integer element = itr.next();
			if(element%2==0) {
//				it removes the element
				itr.remove();
			}
		}
//		now the all the elements will be removed who satisfies the condition
		System.out.println(arrayList);
		
//		 -------------------------------------------------------------
//		iterating legacy class
		Vector<Integer> v = new Vector<Integer>();
		v.add(12);
		v.add(42);
		v.add(56);
		v.add(67);
		v.add(90);
		System.out.println(v);
		
		Iterator<Integer> vitr = v.iterator();
		while(vitr.hasNext()) {
			Integer element = vitr.next();
			if(element%2!=0) {
				vitr.remove();
			}
		}
		System.out.println(v);
		
//		-----------------------------------------------------------------
//		iterating set using iterator
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(12);
		hs.add(42);
		hs.add(56);
		hs.add(67);
		hs.add(90);
		System.out.println(hs);
		
		Iterator<Integer> sitr = hs.iterator();
		while(sitr.hasNext()) {
			Integer element = sitr.next();
			if(element%5==0) {
				sitr.remove();
			}
		}
		System.out.println(hs);
		
	}
}
