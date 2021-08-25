package staticfinal.finalpackage.classdemo;

//public class Main extends FinalClass{		//Here compile time error because final class cannot be extended/inherite
	
public class Main{
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.Show();
	}


}
