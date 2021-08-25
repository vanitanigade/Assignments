package basic_programs_1003;

import java.util.Scanner;

public class Add2Numbers_Scanner {

	public static void main(String[] args) { 

		int num1, num2, sum; 
		Scanner sc = new Scanner(System.in);         
		System.out.println("Enter First Number: "); 
		num1 = sc.nextInt(); 

		System.out.println("Enter Second Number: "); 
		num2 = sc.nextInt(); 

		sc.close();    //this is just to close Scanner object 
		sum = num1 + num2; 
		System.out.println("Sum of these numbers: "+sum); 
	}

}
