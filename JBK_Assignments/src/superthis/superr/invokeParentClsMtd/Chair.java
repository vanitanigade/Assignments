package superthis.superr.invokeParentClsMtd;

public class Chair extends Furniture{

	void color(){ 
		System.out.println(" Chair color..."); 
	} 

	void height(){ 
		System.out.println(" 5 ft  ...");
	} 

	void work(){  	  
		super.color();  	  
		height(); 
	}

}
