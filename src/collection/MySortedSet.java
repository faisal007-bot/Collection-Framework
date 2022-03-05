package collection;

//import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class MySortedSet {
//	it contains methods specific to the sorting
//	all the methods of the collection and set inherited
	public static void main(String[] args) {
//		methods of the sorted set
		
//		adding some elements to perform sortedset methods on it
		SortedSet<Integer> ss = new TreeSet<Integer>();
		ss.add(47);ss.add(58);ss.add(57);ss.add(12);ss.add(89);
		System.out.println(ss);
		
//		it returns the comparator used by this sortedset object
//		it returns null if no custom comparator was used while creating the sortedset object
//		System.out.println(ss.comparator());
		
//		it returns the least or first element of the collection
//		Integer first = ss.first();
//		System.out.println("first element = "+first);
		
//		it returns the last element of the collection
//		Integer last = ss.last();
//		System.out.println("last element = "+last);
		
//		it returns the elements present before the provided element 
//		if the provided element is present still it will not be included in the headset
//		if the provided element is not present all the elements present before the provided
//		element will be returned in the headset
//		SortedSet<Integer> headSet = ss.headSet(49);
//		System.out.println(headSet);
		
//		it returns the elements present after the provided element 
//		if the provided element is present it will be included in the tailset
//		if the provided element is not present all the elements present after the provided
//		element will be returned in the tailset
//		SortedSet<Integer> tailSet = ss.tailSet(57);
//		System.out.println(tailSet);
		
//		it returns the element present from the provided start index to the provided end index -1
//		start index is included and end index is excluded in the subset
//		if the provided start element is not present then all the elements after this will be returned
//		if the provided end element is not present then all the elements present before this will be
//		returned
//		SortedSet<Integer> subSet = ss.subSet(12, 55);
//		System.out.println(subSet);
	}
}
