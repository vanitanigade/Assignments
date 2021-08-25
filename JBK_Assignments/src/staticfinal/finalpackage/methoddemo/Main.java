package staticfinal.finalpackage.methoddemo;

public class Main extends Ex1{

/*		void show() {		//compile time error because final method cannot override
			System.out.println("this is method of Main");
		}
	*/	
		public static void main(String[] args) {
			Ex1 ex1 = new Ex1();
			ex1.show();

	}

}
