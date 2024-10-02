package aggregation;

class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}

}

class Emp {
	int id;
	String name;
	Address address;// has a relationship

	public Emp(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("id is : " + id);
		System.out.println("name is : " + name);
		System.out.println(
				"City is :" + address.city + " and state is " + address.state + " and country is : " + address.country);
	}
}

public class TestEmp {

	public static void main(String[] args) {
		Address address1 = new Address("mumbai", "maharashtra", "india");
		Address address2 = new Address("Pune", "maharashtra", "india");

		Emp emp1 = new Emp(1, "Ankita", address1);
		Emp emp2 = new Emp(2, "Dev", address2);
		emp1.display();
		System.out.println("-------------------------------------------");
		emp2.display();
	}

}
