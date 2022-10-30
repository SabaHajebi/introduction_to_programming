
public class Employee extends Person {


	private String jobTitle;
	
	Employee(String firstName, String lastName, String address, int ID, String jobTitle){
        super(firstName, lastName, address, ID);
		this.jobTitle = jobTitle;
	}
	
	@Override
	public void display() {
		System.out.println(getFirstName() + " " + getLastName() + " "
                + getAddress() + " " + ID + " " + jobTitle);	}

}
