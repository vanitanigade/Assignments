package abstraction.interfac.interfaceEg2;

public class XYZ implements MyInterface{

	@Override
	public void method1() {
		System.out.println("Implemented method1");
	}

	@Override
	public void method2() {
		System.out.println("Implemented method2");
		
	}
	
	public static void main(String[] args) {
		MyInterface mi = new XYZ();
		mi.method1();
		mi.method2();
	}

}
