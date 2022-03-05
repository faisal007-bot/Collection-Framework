package collection;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class MySortedMap {
//	if we want to store elements inside the map on the basis of 
//	some sorting order then sortedmap is used it stores elements 
//	in the map by using the sorting of the keys but not of values
	public static void main(String[] args) {
		
//		adding some elements to perform sortedmap methods
//		SortedMap<Integer, String> sm = new TreeMap<Integer,String>(new MyComparator3());
		SortedMap<Integer, String> sm = new TreeMap<Integer,String>();
		SortedMap<Integer, String> sm1 = new TreeMap<Integer,String>();
		sm.put(34, "lacentix");sm.put(67, "cipher");sm.put(7, "neko");
		sm.put(3, "faiz");sm.put(9, "deadeye");
		sm1.put(320, null);sm1.put(372, "decode");sm1.put(332, "encrypt");
		sm.putAll(sm1);
		System.out.println(sm);
		
//		methods of the sortedMap
		
//		returns the comparator used by this sortedmap for sorting
//		it returns null if no comparator is provided or default sorting is used
//		System.out.println(sm.comparator());
		
//		returns the first key present in the map
//		Integer firstKey = sm.firstKey();
//		System.out.println(firstKey);
		
//		returns the last key present in the map
//		Integer lastKey = sm.lastKey();
//		System.out.println(lastKey);
		
//		returns the entries present before the provided key if the key is present then it will be 
//		excluded if not present then all the entries before provided key will be returned
//		SortedMap<Integer, String> headMap = sm.headMap(32);
//		System.out.println(headMap);
		
//		returns the entries present after the provided key if the key is present then it will be 
//		included if not present then all the entries after provided key will be returned
//		SortedMap<Integer, String> tailMap = sm.tailMap(37);
//		System.out.println(tailMap);
		
//		it returns the entries after the provided [from key] if the provided key is present
//		then it will be included else it returns entries after the [from key]
//		it returns elements before the provided [to key] if the provided key is present
//		then it will be excluded else it returns entries before the [to key]
//		SortedMap<Integer, String> subMap = sm.subMap(10, 331);
//		System.out.println(subMap);
	}
}
class MyComparator3 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return 0;
	}
	
}
