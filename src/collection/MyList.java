package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.ListIterator;

public class MyList {
//	duplicate values are allowed and  insertion order is preserved
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> l1 = new ArrayList<Integer>();
		
//		adding some elements to perform operations
		l1.add(7);l1.add(87);l1.add(6);l1.add(3);l1.add(1);l1.add(3);
		l.add(57);l.add(8);l.add(46);l.add(6);l.add(46);l.add(57);
		
//		add method is used to add the element at the provided index
//		l.add(1, 10);
//		System.out.println(l);
		
//		addAll method is used to add the another collection into this collection at 
//		the provided index
		l.addAll(2, l1);
		System.out.println(l);
		
//		get method returns the element present at the provided index
//		Integer element = l.get(4);
//		System.out.println("element present at the provided index = "+element);
		
//		indexOf method returns the index of the first occurance of the provided element
//		int index = l.indexOf(57);
//		System.out.println("first index of the provided element = "+index);
		
//		lastIndexOf method returns the index of the last occurance of the provided element
//		int lastIndex = l.lastIndexOf(57);
//		System.out.println("last index if the provided element = "+lastIndex);
		
//		listIterator returns the object of listiterator over the provided collection
//		it is applicable only for list and its classes
		
//		it returns listiterator pointing to the first element
//		ListIterator<Integer> litr = l.listIterator();
		
//		it returns listiterator pointing to the element present at the provided index
//		ListIterator<Integer> litr = l.listIterator(l.size());
		
//		while(litr.hasPrevious()) {
//			System.out.print(litr.previous()+" ");
//		}
		
//		remove method removes the element present at the provided index
//		l.remove(3);
//		System.out.println(l);
		
//		remove method also removes the provided element but in case of numeric
//		datatypes if we directly pass the number it will treat it as an index so we need
//		to typecast the object into the specific wrapper class object using the valueOf 
//		method then it will treat it as an value otherwise it will treat it as an index
//		l.remove(Integer.valueOf(3));
//		System.out.println(l);
		
//		set method is used to set the new value at the provided index
//		l.set(0, 100);
//		System.out.println(l);
		
//		sort method is used to sort the collection using the provided comparator object
//		l.sort(new MyComparator());
//		System.out.println(l);
		
//		sublist method is used to get the sub list of elements from the start to end-1 index
//		List<Integer> subList = l.subList(5, l.size()-1);
//		System.out.println(subList);
	}
}
class MyComparator implements Comparator<Integer>{
	@Override
	public int compare(Integer i1, Integer i2) {
		if(i1>i2)
			return -1;
		else if(i1<i2)
			return 1;
		else 
			return 0;
	}
}
