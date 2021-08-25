package abstraction.interfac.interfaceWithVariable;

public class Vehicle implements Moveable{

	@Override
	public void move() {
		System.out.println("Average speed is: "+ AveSpeed);
		
	}
	
	public static void main(String[] args) {
		
		Vehicle vc = new Vehicle();
		vc.move();
	}

}
