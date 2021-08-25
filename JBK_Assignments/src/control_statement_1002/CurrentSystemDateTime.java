package control_statement_1002;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentSystemDateTime {

	public static void main(String[] args) { 
		
		Date date = new Date();        //Date is predefined class in java.util package 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a"); //sdf is predefined class in java.text package
		
		System.out.println("Today's Date and Time is := " + sdf.format(date) ); 

	}


}
