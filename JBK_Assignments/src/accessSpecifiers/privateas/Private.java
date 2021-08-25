package accessSpecifiers.privateas;

public class Private {

	private int data = 10;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	void display(){
		System.out.println(data);
	}

	
	public static void main(String[] args) {
		Private p = new Private();
		System.out.println(p.data);	//Or
		p.display();
	}
}
