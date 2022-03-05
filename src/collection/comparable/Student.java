package collection.comparable;

public class Student implements Comparable<Student>{
	int id;
	String name;
	String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Override
//	public int compareTo(Student o) {
//		if(this.getId()>o.getId())
//			return -1;
//		else if(this.getId()<o.getId())
//			return 1;
//		else 
//			return 0;
//	}
	@Override
	public int compareTo(Student s) {
		//return this.getName().compareTo(s.getName());
		//return -this.getName().compareTo(s.getName());
		return s.getName().compareTo(this.getName());
	}
}
