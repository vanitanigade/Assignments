package exception.types;

public class NullPointer {

	public static void main(String args[]) { 

		try{ 
			String str=null; 
			System.out.println (str.length()); 
		}
		catch(NullPointerException e){ 
			e.printStackTrace();
			System.out.println("NullPointerException..");  	
		}

	}   


}
