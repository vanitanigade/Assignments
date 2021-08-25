package superthis.thiss.asMethodParameter;

public class Test {

	int a;  
	int b;  

	Test() {  
		a	= 10;  
		b	= 20; 
	}  

	void display(Test obj) {  								// Method that receives 'this' keyword as parameter   	
		System.out.println("a = " + a + " b = " + b); 
	}  

	void get() {   	 									// Method that returns current class instance   	
		display(this);  	//calls display method
	}  

	public static void main(String[] args)  {

		Test object = new Test();   	 	
		object.get();
	} 

}
