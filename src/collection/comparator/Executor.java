package collection.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Executor {
	public static void main(String[] args) {
		ArrayList<Student> s = new ArrayList<Student>();
		s.add(new Student(2, "faisal"));
		s.add(new Student(6, "deadeye"));
		s.add(new Student(4, "faiz"));
		s.add(new Student(1, "neko"));
		s.add(new Student(89, "cipher"));
		Collections.sort(s,new IdComparator());
		s.forEach(s1->System.out.println(s1));
		Collections.sort(s,new NameComparator());
		s.forEach(s2->System.out.println(s2));
	}
}
