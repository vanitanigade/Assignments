package constructor.chainingDemo;

public class ChainingDemo {

	public ChainingDemo() {
		System.out.println("Default Constructor");
	}
	public ChainingDemo(String str) {
		this();
		System.out.println("Parameterised Constructor with single param");
	}
	public ChainingDemo(String str, int num) {
	// It will call the constructor with String argument
		this("Hello");
		System.out.println("Parameterised Constructor with double args");
	}
	public ChainingDemo(int num1, int num2, int num3) {
		// It will call the constructor with (String, integer) arguments
			this("Hello", 2);
			System.out.println("Parameterised Constructor with 3 args");
		}
	
	public static void main(String[] args) {

		ChainingDemo cd = new ChainingDemo(5, 10, 15);
		
	}

}
