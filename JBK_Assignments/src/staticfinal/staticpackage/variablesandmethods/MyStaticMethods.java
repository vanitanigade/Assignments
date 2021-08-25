package staticfinal.staticpackage.variablesandmethods;

public class MyStaticMethods {

	private String name; 
	private static String staticStr = "STATIC-STRING";    

	public MyStaticMethods(String n){         
		this.name = n; 
	}

	public static void testStaticMethod(){        
		System.out.println("Hey... I am in static method..."); 
		System.out.println(MyStaticMethods.staticStr);       //you can call static variables here and can't call instance variables here. 
	} 
	public void testObjectMethod(){ 
		System.out.println("Hey i am in non-static method"); 
		System.out.println(MyStaticMethods.staticStr); 			//you can also call static variables here         
		System.out.println("Name: "+this.name); 				//you can call instance variables here 
	
	} 
	public static void main(String a[]){ 
		MyStaticMethods.testStaticMethod(); 						//By using class name, you can call static method        
		MyStaticMethods msm = new MyStaticMethods("Java2novice");         
		msm.testObjectMethod(); 
	}

}
