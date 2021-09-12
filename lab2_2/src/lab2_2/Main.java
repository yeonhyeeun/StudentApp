package lab2_2;
//21900442 연혜은 실습 2-1 StudentApp sort 


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List(ordered by name)");
			
		Student s1 = new Student(101, "Kim",23);
		//s1.setNo(3);
		al.add(s1);
		
		
		Student s2 = new Student(102, "choi",21);
		al.add(s2);
		
		al.add(new Student(103,"Dark",25));
		al.add(new Student(104,"Yeon",22));
		al.add(new Student(105,"Eee",26));
		al.add(new Student(106,"Soo",24));
		al.add(new Student(107,"Aim",27));
		al.add(new Student(108,"Cu",29));
		al.add(new Student(109,"Boo",21));
		al.add(new Student(110,"Kwoun",20));
		
		
		
		
			
		Collections.sort(al);
		//Traverse elements of arraylist (ordered)
		for(Student s: al) {
		System.out.println(s.toString());
		}
		
		System.out.println(); 
		System.out.println("Student List (reverse order by name)");
			
		Collections.sort(al, Collections.reverseOrder());
		//Traverse elements of arraylist (reserve ordered)
			
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString()); 
	}

}
	
}
