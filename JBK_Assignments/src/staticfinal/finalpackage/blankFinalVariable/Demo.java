package staticfinal.finalpackage.blankFinalVariable;

public class Demo {		
	//Blank final variable
	final int MAX_VALUE;

	Demo(){								// It must be initialized in constructor
		MAX_VALUE = 100;
	}

	void myMethod(){ 
		System.out.println(MAX_VALUE);
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.myMethod();
	}



}
