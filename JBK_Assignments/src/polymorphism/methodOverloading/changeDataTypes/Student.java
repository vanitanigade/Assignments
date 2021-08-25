package polymorphism.methodOverloading.changeDataTypes;

public class Student {

	String name;
	int age;
	String email;

	public void setData(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void setData(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email=email;
	}
	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setData("Vanita", 25);
		s1.display();
		Student s2 = new Student();
		s2.setData("Sandhya", 35, "vanitan@gmail.com");
		s2.display();


	}

}
