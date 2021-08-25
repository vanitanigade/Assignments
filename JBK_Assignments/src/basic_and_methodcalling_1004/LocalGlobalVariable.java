package basic_and_methodcalling_1004;

public class LocalGlobalVariable {

	int x=10;
	public void m1(int y) {
		x=x+1;
		y=y+1;
		System.out.println(x + " " + y);
	}

	public void m2(int y) {
		x=x+1;
		y=y+1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x + " " + y);
	}

	public static void main(String[] args) {
		LocalGlobalVariable p = new LocalGlobalVariable();
		p.m1(10);
		p.m1(20);
		p.m2(30);
		p.m2(40);
		System.out.println("====================");
	}
}
