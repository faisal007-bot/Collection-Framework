package collection;

import java.util.NavigableSet;
//import java.util.Set;
import java.util.TreeSet;

public class MyNavigableSet {
//	navigableset contains methods related to perform navigation in the collection object
//	all the methods of the collection set and sortedset are inherited in navigableset
	public static void main(String[] args) {
		
//		adding some elements to perform navigableset methods on it
		NavigableSet<Integer> ns = new TreeSet<Integer>();
		ns.add(47);ns.add(58);ns.add(57);ns.add(12);ns.add(89);
		System.out.println(ns);
		
//		methods of the navigableset
		
//		it returns the provided element if it is present in the collection
//		it returns the element present after the provided element if the provided
//		element is not present in the collection
//		Integer ceiling = ns.ceiling(23);
//		System.out.println(ceiling);
		
//		it returns the provided element if it is present in the collection
//		it returns the element present before the provided element if the provided
//		element is not present in the collection
//		Integer floor = ns.floor(23);
//		System.out.println(floor);
		
//		it returns the elements of the provided collection in reverse sorting order 
//		reverse order of the provided sorting order
//		it returns set object
//		Set<Integer> descendingSet = ns.descendingSet();
//		System.out.println(descendingSet);
		
//		it returns the elements present before the provided element 
//		if the provided element is present it will be included in the headset
//		if the provided element is not present all the elements present before the provided
//		element will be returned in the headset
//		it takes 2 parameters 1st- element and 2nd- boolean value whether to include or exclude the
//		provided element in the headset
//		false = exclude && true = include
//		NavigableSet<Integer> headSet = ns.headSet(47, true);
//		System.out.println(headSet);
		
//		it returns the elements present after the provided element 
//		if the provided element is present it will be included in the headset
//		if the provided element is not present all the elements present after the provided
//		element will be returned in the headset
//		it takes 2 parameters 1st- element and 2nd- boolean value whether to include or exclude the
//		provided element in the headset
//		false = exclude && true = include
//		NavigableSet<Integer> tailSet = ns.tailSet(47, false);
//		System.out.println(tailSet);
		
//		it returns the element present after the provided element
//		if the provided element present still it will return the element present after it
//		if the provided element is not present then it will return the element after the
//		provided element
//		Integer higher = ns.higher(45);
//		System.out.println(higher);
		
//		it returns the element present before the provided element
//		if the provided element present still it will return the element present before it
//		if the provided element is not present then it will return the element before the
//		provided element
//		Integer lower = ns.lower(45);
//		System.out.println(lower);
		
//		it removes the first element of the collection
//		ns.pollFirst();
//		System.out.println(ns);
		
//		it removes the last element of the collection
//		ns.pollLast();
//		System.out.println(ns);
		
//		it takes 4 parameters
//		1st- to element 2nd-boolean inclusive or exclusive
//		3rd- till element 4th-boolean inclusive or exclusive
//		if the provided start element is not present then elements after this will be included
//		if the provided end element is not present then elements before this will be included
//		NavigableSet<Integer> subSet = ns.subSet(23, true, 89, true);
//		System.out.println(subSet);
	}
}
