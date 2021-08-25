package collection.arraylist.studentarraylistitr;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<>();
		Student s1 = new Student(12, "pune", new Phone(232, 4000));
		Student s2 = new Student(12, "pune1", new Phone(232, 8000));
		Student s3 = new Student(12, "pune2", new Phone(232, 14000));
		Student s4 = new Student(12, "pune3", new Phone(232, 3000));

		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		// Give me students having mobile with cost more than 5000
		for(Student student : al) {
			Phone pp = student.phone;
			System.out.println(student.age);
			System.out.println(student.loc);
			System.out.println(pp.mobNumber);
			System.out.println(pp.cost);
			
		}


	}

}
