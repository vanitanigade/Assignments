package basic_programs_1003;

import java.util.Scanner;

public class AreaOfSquare_Scanner {

	public static void main (String[] args) 
	{ 
		System.out.println("Enter Side of Square:"); 
		Scanner scanner = new Scanner(System.in);                
		double side = scanner.nextDouble();           //Storing the captured value in a variable     
		double area = side*side;  						//Area of Square = side*side
		System.out.println("Area of Square is: "+area); 
	}


}
