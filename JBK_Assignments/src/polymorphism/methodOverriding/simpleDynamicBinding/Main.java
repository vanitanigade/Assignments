package polymorphism.methodOverriding.simpleDynamicBinding;

public class Main {

	public static void main(String[] args) {

		SubClass sc = new SubClass();
		sc.display("Called");
		Bind_Dynamic bd = new Bind_Dynamic();
		bd.display("Called");
		Bind_Dynamic bd1 = new SubClass();
		bd1.display("Called");
	}

}
