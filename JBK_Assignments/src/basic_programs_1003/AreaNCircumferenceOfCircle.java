package basic_programs_1003;

import java.util.Scanner;

public class AreaNCircumferenceOfCircle {

	static Scanner sc = new Scanner(System.in); 

	public static void main(String args[]) 
	{ 
		System.out.print("Enter the radius: "); 
		//We are storing the entered radius in double because a user can enter radius in decimals 

		double radius = sc.nextDouble();        
		double area = Math.PI * (radius * radius);       		//Area = PI*radius*radius
		System.out.println("The area of circle is: " + area); 
		 
		double circumference= Math.PI * 2*radius;       //Circumference = 2*PI*radius
		System.out.println( "The circumference of the circle is:"+circumference) ; 
	}

}
