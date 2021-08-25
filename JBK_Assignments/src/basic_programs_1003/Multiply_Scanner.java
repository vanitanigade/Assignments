package basic_programs_1003;

import java.util.Scanner;

public class Multiply_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Input first number: ");   
		int num1 = sc.nextInt(); 

		System.out.print("Input second number: "); 
		int num2 = sc.nextInt(); 

		System.out.println(num1 + " x " + num2 + " = " + num1 * num2); 
	}  


}
