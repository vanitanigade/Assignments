package accessSpecifiers.privateas;

public class A_Main {

	public static void main(String[] args) {
		
		A a = new A();
	//	a.testDemo(); // Private method cannot be used              
	//	a.x = 5; // Private variable cannot be used   
	     
        a.showDemo(); // run properly   
        
 //       System.out.println(a.data);	Private variable cannot be used
  //      a.msg();						// Private method cannot be used

        
        
	}
	
}
