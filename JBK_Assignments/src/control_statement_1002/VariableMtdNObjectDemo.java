package control_statement_1002;

public class VariableMtdNObjectDemo {

	//Properties  
	//below are global variable 
	int a ;           		//Declaration of variable             
	int b=20;               //Initialization of variable 
	//operation 
	void m1() { 
		a=10;  					//assignment of variable global variable   
		int c=30;         		//locale variable 
		System.out.println(a); 
		System.out.println(c); 
	} 
	public static void main(String[] args) { 
		VariableMtdNObjectDemo cs=new VariableMtdNObjectDemo();  	//Object creation     
		cs.m1();    												//method calling by object 
		System.out.println(cs.b);      //global variable calling by object 
	} 


}
