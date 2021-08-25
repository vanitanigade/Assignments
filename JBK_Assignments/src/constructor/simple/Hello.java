package constructor.simple;

public class Hello {

	
	String name;

	Hello(){							//Constructor
		this.name = "Vanita";			// also can write as name="Vanita";
	}

	public static void main(String[] args) {

		Hello hello = new Hello();
		System.out.println(hello.name);


	}

}
