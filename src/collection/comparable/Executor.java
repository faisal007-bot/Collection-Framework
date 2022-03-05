package collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Executor {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(12, "faisal", "mumbai"));
		al.add(new Student(89, "neko", "vegas"));
		al.add(new Student(90, "khan", "delhi"));
		al.add(new Student(5, "faiz", "georgia"));
		Collections.sort(al);
		al.forEach(s->System.out.println(s));
	}
}
