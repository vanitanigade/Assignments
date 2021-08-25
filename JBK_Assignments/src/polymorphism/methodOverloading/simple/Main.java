package polymorphism.methodOverloading.simple;

public class Main {

	public static void main(String[] args) {

		Overload obj = new Overload();
		double result;
		int add;
		obj.demo(10);
		obj.demo(10, 20);
		result =obj.demo(5.5);
		System.out.println(result);
		add = obj.demo(5, 5, 5);
		System.out.println(add);
	}

}
