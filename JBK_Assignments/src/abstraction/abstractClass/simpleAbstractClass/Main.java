package abstraction.abstractClass.simpleAbstractClass;

public class Main {
	
	public void display2() {
		System.out.println("I am overriding abstract method");
	}

	public static void main(String[] args) {

		Main main = new Main();
		main.display2();
	//	main.display1();		
	}

}
