package basic_programs_1003;

import java.util.Scanner;

public class ReadUserEnteredNo {

	public static void main(String[] args) { 
		// This reads the input provided by user using keyboard 
		 
		Scanner scan = new Scanner(System.in); 
		System.out.print("Enter any number: "); 
	
		int num = scan.nextInt(); 	// This method reads the number provided using keyboard

		scan.close();					        

		System.out.println("The number entered by user: "+num); 
	} 


}
