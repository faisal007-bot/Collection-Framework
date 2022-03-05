package collection;

//import java.util.Map;
//import java.util.Map.Entry;
import java.util.NavigableMap;
//import java.util.NavigableSet;
//import java.util.SortedMap;
import java.util.TreeMap;

public class MyNavigableMap {
//	navigablemap provides methods for navigating in the map object
	public static void main(String[] args) {
//		adding some elements to perform sortedmap methods
//		SortedMap<Integer, String> sm = new TreeMap<Integer,String>(new MyComparator3());
		NavigableMap<Integer, String> nm = new TreeMap<Integer,String>();
		NavigableMap<Integer, String> nm1 = new TreeMap<Integer,String>();
		nm.put(34, "lacentix");nm.put(67, "cipher");nm.put(7, "neko");
		nm.put(3, "faiz");nm.put(9, "deadeye");
		nm1.put(320, null);nm1.put(372, "decode");nm1.put(332, "encrypt");
		nm.putAll(nm1);
		System.out.println(nm);
		
//		methods of the navigableMap
		
//		returns the entry after the provided key 
//		if the provided key is present then it will be returned otherwise
//		if the provided key is not present then entery after the provided key will be returned
//		Entry<Integer, String> ceilingEntry = nm.ceilingEntry(3);
//		System.out.println(ceilingEntry);
		
//		returns the entry before the provided key 
//		if the provided key is present then it will be returned otherwise
//		if the provided key is not present then entery before the provided key will be returned
//		Entry<Integer, String> floorEntry = nm.floorEntry(6);
//		System.out.println(floorEntry);
		
//		returns the key after the provided key 
//		if the provided key is present then it will be returned otherwise
//		if the provided key is not present then key after the provided key will be returned
//		Integer ceilingKey = nm.ceilingKey(3);
//		System.out.println(ceilingKey);
		
//		returns the key before the provided key 
//		if the provided key is present then it will be returned otherwise
//		if the provided key is not present then key before the provided key will be returned
//		Integer floorKey = nm.floorKey(4);
//		System.out.println(floorKey);
		
//		returns all the keys present in the map in the reverse order 
//		NavigableSet<Integer> descendingKeySet = nm.descendingKeySet();
//		descendingKeySet.forEach(element->System.out.print(element+"\t"));
		
//		returns all the entries present in the map in the reverse order
//		NavigableMap<Integer, String> descendingMap = nm.descendingMap();
//		System.out.println(descendingMap);
		
//		returns the first entry present in the map
//		Entry<Integer, String> firstEntry = nm.firstEntry();
//		System.out.println(firstEntry);
		
//		returns the last entry present in the map
//		Entry<Integer, String> lastEntry = nm.lastEntry();
//		System.out.println(lastEntry);
		
//		it returns all the entries present before the provided key 
//		and it takes boolean to set whether to include the provided key or not in the returned map
//		if the provided key is not present then all the entries present before will be returned
//		NavigableMap<Integer, String> headMap = nm.headMap(10, true);
//		System.out.println(headMap);
		
//		it returns all the entries present after the provided key 
//		and it takes boolean to set whether to include the provided key or not in the returned map
//		if the provided key is not present then all the entries present after will be returned
//		NavigableMap<Integer, String> tailMap = nm.tailMap(9, true);
//		System.out.println(tailMap);
		
//		it returns the entry present after the provided key whether the key is present or not
//		Entry<Integer, String> higherEntry = nm.higherEntry(8);
//		System.out.println(higherEntry);
		
//		it returns the entry present before the provided key whether the key is present or not
//		Entry<Integer, String> lowerEntry = nm.lowerEntry(8);
//		System.out.println(lowerEntry);
			
//		it returns the key present after the provided key whether the key is present or not
//		Integer higherKey = nm.higherKey(33);
//		System.out.println(higherKey);
		
//		it returns the key present before the provided key whether the key is present or not
//		Integer lowerKey = nm.lowerKey(33);
//		System.out.println(lowerKey);
		
//		it returns the first key present in the map
//		Integer firstKey = nm.firstKey();
//		System.out.println(firstKey);
		
//		it returns the last key present in the map
//		Integer lastKey = nm.lastKey();
//		System.out.println(lastKey);
		
//		it returns the set representation of all the keys present in the map in ascending order
//		NavigableSet<Integer> navigableKeySet = nm.navigableKeySet();
//		System.out.println(navigableKeySet);
		
//		removes the first entry inside the map
//		nm.pollFirstEntry();
		
//		removes the last entry inside the map
//		nm.pollLastEntry();
		
//		it returns all the entries present after the [from key] 
//		2nd parameter takes boolean which is used to tell whether to include the provided 
//		[from key] into the returned map or not
//		it returns all the entries present before the [to key]
//		4th parameter takes boolean which is used to tell whether to include the provided 
//		[to key] into the returned map or not	
//		NavigableMap<Integer, String> subMap = nm.subMap(3, true, 332, false);
//		System.out.println(subMap);
	}
}
