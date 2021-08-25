package abstraction.abstractClass.multipleAbsMtds;

public class SubClass extends Abstract{

	int x, y , z;
	
	@Override
	void get(int a, int b) {
		x=a;
		y=b;
	}

	@Override
	void add() {
		z=x+y;
	}

	@Override
	void display() {
		System.out.println("The addition is: "+ z);
	}

	
	
}
