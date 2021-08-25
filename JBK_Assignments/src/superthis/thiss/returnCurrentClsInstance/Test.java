package superthis.thiss.returnCurrentClsInstance;

public class Test {

	int a;  
	int b;  

	Test() {  
		a = 10;   	 	
		b = 20;  
	}  

	Test get() {   	 		 	//Method that returns current class instance   	
		return this;  
	}  

	void display(){
		System.out.println("a = " + a + " b = " + b); 
	}  

	public static void main(String[] args) {  
		Test object = new Test();  
		object.get().display();  
		object.display();
	} 


}
