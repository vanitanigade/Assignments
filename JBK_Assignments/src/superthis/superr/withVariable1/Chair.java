package superthis.superr.withVariable1;

public class Chair extends Furniture{

	String color="black";  	
	void printColor(){ 
		System.out.println(color);				//prints color of Chair class 
		System.out.println(super.color);		//prints color of Furniture class 
	}
}  



