package inheritance.multilevel.eg1;

public class Maruti800 extends Maruti{

	public Maruti800() {
		System.out.println("Constructor of class Maruti800");
	}	
	public void speed() {
		System.out.println("Max speed of Maruti800 : 80Kmph");
	}

	public static void main(String[] args) {

		Maruti800 maruti800 = new Maruti800();

		maruti800.vehicleType();
		maruti800.brand();
		maruti800.speed();
	}


}
