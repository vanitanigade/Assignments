package polymorphism.methodOverloading.changeNoOfArgs;

public class Area {
	
	void find(int l, int b) {
		System.out.println("area is: "+(l*b));
	}
	
	void find(int l, int b, int h) {
		System.out.println("area is: "+(l*b*h));
	}

	public static void main(String[] args) {
		
		Area area = new Area();
		area.find(3, 4);
		area.find(3, 4, 5);
	}

}
