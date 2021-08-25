package accessSpecifiers.protectedas;

public class Main {

	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		t.setData(10, 20);
		System.out.println(t.getArea());
		
		Rectangle r = new Rectangle();
		r.setData(12, 10);
		System.out.println(r.getArea());
	}
}
