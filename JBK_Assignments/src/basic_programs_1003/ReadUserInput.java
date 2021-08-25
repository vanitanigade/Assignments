package basic_programs_1003;

import java.util.Scanner;

public class ReadUserInput {

	public static void main(String[] args) { 
		
		int num1; 
		String word1; 

		Scanner input = new Scanner(System.in); 
		System.out.print("Enter a number: "); 
		num1 = input.nextInt(); // read input for num1 
		
		System.out.print("Enter a word: "); 
		word1 = input.next(); // read input for word1 

		System.out.println("Your Inputs Are...."); 

		System.out.println("The number you have entered is: " + num1); 

		System.out.println("The word you have entered is: " + word1); 
	}  



}
