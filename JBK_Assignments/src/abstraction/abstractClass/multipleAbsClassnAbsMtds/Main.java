package abstraction.abstractClass.multipleAbsClassnAbsMtds;

public class Main {

	public static void main(String[] args) {

		SubClass sb = new SubClass();
		sb.getName("Abhi");
		sb.getGender("Female");
		sb.getCity("Pune");
		sb.getCountry("India");
		sb.display();
	}

}
