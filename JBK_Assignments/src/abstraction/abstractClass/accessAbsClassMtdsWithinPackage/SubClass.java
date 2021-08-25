package abstraction.abstractClass.accessAbsClassMtdsWithinPackage;

public class SubClass extends Abstract {
	
	String name;
	@Override
	void getVal(String name) {
		this.name = name;
	}

	@Override
	void display() {
		System.out.println("Hello "+ name);
	}

}
