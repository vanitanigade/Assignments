package basic_and_methodcalling_1004;

public class Area {

	public static double getArea(double x,double y){
		return x*y; 
	} 

	public static void main(String[] args){     

		double z = getArea(10.2,23.4); 
		System.out.println(z); 
		
		System.out.println(getArea(2.1, 3.2));
	} 

}
