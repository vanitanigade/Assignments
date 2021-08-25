package staticfinal.staticpackage.methodDemo;

public class StaticMethod_Demo {
	
	void m1() {
		
	//	class.forName("hello.StaticMethod_Demo");
		//System.out.println("hello");
	}

	public static void copyArg(String str1, String str2) { 
		//copies argument 2 to arg1 
		str2 = str1; 
		System.out.println("First String arg is: "+str1);  	      
		System.out.println("Second String arg is: "+str2); 
	} 
	
	public static void main(String[] args) { 
		StaticMethod_Demo.copyArg("PQR", "DEF");     //this is first method to call static method 
		copyArg("XYZ", "ABC");       				//this is second method to call static method 
	} 

}
