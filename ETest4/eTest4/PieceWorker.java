package eTest4;

public class PieceWorker extends Employee{
	private double wage; // wage per hour
	private int pieces; // pieces worked for week


	// constructor
	public PieceWorker(String firstName, String lastName,
			String socialSecurityNumber, double wage, int pieces)
	{
		super(firstName, lastName, socialSecurityNumber);

		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");

		if (pieces < 0.0) // validate pieces
			throw new IllegalArgumentException(
					"pieces produced must be >= 0.0");

		this.wage = wage;
		this.pieces = pieces;
	} 

	// set wage
	public void setWage(double wage)
	{
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");

		this.wage = wage;
	} 

	// return wage
	public double getWage()
	{
		return wage;
	} 



	public void setPieces(int pieces)
	{
		if ((pieces < 0.0)) // validate hours
			throw new IllegalArgumentException(
					"pieces worked must be >= 0.0");

		this.pieces = pieces;
	} 


	public double getPieces()
	{
		return pieces;
	} 

	// calculate earnings; override abstract method earnings in Employee
	@Override                                                           
	public double earnings()                                            
	{                                                                   
		if (getPieces() <= 400) // no overtime                           
			return getWage() * getPieces();                                
		else                                                             
			return 400 * getWage() + getPieces() - 400 * getWage() * 1.5;
	}   

	// return String representation of HourlyEmployee object              
	@Override                                                             
	public String toString()                                              
	{                                                                     
		return String.format("piece worker employee: %s%n%s: $%,.2f; %s: %,.2f",
				super.toString(), "wage per price", getWage(),                     
				"pieces produced", getPieces());                                   
	}                                                                 

}


