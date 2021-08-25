package accessSpecifiers.privateas;

public class A {

	private int x = 56;   
	private int data = 40;
	
	private void msg() {
		System.out.println("Hello java");
	}

	public void showDemo()    {   
		System.out.println("The Variable value is " + x);   
	}   

	private void testDemo()    {   
		System.out.println("It cannot be accessed in another class");   
	} 


}
