package staticfinal.staticpackage.staticNonstaticClassImplementation;

public class Main {			// How to create instance of static and non static nested class? 

	public static void main(String[] args) {
		
		OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass(); 	// create instance of nested Static class 
		printer.printMessage(); 													// call non static method of nested static class 

		// In order to create instance of Inner class we need an Outer class instance. 
		//Let us create Outer class instance for creating non-static nested class instance
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass(); 
		inner.display(); 													// calling non-static method of Inner class 
		
		// we can also combine above steps in one step to create instance of Inner class 
		OuterClass.InnerClass innerObj = new OuterClass().new InnerClass(); 
		innerObj.display();														// similarly we can now call Inner class method 













	}


}
