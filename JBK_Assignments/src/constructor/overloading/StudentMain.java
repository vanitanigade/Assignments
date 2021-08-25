package constructor.overloading;

public class StudentMain {

	public static void main(String[] args){
		
		Student s1=new Student();	
		s1.show();   
		System.out.println("==========s1.show end==========");
		Student s2 = new Student(102, "kd,kiran@jbk.com",s1.show());
		System.out.println("=====s2 end =========");
		s2.show();
		System.out.println("=======s2.show end =========");
		Student s3 = new Student(103, "kiran,Kiran@jbk.com",s2.show(),8888809416L);
		System.out.println("==========s3 end==========");
		s3.show();
		System.out.println("=========s3.show end============");
		s1.Student();  //calling the normal method,not the constructor
	}

}
