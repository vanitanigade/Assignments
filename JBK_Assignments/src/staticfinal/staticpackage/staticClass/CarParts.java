package staticfinal.staticpackage.staticClass;

/* Static classes are basically a way of grouping classes together in Java. 
Java doesn't allow you to create top-level static classes; only nested (inner) static classes. Let's take a look at an example. 
Here's a class called CarParts that declares a static inner class called Wheel. 	*/
// CarParts.java: 	

public class CarParts {
	
	public static class Wheel{						//inner class
		public Wheel() {							//inner class constructor
			 System.out.println("Wheel created!");
		}
	}
	
	public CarParts() {								// outer class constructor
		 System.out.println("Car Parts object created!");
	}
}

/* We added constructors to both classes so that we can see when they are instantiated -- in other words, when objects
 * are actually created from them.. We can use the CarParts class in the normal way; 
 * note that creating a CarParts object does not create a Wheel object. 
 */