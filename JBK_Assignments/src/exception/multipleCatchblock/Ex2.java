package exception.multipleCatchblock;

public class Ex2 {

	public static void main(String args[]){      
		try{ 
			int a[]=new int[7];         
			a[4]=30/0; 
			System.out.println("First print statement in try block"); 
		} 
		catch(ArithmeticException e){ 
			System.out.println("Warning: ArithmeticException"); 
		} 
		catch(ArrayIndexOutOfBoundsException e){ 
			System.out.println("Warning: ArrayIndexOutOfBoundsExcepti on"); 
		} 
		catch(Exception e){ 
			System.out.println("Warning: Some Other exception"); 
		} 
		
		System.out.println("Out of try-catch block..."); 
	}


}
