package staticfinal.finalpackage.variabledemo;

public class Ex {

	final int a=10;
	
	final void JBK(){
		final int i=0;
/*		for(i=0;i<5;i++) {			//compile time error final variable's value can't be change
			System.out.println("value of I+"+i);
		} */
	}
	
	public static void main(String[] args) {
		Ex ex = new Ex();
		ex.JBK();
	}

}
