package exception.types;

public class ArrayIndexOutOfBounds {

	public static void main(String args[]){       

		try{ 

			int a[]=new int[10]; 
			a[11] = 9;  				        //Array has only 10 elements 
		}
		catch(ArrayIndexOutOfBoundsException e){          
			System.out.println ("ArrayIndexOutOfBounds"); 
		} 

	}

}
