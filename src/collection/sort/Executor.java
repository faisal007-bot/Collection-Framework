package collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Executor {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(11,"faisal","mumbai"));
		s.add(new Student(2,"AI","Area 51"));
		s.add(new Student(6,"deadeye","algeria"));
		s.add(new Student(76,"neko","vegas"));
		s.add(new Student(98,"faiz","delhi"));
//		sorting using id of the student
		Collections.sort(s,new IdComparator());
		Iterator<Student> itr = s.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
//		sorting using name of the student
		Collections.sort(s,new NameComparator());
		Iterator<Student> itr2 = s.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
//		sorting collection of wrapper class
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(56);
		al.add(8);
		al.add(87);
		al.add(7);
		al.add(78);
		Collections.sort(al);
		al.forEach(e->System.out.println(e));
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("faisal");
		al2.add("khan");
		al2.add("deadeye");
		al2.add("neko");
		al2.add("cipher");
		Collections.sort(al2);
		al2.forEach(e->System.out.println(e));
		
//		sorting map
		Map<Integer, String> m1 = new TreeMap<Integer, String>(new IdComparator2());
		m1.put(23, "faisal");
		m1.put(2, "nerd");
		m1.put(3, "neko");
		m1.put(78, "deadeye");
		m1.put(56, "khan");
		Set<Entry<Integer, String>> entrySet = m1.entrySet();
		for(Map.Entry<Integer, String> me:entrySet) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
//		sorting set
		Set<Integer> set = new TreeSet<Integer>(new IdComparator2());
		set.add(56);
		set.add(7);
		set.add(8);
		set.add(87);
		set.add(90);
		Iterator<Integer> itr3 = set.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
	}
}
class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getId()>s2.getId())
			return -1;
		else if(s1.getId()<s2.getId())
			return 1;
		else 
			return 0;
	}
	
}
class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return -s1.getName().compareTo(s2.getName());
	}
}
class IdComparator2 implements Comparator<Integer>{

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