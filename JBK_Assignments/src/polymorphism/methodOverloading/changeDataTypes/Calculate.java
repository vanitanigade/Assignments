package polymorphism.methodOverloading.changeDataTypes;

public class Calculate {
	
	void sum(int a, int b) {
		System.out.println("sum is "+(a+b));
	}	
		void sum(float a, float b) {
			System.out.println("sum is "+(a+b));
	}
		public static void main(String[] args) {
		
			Calculate calc = new Calculate();
			calc.sum(8, 5);
			calc.sum(3.8f, 4.5f);
		}
		
	

}
