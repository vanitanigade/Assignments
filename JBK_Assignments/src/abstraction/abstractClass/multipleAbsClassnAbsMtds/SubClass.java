package abstraction.abstractClass.multipleAbsClassnAbsMtds;

public class SubClass extends Abstract2{

	 String name, gender, city, country;

	@Override
	void getCity(String city) {
		this.city = city;
	}

	@Override
	void getCountry(String country) {
		this.country = country;
	}

	@Override
	void getName(String name) {
		this.name = name;
	}

	@Override
	void getGender(String gender) {
		this.gender = gender;
	}
	
	void display() {
		System.out.println("Name: "+ name);
		System.out.println("Gender: "+ gender);
		System.out.println("City: "+ city);
		System.out.println("Country: "+ country);
	}

}
