package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Vector;

public class MyIteration {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(12);
		v.add(42);
		v.add(56);
		v.add(67);
		v.add(90);
		
//		iterating using for loop
		System.out.println("iterating using for loop");
		for(int i=0;i<v.size();i++) {
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		
//		iterating using while loop
		int i=0;
		System.out.println("iterating using while loop");
		while(i<v.size()) {
			System.out.print(v.get(i)+" ");
			i++;
		}
		System.out.println();
		
//		iterating using do while loop
		int j=0;
		System.out.println("iterating using do while loop");
		do {
			System.out.print(v.get(j)+" ");
			j++;
		}while(j<v.size());
		System.out.println();
		
//		iterating using for each loop
		System.out.println("iterating using for each loop");
		for(Integer x:v) {
			System.out.print(x+" ");
		}
		System.out.println();
		
//		iterating using foreach method
		System.out.println("iterating using foreach method");
		v.forEach(element->System.out.print(element+" "));
		System.out.println();
		
//		iterating using enumeration
		System.out.println("iterating using enumeration");
		Enumeration<Integer> enumeration = v.elements();
		while(enumeration.hasMoreElements()) {
			System.out.print(enumeration.nextElement()+" ");
		}
		System.out.println();
		
//		iterating using iterator
		System.out.println("iterating using iterator");
		Iterator<Integer> itr = v.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
//		iterating using listiterator
		System.out.println("iterating using listiterator");
		ListIterator<Integer> litr = v.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();
//		iterating using spliterator
		System.out.println("iterating using spliterator`s foreachremaining method");
		Spliterator<Integer> sitr = v.spliterator();
		sitr.forEachRemaining(element->System.out.print(element+" "));
		System.out.println();
	}
}
