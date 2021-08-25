package constructor.parameterized;

public class Employee {

	int empId;
	String empName;

	Employee(int id, String name){
		this.empId = id;
		this.empName = name;
	}

	void info() {
		System.out.println("id: "+empId+"  Name: "+empName);
	}

	public static void main(String[] args) {

		Employee employee1 = new Employee(12345, "Abhi");
		Employee employee2 = new Employee(67890, "xyz");

		employee1.info();
		employee2.info();


	}

}
