package encapsulation.eg4;

public class Main {

	public static void main(String args[]){ 
		EncapsulationDemo obj = new EncapsulationDemo();          
		obj.setEmpName("Shalaka"); 
		obj.setEmpAge(32);         
		obj.setSsn(112233); 
		System.out.println("Employee Name: " + obj.getEmpName()); 
		System.out.println("Employee SSN: " + obj.getSsn()); 
		System.out.println("Employee Age: " + obj.getEmpAge()); 
	}


}
