public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // base salary per week

   // Six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary)
   {
      // Explicit call to superclass CommissionEmployee constructor
      super(firstName, lastName, socialSecurityNumber, 
         grossSales, commissionRate);

      // If baseSalary is invalid throw exception
      if (baseSalary < 0.0)                      
         throw new IllegalArgumentException(    
            "Base salary must be >= 0.0");       

      this.baseSalary = baseSalary;
   } 
   
   // Set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");

      this.baseSalary = baseSalary;
   } 

   // Return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } 

   // Calculate earnings
  @Override 
   public double earnings()
   {
      // Not allowed: commissionRate and grossSales private in superclass
      return baseSalary + (commissionRate * grossSales);
   } 

   // Return String representation of BasePlusCommissionEmployee
   @Override 
   public String toString()
   {
      // Not allowed: attempts to access private superclass members   
      return String.format(
         "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
         "base-salaried commission employee", firstName, LastName, 
         "social security number", socialSecurityNumber, 
         "gross sales", grossSales, "commission rate", commissionRate, 
         "base salary", baseSalary);
   } 
} // End class BasePlusCommissionEmployee