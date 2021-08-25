package polymorphism.methodOverriding.complexDynamicBinding;

public class SubClass1 extends Bind {

	
	void display() {
		super.display();
		text = "SubClass1's";
		System.out.println(text+" function called");
	}
}
