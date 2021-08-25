package staticfinal.staticpackage.staticClass;

// App.java:
public class App {
	
	public static void main(String[] args) {
		CarParts cp = new CarParts();
		CarParts.Wheel cpw = new CarParts.Wheel();
	}
}

//To instantiate our static class, creating an object from our static Wheel class, we have to use new separately on the class. 
 
//App.java:

/*public class App {
	
	public static void main(String[] args) {
		CarParts.Wheel cpw = new CarParts.Wheel();
	}
}
*/



