package collection;

import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import collection.comparable.Student;
//import collection.comparator.IdComparator;
//import collection.comparator.NameComparator;

public class MyCollections {
	public static void main(String[] args) {
//		collections class provides various utility methods that are applicable for all
//		collection classes
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(6);al.add(76);al.add(7);al.add(9);al.add(8);al.add(47);al.add(5);al.add(47);
		
//		addAll() method is used to add multiple values in the provided collection
//		it adds the element at the end of the collection
//		Collections.addAll(al, 12,4,4,1,3412,3);
//		System.out.println(al);
		
//		checkedCollection() method returns a type safe representation of collection 
//		it throws exception at the compile time if we try to add any other type of object into it
//		this method is applicable for list set sortedset navigableset map sortedmap and navigablemap
//		Collection<Integer> checkedCollection = Collections.checkedCollection(al, Integer.class);
		
//		copy() method copies all the objects of one list into another list
//		the size of the destination and source list must be same or destination list must be larger
//		than source list else it will throw an exception
//		it takes 2 parameters = 1st - destination list 2nd - source list
//		it will replace all the elements of the destination list till the size of the source list
//		this method is applicable only for list
//		ArrayList<Integer> al2 = new ArrayList<Integer>(5);
//		al2.add(437);al2.add(746);al2.add(27);al2.add(98);al2.add(86);al2.add(56);
//		Collections.copy(al2, al);
//		System.out.println(al2);
		
//		if 2 list contains no common element then it is called as disjoint 
//		it returns true only if both the lists have no common elements
//		this method is applicable for all collection classes
//		ArrayList<Integer> al2 = new ArrayList<Integer>(5);
//		al2.add(437);al2.add(746);al2.add(27);al2.add(98);al2.add(86);al2.add(56);
//		boolean disJoint = Collections.disjoint(al, al2);
//		System.out.println(disJoint);
		
//		fill() method replaces all the element`s value present in the provided collection
//		to the value provided 
//		this method is only applicable for list
//		Collections.fill(al, 10);
//		System.out.println(al);
		
//		frequency() method returns the number of times the provided element is present in
//		the provided collection
//		this method is applicable for all collection classes
//		int frequency = Collections.frequency(al, 10);
//		System.out.println(frequency);
		
//		max() method returns the largest element
//		Integer max = Collections.max(al);
//		System.out.println(max);
		
//		min() method returns the smallest element
//		Integer min = Collections.min(al);
//		System.out.println(min);
		
//		replaceAll() method replaces all the elements of the provided collection
//		it takes 3 parameters = 1st name of the collection , 2nd - old value which we want to replace
//		3rd - new value which we want to assign in the place of old value
//		it replaces all the values that are same 
//		this method is applicable for list only
//		Collections.replaceAll(al, 47, 100);
//		System.out.println(al);
		
//		reverse() method reverses the provided collection
//		this method is applicable for list only
//		Collections.reverse(al);
//		System.out.println(al);
		
//		rotate() method rotates the provided collection with the provided distance in the 
//		right side 
//		this method is applicable for list only
//		Collections.rotate(al, 2);
//		System.out.println(al);
		
//		shuffle() method changes the index of provided collection randomly
//		this method is applicable for list only
//		Collections.shuffle(al);
//		System.out.println(al);
		
//		singleton() returns an immutable set of the provided collection
//		its serializable
//		Set<ArrayList<Integer>> singleton = Collections.singleton(al);
//		System.out.println(singleton);
		
//		singletonList() returns an immutable list of the provided collection
//		its serializable
//		List<ArrayList<Integer>> singletonList = Collections.singletonList(al);
//		System.out.println(singletonList);
		
//		it sorts the provided collection using natural sorting order
//		Collections.sort(al);
		
//		it sorts the provided collection using custom sorting order of the provided comparator
//		refer collection.comparator to understand this sort method
//		Collections.sort(al,new NameComparator());
		
//		swap() method swaps the provided collection`s elements
//		it takes 3 parameters = 1st name of the collection , 2nd 1st index , 3rd 2nd index
//		the elements of both index will be swapped
//		this method is applicable for list only
//		Collections.swap(al, 0, 1);
//		System.out.println(al);
		
//		this method returns the thread safe view of the provided collection
//		this method is applicable for collection , list , set , sortedset , navigableset ,
//		map ,sortedmap , navigablemap
//		Collection<Integer> synchronizedCollection = Collections.synchronizedCollection(al);
//		System.out.println(synchronizedCollection);
		
//		this method returns read only view of the collection we can only perform read operations
//		write operaton causes an exception
//		this method is applicable for collection , list , set , sortedset , navigableset ,
//		map ,sortedmap , navigablemap
//		Collection<Integer> unmodifiableCollection = Collections.unmodifiableCollection(al);
//		System.out.println(unmodifiableCollection);
	}
}
