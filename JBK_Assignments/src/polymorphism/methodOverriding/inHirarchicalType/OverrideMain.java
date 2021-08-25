package polymorphism.methodOverriding.inHirarchicalType;

public class OverrideMain {

	public static void main(String[] args) {

		Bank b = new Bank();
		System.out.println("Bank interest rate: "+b.getRateOfInterest()+"%");
		
		Bank b1 = new SBI();
		Bank b2 = new ICICI();
		Bank b3 = new Axis();
		
		System.out.println("SBI interest rate: "+b1.getRateOfInterest()+"%");
		System.out.println("ICICI interest rate: "+b2.getRateOfInterest()+"%");
		System.out.println("Axis interest rate: "+b3.getRateOfInterest()+"%");
		
		SBI sbi = new SBI();
		System.out.println(sbi.getRateOfInterest()+"%");
	}

}
