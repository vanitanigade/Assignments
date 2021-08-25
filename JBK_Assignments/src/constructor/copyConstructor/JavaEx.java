package constructor.copyConstructor;

public class JavaEx {
	String web;

	JavaEx(String str){
		web=str;
	}

	JavaEx(JavaEx je){	//copy Constructor:- it copies the values of one object to another object(the object that invokes this constructor).
		web= je.web;
	}
	void display() {
		System.out.println("website: "+web);
	}

	public String toString() {
		return web;
	}
	public static void main(String[] args) {

		JavaEx JE1 = new JavaEx("www.google.com");
		JavaEx JE2 = new JavaEx(JE1);	      //passing the object as an argument to the const, this will invoke the copy constructor.
		JE1.display();
		JE2.display();
		System.out.println(JE1);
		System.out.println(JE2);
	}

}
