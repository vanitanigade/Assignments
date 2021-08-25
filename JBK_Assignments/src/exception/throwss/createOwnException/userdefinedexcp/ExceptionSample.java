package exception.throwss.createOwnException.userdefinedexcp;

public class ExceptionSample {

	public void displayMymsg() throws MyException  {          
		for(int j=8;j>0;j--) { 
			System.out.println("j= "+j); 
			if(j==7){ 
				throw new MyException("This is my own Custom Message"); 
			}
		}  
	}  

	public static void main(String args[]) throws Exception  {     

		ExceptionSample es = new ExceptionSample();         
		es.displayMymsg();   
		System.out.println("========");					// In this example es.displayMymsg() method is not handled by try catch so "========" will not print
	}



}
