package accessSpecifiers.eg1;

public class Main {
	public static void main(String[] args) {
		
		VarEx ve = new VarEx();
		System.out.println(ve.a.jbk);
	//	System.out.println(ve.a1.jbk);	// a1 is private so can't access
	}

}
