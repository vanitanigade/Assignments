package polymorphism.methodOverriding.simpleDynamicBinding;

public class SubClass extends Bind_Dynamic{
	
/*	void display(String str) {
		if(val==null) {
			str="Derived Class Function ".concat(str);
			System.out.println(str);
		}
	*/			//	==OR==
		// ===Now rewrite the Code in SubClass and check changes of output ===
		
		void display(String str) {
			super.display(str);
			if(val==null) {
				str="Derived Class Function ".concat(str);
				System.out.println(str);
			}
	}

}
