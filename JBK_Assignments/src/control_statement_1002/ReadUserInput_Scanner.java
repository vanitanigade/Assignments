package control_statement_1002;

import java.util.Scanner;

public class ReadUserInput_Scanner {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in); 
		int num1; 
		String word1; 
		
		System.out.print("Enter a number: "); 
		num1 = sc.nextInt(); // read sc for num1 
		
		System.out.print("Enter a word: "); 
		word1 = sc.next(); // read sc for word1 

		System.out.println("Your scs Are...."); 

		System.out.println("The number you have entered is: " + num1); 

		System.out.println("The word you have entered is: " + word1); 
	}


}
