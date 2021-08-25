package staticfinal.staticpackage.block;

public class Demo {

	static int a;
	static int b;
	
	static {
		a=10;
		b=20;
	}
	
	public static void main(String[] args) {
		System.out.println("value of a: "+ a);
		System.out.println("value of b: "+ b);

	}
	
}
