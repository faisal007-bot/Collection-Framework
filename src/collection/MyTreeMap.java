package collection;

import java.util.Comparator;
//import java.util.SortedMap;
import java.util.TreeMap;

public class MyTreeMap {
//	underlying data structure for treemap is red black tree
//	null keys are not allowed but multiple null values are allowed
//	duplicate keys are not allowed but duplicate values are allowed
//	elements are stored on the base of the sorting whether default or customized sorting
//	it is non synchronized 
//	search operation is fast in treemap
//	only homogenous keys are allowed 
//	all the elements must be comparable
	public static void main(String[] args) {
		
//		constructors of the treemap
		
//		default constructor creates an empty treeMap object
//		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
//		constructor with customized comparator or sorting order
//		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>(new MyComparator4());
		
//		constructor to create treemap by using the provided map
//		SortedMap<Integer, String> tm2 = new TreeMap<Integer, String>(tm1);
		
//		constructor by using the object of the sortedmap
//		TreeMap<Integer, String> tm3 = new TreeMap<Integer, String>(tm2);
		
		TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
		TreeMap<Integer, String> tm1 = new TreeMap<Integer,String>();
		tm.put(34, "lacentix");tm.put(67, "cipher");tm.put(7, "neko");
		tm.put(3, "faiz");tm.put(9, "deadeye");
		tm1.put(320, null);tm1.put(372, "decode");tm1.put(332, "encrypt");
		tm.putAll(tm1);
		System.out.println(tm);
		
//		methods of the treemap 
//		it doesnt contain any specific methods of its own
	}
}
class MyComparator4 implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return 0;
	}
	
}
