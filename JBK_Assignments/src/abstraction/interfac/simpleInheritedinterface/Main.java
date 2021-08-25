package abstraction.interfac.simpleInheritedinterface;

public class Main implements Interface2{

	@Override
	public void method1() {
		System.out.println("Implemented method1");
	}

	@Override
	public void method2() {
		System.out.println("Implemented method2");
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.method1();
		main.method2();
	}



}
