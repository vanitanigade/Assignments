package basic_programs_1003;

public class Ascii_Int_Sum {

	public static void main(String[] args){

		int a = 10;     
		char ch = 'h';     
	//	int ch = 'h';
		int sum = a + ch;     
		System.out.println(sum); 
		System.out.println(ch);
	}
}

//All the character variables get converted to integers while performing arithmetic operations
//or in any such other expression. 