package basic_programs_1003;

import java.util.Scanner;

public class FloatMultiby_Scanner {

	public static void main(String[] args) { 

		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter first number: "); 
		double num1 = scan.nextDouble(); 			// This method reads the number provided using keyboard

		System.out.print("Enter second number: ");         
		double num2 = scan.nextDouble(); 

		scan.close(); 
		
		double product = num1*num2; 
		
		System.out.println("Output: "+product); 
	}


}
