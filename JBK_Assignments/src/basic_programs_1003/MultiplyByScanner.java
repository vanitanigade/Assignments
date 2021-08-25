package basic_programs_1003;

import java.util.Scanner;

public class MultiplyByScanner {

	public static void main(String[] args) { 

		// This reads the input provided by user using keyboard 
		 
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter first number: "); 
		int num1 = scan.nextInt(); 		// This method reads the number provided using keyboard

		System.out.print("Enter second number: "); 
		int num2 = scan.nextInt(); 

		scan.close(); 

	    int product = num1*num2; 

		System.out.println("Output: "+product); 
	}


}
