package polymorphism.methodOverriding.simple;

public class OverrideMain {

	public static void main(String[] args) {
		
		DerivedClass dc = new DerivedClass();
		dc.method();
		BaseClass bc = new BaseClass();
		bc.method();
		BaseClass bc1 = new DerivedClass();
		bc1.method();
	}
}
