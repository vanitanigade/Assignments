package exception.throwss.eg;

public class Main {

	public static void main(String args[]){     
		try{  

			ThrowEg obj=new ThrowEg();  
			obj.mymethod(2); 
			
		}catch(Exception ex){ 
			System.out.println(ex); 
		}
		            
	}


}
