package abstraction.interfac.interfaceEg1;

public class Tyre implements Moveable, Rollable{

	int width;
	
	@Override
	public boolean isRollable() {
		return true;
	}

	@Override
	public boolean isMoveable() {
		return false;
	}

	public static void main(String[] args) {
		Tyre tyre = new Tyre();
		System.out.println(tyre.isRollable());
		System.out.println(tyre.isMoveable());

	}
}
