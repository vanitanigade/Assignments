package abstraction.interfac.simpleInterfaceMultipleInherit;

public class Demo implements A,B{

	@Override
	public void myMethod() {
		System.out.println("Multiple inheritance example using Interfaces");
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.myMethod();
	}

}
