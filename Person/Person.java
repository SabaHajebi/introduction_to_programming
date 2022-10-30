
public class Person {
	private String firstName;
	private String lastName;
	private String address;
	protected  int ID;
	
	
	Person(){	
	}
	
	Person(String firstName, String lastName, String address, int ID){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.ID = ID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getID() {
		return ID;
	}
	
	public void display() {
		System.out.println(firstName + " " + lastName + " " + address + " " + ID);

	}

}
