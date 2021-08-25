package exception.throwss.createOwnException.userdefinedexcp;

public class CustomException {

	public static void main(String args[]){       

		try{ 

			throw new MyException("Custom"); 					// I'm throwing user defined custom exception above

		} catch(MyException exp){ 
			System.out.println("Hi this is my catch block") ; 
			System.out.println(exp) ; 
		}  

	}

}
