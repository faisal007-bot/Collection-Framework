package collection.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
//		return s1.name.compareTo(s2.name);
//		return s2.name.compareTo(s1.name);
		return -s1.name.compareTo(s2.name);
	}

}
