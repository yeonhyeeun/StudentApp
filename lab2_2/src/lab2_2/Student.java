package lab2_2;

public class Student implements Comparable<Student> {
	private int no;  //number 
	public String name; //name
	private int age; //age
	
	public Student(int no, String name, int age) {
		// TODO Auto-generated constructor stub
		this.no = no;
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public int compareTo(Student o) {
		return name.compareTo(o.name); 
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getNo() {
		return no;
	}

	public String toString() {
		return ("Student [no=" + no +", name =" + name + ", age = " + age + "]" );
			
	}
}
