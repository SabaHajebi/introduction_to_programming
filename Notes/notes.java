
public class notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
 * /* SELF ASSESSMENT Class Rational - I declared two member variables:
 * numerator and denominator (marks out of 4: 4). - Comment: I did this within
 * the class, outside any methods. Constructor 1 - My program takes take two
 * integers as parameters (for numerator and denominator) and initialises the
 * member variables with the corresponding values . If the denominator is equal
 * to 0 I throw an exception (marks out of 5: 5). - Comment: The two parameters
 * are initialised, but I don't throw an exception for a zero here as I do it
 * elsewhere. Constructor 2 - My program takes only one integer as parameter
 * (numerator), and set the numerator to this value . I set the denominator to 1
 * in this case, as the resulting rational number in this case is an integer
 * (marks out of 3: 3). - Comment: Only one parameter is initiliased here. I set
 * the denominator to 1 at it's declaration before the constructor. Add Method -
 * My program takes only a rational number as a parameter and returns a new
 * rational number which has a numerator and denominator which the addition of
 * the two objects - this and the parameter. My program does not overwrite any
 * of the other two rational numbers (marks out of 8: 8). - Comment: A new
 * Rational object is created as the addition so the two rational numbers don't
 * get overwritten. Subtract Method - I have implemented this the same as add
 * method, except it implements subtraction (marks out of 8: 8). - Comment: Yup.
 * Multiply Method - I have implemented this the same as add method, except it
 * implements multiplication (marks out of 8: 8). - Comment: Yup. Divide Method
 * - I have implemented this the same as add method, except it implements divide
 * (marks out of 8: 8). - Comment: Yup. Equals Method - My program takes a
 * rational number as a parameter and compares it to the reference object. I
 * only use multiplication between numerators/denominators for the purpose of
 * comparison, as integer division will lead to incorrect results. I return a
 * boolean value (marks out of 8: 8). - Comment: I use division for comparison
 * but store the answers in floats so it is not inaccurate. isLessThan - My
 * program takes a rational number as a parameter and compares it to the
 * reference object. I only use multiplication as integer division will lead to
 * incorrect results. I return a boolean value (marks out of 8: 8). - Comment:
 * Again I use division but with floats. Simplify Method - My program returns a
 * rational number but not a new rational number, instead it returns the current
 * reference which is this. It doesn't take any parameters as it works only with
 * the reference object. I first find the greatest common divisor (GCD) between
 * the numerator and denominator, and then obtain the new numerator and
 * denominator by dividing to the GCD (marks out of 8: 8). - Comment: My program
 * does all of this. gcd function - My program returns the greatest common
 * divider of two integers: the numerator and the denominator (marks out of 6:
 * 6). - Comment: Yup, using ArrayLists of divisors for the two integers.
 * toString Method - My program returns a string showing the fraction
 * representation of the number, eg. "1/2". It takes no parameters (marks out of
 * 4: 4). - Comment: Yup. Test Client Class - My program asks the user for two
 * rational numbers, creates two rational objects using the constructor and
 * passing in the provided values, calls addition, subtraction, multiplication,
 * division, comparison and simplification and prints out the results (marks out
 * of 22: 22). - Comment: Yup, with error handling and good formatting.
 */
/*
 * import java.util.ArrayList;
 * 
 * public class Rational { int numerator; int denominator = 1;
 * 
 * Rational(int numerator, int denominator) { this.numerator = numerator;
 * this.denominator = denominator; }
 * 
 * Rational(int numerator) { this.numerator = numerator; }
 * 
 * public Rational add(Rational givenRational) { if (this.denominatorIsZero() &&
 * this.numeratorIsZero()) { Rational newRational = new
 * Rational(givenRational.numerator, givenRational.denominator); return
 * newRational; } else if (givenRational.denominatorIsZero() &&
 * givenRational.numeratorIsZero()) { Rational newRational = new
 * Rational(this.numerator, this.denominator); return newRational; } else { int
 * commonDenominator = this.denominator * givenRational.denominator; int
 * firstRationalNumerator = this.numerator * givenRational.denominator; int
 * secondRationalNumerator = givenRational.numerator * this.denominator; int
 * newNumerator = firstRationalNumerator + secondRationalNumerator; Rational
 * newRational = new Rational(newNumerator, commonDenominator); return
 * newRational; } }
 * 
 * public Rational subtract(Rational givenRational) { if
 * (this.denominatorIsZero() && this.numeratorIsZero()) { Rational newRational =
 * new Rational(givenRational.numerator * -1, givenRational.denominator); return
 * newRational; } else if (givenRational.denominatorIsZero() &&
 * givenRational.numeratorIsZero()) { Rational newRational = new
 * Rational(this.numerator, this.denominator); return newRational; } else { int
 * commonDenominator = this.denominator * givenRational.denominator; int
 * firstRationalNumerator = this.numerator * givenRational.denominator; int
 * secondRationalNumerator = givenRational.numerator * this.denominator; int
 * newNumerator = firstRationalNumerator - secondRationalNumerator; Rational
 * newRational = new Rational(newNumerator, commonDenominator); return
 * newRational; } }
 * 
 * public Rational multiply(Rational givenRational) { int commonDenominator =
 * this.denominator * givenRational.denominator; int newNumerator =
 * this.numerator * givenRational.numerator; Rational newRational = new
 * Rational(newNumerator, commonDenominator); return newRational; }
 * 
 * public Rational divide(Rational givenRational) { Rational newSecondRational =
 * new Rational(givenRational.denominator, givenRational.numerator); Rational
 * newRational = multiply(newSecondRational); return newRational; }
 * 
 * public boolean equals(Rational givenRational) { if (this.denominatorIsZero()
 * && givenRational.denominatorIsZero()) { return true; } else if
 * (this.denominatorIsZero() || givenRational.denominatorIsZero()) { return
 * false; } else { float firstRational = this.numerator / this.denominator;
 * float secondRational = givenRational.numerator / givenRational.denominator;
 * if (firstRational == secondRational) { return true; } else { return false; }
 * } }
 * 
 * public boolean isLessThan(Rational givenRational) { float firstFloat = 0;
 * float secondFloat = 0; if (this.denominatorIsZero()) { firstFloat = 0; } else
 * { firstFloat = this.numerator / this.denominator; } if
 * (givenRational.denominatorIsZero()) { secondFloat = 0; } else { secondFloat =
 * givenRational.numerator / givenRational.denominator; } if (firstFloat <
 * secondFloat) { return true; } else { return false; } }
 * 
 * public Rational simplify() { if (!this.denominatorIsZero()) {
 * this.fixSigns(); if (this.numeratorIsZero()) { this.denominator = 0; } else {
 * int gcd = GCD(this); int newNumerator = this.numerator/gcd; int
 * newDenominator = this.denominator/gcd; this.numerator = newNumerator;
 * this.denominator = newDenominator; } } return this; }
 * 
 * public void fixSigns() { if (this.denominator < 0) { this.numerator *= -1;
 * this.denominator *= -1; } }
 * 
 * public int GCD(Rational rational) { int gcd = 0; ArrayList<Integer>
 * numeratorDivisors = new ArrayList<Integer>(); int numeratorLimit =
 * Math.abs(rational.numerator); if (numeratorLimit > 1) { if (numeratorLimit %
 * 2 != 0) { numeratorLimit /= 2; numeratorLimit += 1; } else { numeratorLimit
 * /= 2; } } for (int i = 1; i <= numeratorLimit; i++) { if
 * ((Math.abs(rational.numerator) % i) == 0) { numeratorDivisors.add(i); } }
 * numeratorDivisors.add(Math.abs(rational.numerator)); ArrayList<Integer>
 * denominatorDivisors = new ArrayList<Integer>(); int denominatorLimit =
 * rational.denominator; if (denominatorLimit > 1) { if (denominatorLimit % 2 !=
 * 0) { denominatorLimit /= 2; denominatorLimit += 1; } else { denominatorLimit
 * /= 2; } } for (int i = 1; i <= denominatorLimit; i++) { if
 * ((rational.denominator % i) == 0) { denominatorDivisors.add(i); } }
 * denominatorDivisors.add(rational.denominator); for (int i = 0; i <
 * numeratorDivisors.size(); i++) { for (int j = 0; j <
 * denominatorDivisors.size(); j++) { if (numeratorDivisors.get(i) ==
 * denominatorDivisors.get(j)) { gcd = numeratorDivisors.get(i); } } } return
 * gcd; }
 * 
 * public boolean denominatorIsZero() { if (this.denominator == 0) { return
 * true; } else { return false; } }
 * 
 * public boolean numeratorIsZero() { if (this.numerator == 0) { return true; }
 * else { return false; } }
 * 
 * public String toString() { String result = ""; result += this.numerator + "/"
 * + this.denominator; return result; } }
 * 
 * 
 * 
 * 
 * 
 * 
 * import java.util.Scanner;
 * 
 * public class RationalTest { public static void main(String[] args) {
 * System.out.print("Enter a fraction (a/b): "); Scanner inputScanner = new
 * Scanner(System.in).useDelimiter("/|\r"); if (inputScanner.hasNextInt()) { int
 * firstRationalNumerator = inputScanner.nextInt(); if
 * (inputScanner.hasNextInt()) { int firstRationalDenominator =
 * inputScanner.nextInt(); Rational firstRational = new
 * Rational(firstRationalNumerator, firstRationalDenominator);
 * System.out.print("Enter a second fraction (a/b): "); inputScanner = new
 * Scanner(System.in).useDelimiter("/|\r"); if (inputScanner.hasNextInt()) { int
 * secondRationalNumerator = inputScanner.nextInt(); if
 * (inputScanner.hasNextInt()) { int secondRationalDenominator =
 * inputScanner.nextInt(); Rational secondRational = new
 * Rational(secondRationalNumerator, secondRationalDenominator);
 * inputScanner.close(); if (firstRational.denominatorIsZero() &&
 * !firstRational.numeratorIsZero()) {
 * System.out.println("Cannot divide by zero!"); } else if
 * (secondRational.denominatorIsZero() && !secondRational.numeratorIsZero()) {
 * System.out.println("Cannot divide by zero!"); } else {
 * System.out.println("\nSimplified:"); System.out.println("First fraction: " +
 * firstRational.simplify().toString()); System.out.println("Second fraction: "
 * + secondRational.simplify().toString()); System.out.println("\nAddition:");
 * System.out.println("a + b = " +
 * firstRational.add(secondRational).simplify().toString());
 * System.out.println("\nSubtraction:"); System.out.println("a - b = " +
 * firstRational.subtract(secondRational).simplify().toString());
 * System.out.println("b - a = " +
 * secondRational.subtract(firstRational).simplify().toString());
 * System.out.println("\nMultiplication:"); System.out.println("a * b = " +
 * firstRational.multiply(secondRational).simplify().toString());
 * System.out.println("\nDivision:"); if (secondRational.denominatorIsZero()) {
 * System.out.println("a / b is undefined."); } else {
 * System.out.println("a / b = " +
 * firstRational.divide(secondRational).simplify().toString()); } if
 * (firstRational.denominatorIsZero()) {
 * System.out.println("b / a is undefined."); } else {
 * System.out.println("b / a = " +
 * secondRational.divide(firstRational).simplify().toString()); }
 * System.out.println("\nEquals: " + firstRational.equals(secondRational));
 * System.out.println("\nFirst is less than second: " +
 * firstRational.isLessThan(secondRational));
 * System.out.println("Second is less than first: " +
 * secondRational.isLessThan(firstRational)); } } else {
 * System.out.println("Invalid input."); } } else {
 * System.out.println("Invalid input."); } } else {
 * System.out.println("Invalid input."); } } else {
 * System.out.println("Invalid input."); } } }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * package noughtsAndCrosses; import java.util.Scanner; public class
 * noughtsAndCrosses { static char[][] board = new char[3][3]; static char[]
 * firstRow = new char[3]; static char[] secondRow = new char[3]; static char[]
 * thirdRow = new char[3]; static char[] firstColumn = new char[3]; static
 * char[] secondColumn = new char[3]; static char[] thirdColumn = new char[3];
 * public static int row; public static int column; public static boolean
 * isBoardFull; public static boolean canMakeMove ; public static char winner;
 * 
 * 
 * public static void main(String[] args) {
 * 
 * clearBoard(board); printBoard(board);
 * 
 * 
 * }
 * 
 * 
 * public static void clearBoard(char [][] board) { for (int row = 0; row < 3;
 * row++) { for (int col = 0; col < 3; col++) { board [row][col] = ' '; }
 * 
 * }
 * 
 * 
 * 
 * } public static void printBoard(char[][] board) {
 * System.out.println("       0               1                2   ");
 * System.out.println("0    " + board[0][0] + "        |       " + board[0][1] +
 * "         |        " + board[0][2]);
 * System.out.println(" ---------------------------------------------");
 * System.out.println("1    " + board[1][0] + "        |      " + board[1][1] +
 * "          |        " + board[1][2]);
 * System.out.println(" ---------------------------------------------");
 * System.out.println("2    " + board[2][0] + "        |       " + board[2][1] +
 * "         |        " + board[2][2]);
 * 
 * 
 * 
 * } public static boolean canMakeMove(char[][] board, int row , int column) {
 * if(board [row][column] == ' ' ) { canMakeMove = true; } else { canMakeMove =
 * false; }
 * 
 * 
 * return canMakeMove; }
 * 
 * public static void makeMove(char[][] board, char currentPlayerPiece,int
 * row,int column) { int n =0; Scanner input = new Scanner(System.in); row =
 * input.nextInt(); column = input.nextInt(); if(n % 2 ==0) { board[row][column]
 * = 'X'; } else { board[row][column] = 'O'; } input.close();
 * 
 * 
 * 
 * 
 * } public static boolean isBoardFull(char [][] board) { char[][] boardCloned =
 * new char[3][3]; boardCloned[0][1] = 'X'; boardCloned[0][2] = 'O';
 * boardCloned[0][0] = 'X'; boardCloned[1][0] = 'O'; boardCloned[1][1] = 'X';
 * boardCloned[1][2] = 'O'; boardCloned[2][0] = 'X'; boardCloned[2][1] = 'X';
 * boardCloned[2][2] = 'O';
 * 
 * 
 * 
 * 
 * if(board.equals(boardCloned)) { isBoardFull = true; } else { isBoardFull =
 * false; }
 * 
 * return isBoardFull; }
 * 
 * public static char winner(char[][] board) {
 * 
 * 
 * 
 * return winner; }
 * 
 * 
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * import java.util.ArrayList; import java.util.Date;
 * 
 * public class Employee { private final int employeeId; private String name;
 * private Date promotionDate; private int role; private
 * ArrayList<EmployeeAppraisal> appraisalHistory;
 * 
 * public Employee(int employeeId, String name, int role) { this.employeeId =
 * employeeId; this.name = name; this.promotionDate = null; this.role = role;
 * this.appraisalHistory = new ArrayList<EmployeeAppraisal>(); } public String
 * getName() { return name; } public void setName(String name) { this.name =
 * name; } public Date getPromotionDate() { return promotionDate; } public void
 * setPromotionDate(Date promotionDate) { this.promotionDate = promotionDate; }
 * public int getRole() { return role; } public void setRole(int role) {
 * this.role = role; } public ArrayList<EmployeeAppraisal> getAppraisalHistory()
 * { return appraisalHistory; } public void
 * setAppraisalHistory(ArrayList<EmployeeAppraisal> appraisalHistory) {
 * this.appraisalHistory = appraisalHistory; } public int getEmployeeId() {
 * return employeeId; }
 * 
 * @Override public String toString() { return "Employee [employeeId=" +
 * employeeId + ", name=" + name + ", promotionDate=" + promotionDate +
 * ", role=" + role + ", appraisalHistory=" + appraisalHistory + "]"; }
 * 
 * 
 * 
 * }
 * 
 * import java.util.Date;
 * 
 * public class EmployeeAppraisal { private Date appraisalDate; private int
 * appraisalScore;
 * 
 * 
 * public EmployeeAppraisal(Date appraisalDate, int appraisalScore) {
 * this.appraisalDate = appraisalDate; this.appraisalScore = appraisalScore;
 * 
 * }
 * 
 * public Date getAppraisalDate() { return appraisalDate; } public void
 * setAppraisalDate(Date appraisalDate) { this.appraisalDate = appraisalDate; }
 * public int getAppraisalScore() { return appraisalScore; } public void
 * setAppraisalScore(int appraisalScore) { this.appraisalScore = appraisalScore;
 * }
 * 
 * @Override public String toString() { return
 * "EmployeeAppraisal [appraisalDate=" + appraisalDate + ", appraisalScore=" +
 * appraisalScore + "]"; }
 * 
 * 
 * 
 * }
 * 
 * 
 * import java.text.ParseException; import java.text.SimpleDateFormat; import
 * java.util.Date; import java.util.Scanner;
 * 
 * public class HRClient {
 * 
 * public static int employeeId = 110000;
 * 
 * public static void main(String[] args) { boolean exit = false; HRDepartment
 * hrDepartment = new HRDepartment(); Scanner scanner = new Scanner(System.in);
 * while (!exit) { System.out.
 * println("Please enter 1 to add an employee, 2 to view all employees, \n" +
 * "3 to record an employee appraisal, 4 to promote an employee and 5 to exit");
 * if (scanner.hasNextInt()) { int userInput = scanner.nextInt(); switch
 * (userInput) { case 1: { System.out.
 * println("Separated by spaces, please enter the employee's first name followed by his/her role code \n"
 * +
 * "(1 for Executive, 2 for manager, 3 for team lead, 4 for designer, 5 for developer and 6 for tester)"
 * ); if (scanner.hasNext()) { String employeeName = scanner.next(); if
 * (scanner.hasNextInt()) { int role = scanner.nextInt(); if (role >=
 * HRCodes.EXECUTIVE && role <= HRCodes.TESTER){
 * hrDepartment.addEmployee(employeeId++, employeeName, role); } else {
 * System.out.println("Role code must be between " + HRCodes.EXECUTIVE + " and "
 * + HRCodes.TESTER); } } }
 * 
 * break; } case 2: { hrDepartment.printAllEmployees(); break; } case 3: {
 * System.out.
 * println("Separated by spaces please enter the employeeId \nfollowed by " +
 * "appraisal score code (1 for 'exceeded expectations', " +
 * "2 for 'met expectations' and 3 for 'did not meet expectations') \n" +
 * "followed by the appraisal date in the following format 'dd-mm-yyyy')"); if
 * (scanner.hasNextInt()) { int employeeId = scanner.nextInt(); if
 * (scanner.hasNextInt()) { int score = scanner.nextInt(); if (score >=
 * HRCodes.EXCEEDED_EXPECTATIONS && score <= HRCodes.DID_NOT_MEET_EXPECTATIONS)
 * { if (scanner.hasNext()) { String date = scanner.next(); SimpleDateFormat
 * formatter = new SimpleDateFormat("dd-mm-yyyy"); Date appraisalDate = null;
 * try { appraisalDate = formatter.parse(date); } catch (ParseException e) {
 * System.out.println("Invalid date entered"); e.printStackTrace(); } if
 * (!hrDepartment.recordEmployeeAppraisal(employeeId, appraisalDate, score)) {
 * System.out.
 * println("Appraisal could not be recorded. Please check the employee id enetered"
 * ); } } } else { System.out.println("Invalid score entered"); } } } break; }
 * case 4: {
 * System.out.println("Please enter the Id (integer) of the employee to promote"
 * ); if (scanner.hasNextInt()) { int employeeId = scanner.nextInt(); if
 * (hrDepartment.promoteEmployee(employeeId)) {
 * System.out.println("Employee has been promoted"); } else { System.out.
 * println("Employee is not eligible for promotion or employee id is incorrect"
 * ); } } break; } case 5: { exit = true; break; } }
 * 
 * } } scanner.close();
 * 
 * }
 * 
 * }
 * 
 * 
 * public interface HRCodes {
 * 
 * //Appraisal Scores int EXCEEDED_EXPECTATIONS = 1; int MET_EXPECTATIONS = 2;
 * int DID_NOT_MEET_EXPECTATIONS = 3;
 * 
 * //Roles int EXECUTIVE = 1; int MANAGER = 2; int DESIGNER = 3; int DEVELOPER =
 * 4; int TESTER = 5;
 * 
 * //appraisals before eligible for promotion int MIN_APPRAISALS = 2; }
 * 
 * 
 * 
 * import java.util.*; public class HRDepartment { ArrayList<Employee>
 * employeeList = new ArrayList<Employee>();
 * 
 * public void addEmployee(int employeeId,String name,int role) { Employee
 * myEmployee = new Employee(employeeId,name,role);
 * employeeList.add(myEmployee); }
 * 
 * public void printAllEmployees() { for(int i=0;i<= employeeList.size();i++) {
 * Employee myEmployee = employeeList.get(i); System.out.println("ID :" +
 * myEmployee.getEmployeeId() ); System.out.println("Name :" +
 * myEmployee.getName()); System.out.println("PromotionDate :" +
 * myEmployee.getPromotionDate()); System.out.println("Role :" +
 * myEmployee.getRole()); System.out.println("AppraisalHistory :" +
 * myEmployee.getAppraisalHistory());
 * 
 * } }
 * 
 * public Employee findEmployee(int employeeId) { int employeeID = 0; String
 * name = "employeeNotFound"; int role = 0; Employee correctEmployee = new
 * Employee(employeeID,name,role); for(int i=0;i<= employeeList.size();i++) {
 * Employee myEmployee = employeeList.get(i); if(myEmployee.getEmployeeId() ==
 * employeeId) { correctEmployee = myEmployee; }
 * 
 * } return correctEmployee;
 * 
 * 
 * }
 * 
 * public boolean recordEmployeeAppraisal(int employeeId,Date appraisalDate,int
 * score) { boolean correctEmployee; Employee myEmployee
 * =findEmployee(employeeId); if(myEmployee.getEmployeeId() != 0) {
 * EmployeeAppraisal myAppraisal = new EmployeeAppraisal(appraisalDate,score);
 * myEmployee.getAppraisalHistory().add(myAppraisal); correctEmployee = true; }
 * else { correctEmployee = false; } return correctEmployee; }
 * 
 * /*public boolean promoteEmployee(int employeeId) { findEmployee(employeeId);
 * }
 * 
 * 
 * }
 * 
 * 
 * public class Commodity extends MyAssets{
 * 
 * public int totalShares;
 * 
 * public Commodity(String citi, double v) { setSymbol(citi); }
 * 
 * 
 * public int getTotalShares() { return totalShares; }
 * 
 * public void setTotalShares(int totalShares) { this.totalShares = totalShares;
 * }
 * 
 * public double marketVal(){ return getCurrentPrice() * totalShares; }
 * 
 * public double profit(){ return marketVal() - getTotalCost(); }
 * 
 * public void purchase(int shares, double priceShare){ totalShares += shares;
 * totalCost += shares * priceShare;
 * 
 * }
 * 
 * public String toString() { return symbol + " (" + totalShares + " shares, $"
 * + totalCost + " total cost)"; } }
 * 
 * 
 * public class Currency implements Portfolio { private final double amount;
 * 
 * public Currency(double currency) { this.amount = currency; }
 * 
 * @Override public double marketVal() { return amount; }
 * 
 * @Override public double profit() { return 0; }
 * 
 * }
 * 
 * public class MyAssets implements Portfolio {
 * 
 * public String symbol; public double totalCost; public double currentPrice;
 * 
 * 
 * public String getSymbol() { return symbol; }
 * 
 * public void setSymbol(String symbol) { this.symbol = symbol; }
 * 
 * public double getTotalCost() { return totalCost; }
 * 
 * public void setTotalCost(double totalCost) { this.totalCost = totalCost; }
 * 
 * public double getCurrentPrice() { return currentPrice; }
 * 
 * public void setCurrentPrice(double currentprice) { this.currentPrice =
 * currentprice; }
 * 
 * @Override public double marketVal() { return 0; }
 * 
 * @Override public double profit() { return 0; } }
 * 
 * public interface Portfolio { public double marketVal(); public double
 * profit(); public abstract String toString();
 * 
 * 
 * }
 * 
 * public class PortfolioTest { public static void main(String[] args) {
 * Portfolio[] investments = new Portfolio[4]; investments[0] = new
 * Commodity("CITI", 30.00); investments[1] = new Currency(500.00);
 * investments[2] = new Currency(1200.54); investments[3] = new Commodity("DAA",
 * 25.00);
 * 
 * ((Commodity)investments[0]).purchase(10, 30.00);
 * ((Commodity)investments[0]).setCurrentPrice(27.50);
 * 
 * ((Commodity)investments[3]).purchase(30, 20.00);
 * ((Commodity)investments[3]).setCurrentPrice(23.00);
 * 
 * for (int i = 0; i < investments.length; i++) {
 * System.out.println(investments[i]); System.out.println("Market value is: " +
 * investments[i].marketVal() + ", profit is: " + investments[i].profit());
 * System.out.println(); } } }
 * 
 * /****************************************************************************
 * ** name: Donna Gabai netID: dgabai precept: P99
 * 
 * Description: PokerHand data type. Can construct a hand from standard input,
 * format a hand for output, determine if a hand is a flush or a full house.
 * Test main() sets up 5-card poker hands from standard input, prints flushes
 * and full houses (one per line).
 * 
 * Dependencies: StdIn, StdOut
 * 
 * 
 * public class PokerHand { // class constants private static final int HANDSIZE
 * = 5; // 5 cards per hand
 * 
 * // instance variables private String[] hand; // each String is one card
 * 
 * // constructor reads a 5-card poker hand from StdIn public PokerHand() { hand
 * = new String[HANDSIZE]; for (int i = 0; i < HANDSIZE; i++) { hand[i] =
 * StdIn.readString(); }
 * 
 * // sort the hand, note Queen is higher than King! // Ten is highest of all!
 * // 2, 3, 4, 5, 6, 7, 8, 9, A, J, K, Q, T java.util.Arrays.sort(hand);
 * 
 * }
 * 
 * // is this hand a flush? public boolean flush() { // looking for suit (last
 * character) all the same char suit = hand[0].charAt(1); for (int i = 1; i <
 * HANDSIZE; i++) { if (suit != hand[i].charAt(1)) return false; } // made it
 * through! ALL EQUAL! return true; }
 * 
 * // is this hand a full house? public boolean fullHouse() { // looking for 3
 * matching and 2 matching // since hand is sorted, first and last will be
 * different // first card char rank1 = hand[0].charAt(0); int sumRank1 = 1; //
 * last card char rank2 = hand[HANDSIZE - 1].charAt(0); int sumRank2 = 1; //
 * count cards similar to first and last cards for (int i = 1; i < HANDSIZE - 1;
 * i++) { if (hand[i].charAt(0) == rank1) sumRank1++; if (hand[i].charAt(0) ==
 * rank2) sumRank2++; }
 * 
 * // is it a full house? if (sumRank1 == 3 && sumRank2 == 2) return true; if
 * (sumRank1 == 2 && sumRank2 == 3) return true; // no full house :( return
 * false; }
 * 
 * // string representation of this hand sorted public String toString() {
 * String wholeHand = ""; for (int i = 0; i < HANDSIZE; i++) wholeHand =
 * wholeHand + hand[i] + " "; return wholeHand; }
 * 
 * // test main public static void main(String[] args) { // input one hand at a
 * time // output it if it is a flush or full house while (!StdIn.isEmpty()) {
 * PokerHand ph = new PokerHand(); if (ph.flush()) StdOut.println("     Flush: "
 * + ph); if (ph.fullHouse()) StdOut.println("Full house: " + ph); } } }
 * 
 * 
 * /* class PlayingCardException: It is used for errors related to Card and Deck
 * objects
 * 
 * class PlayingCardException extends Exception {
 * 
 * /* Constructor to create a PlayingCardException object PlayingCardException
 * (){ super (); }
 * 
 * PlayingCardException ( String reason ){ super ( reason ); } }
 * 
 * 
 * /** class Card : for creating playing card objects it is an immutable class.
 * Rank - valid values are 1 to 13 Suit - valid values are 0 to 3
 * 
 * class Card {
 * 
 * constant suits and ranks static final String[] Suit = {"Clubs", "Diamonds",
 * "Hearts", "Spades" }; static final String[] Rank =
 * {"","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
 * 
 * Data field of a card: rank and suit private int cardRank; values: 1-13 (see
 * Rank[] above) private int cardSuit; values: 0-3 (see Suit[] above)
 * 
 * Constructor to create a card throw PlayingCardException if rank or suit is
 * invalid
 * 
 * public Card(int rank, int suit) throws PlayingCardException { if ((rank < 1)
 * || (rank > 13)) throw new PlayingCardException("Invalid rank:"+rank); else
 * cardRank = rank; if ((suit < 0) || (suit > 3)) throw new
 * PlayingCardException("Invalid suit:"+suit); else cardSuit = suit; }
 * 
 * 
 * Accessor and toString You may impelemnt equals(), but it will not be used
 * public int getRank() { return cardRank; } public int getSuit() { return
 * cardSuit; } public String toString() { return Rank[cardRank] + " " +
 * Suit[cardSuit]; }
 * 
 * 
 * Few quick tests here public static void main(String args[]) { try { Card c1 =
 * new Card(1,3); // A Spades System.out.println(c1); c1 = new Card(10,0); // 10
 * Clubs System.out.println(c1); c1 = new Card(10,5); // generate exception here
 * } catch (PlayingCardException e) {
 * System.out.println("PlayingCardException: "+e.getMessage()); } } }
 * 
 * 
 *//**
 * class Decks represents : n decks of 52 playing cards Use class Card to
 * construct n * 52 playing cards!
 *
 * Do not add new data fields! Do not modify any methods You may add private
 * methods
 */
/*
 * 
 * class Decks {
 * 
 * this is used to keep track of original n*52 cards private List<Card>
 * originalDecks;
 * 
 * this starts with n*52 cards deck from original deck it is used to keep track
 * of remaining cards to deal see reset(): it resets dealDecks to a full deck
 * private List<Card> dealDecks;
 * 
 * number of decks in this object private int numberDecks;
 * 
 * 
 *//**
 * Constructor: Creates default one deck of 52 playing cards in originalDecks
 * and copy them to dealDecks. initialize numberDecks=n Note: You need to catch
 * PlayingCardException from Card constructor Use ArrayList for both
 * originalDecks & dealDecks
 */
/*
 * 
 * public Decks() { // implement this method! try { originalDecks = new
 * ArrayList<Card>(); for (int rank = 1; rank <= 13; rank++) { for (int suit =
 * 0; suit <= 3; suit++) { Card tempCard = new Card(rank, suit);
 * originalDecks.add(tempCard); } } } catch (PlayingCardException e) {
 * System.err.println("Rank or Suit is invalid"); } dealDecks = new
 * ArrayList<Card>(); dealDecks.addAll(originalDecks); }
 * 
 * 
 *//**
 * Constructor: Creates n decks (52 cards each deck) of playing cards in
 * originalDecks and copy them to dealDecks. initialize numberDecks=n Note: You
 * need to catch PlayingCardException from Card constructor Use ArrayList for
 * both originalDecks & dealDecks
 */
/*
 * public Decks(int n) { // implement this method! try { originalDecks = new
 * ArrayList<Card>(); for (int i = 0; i < n; i++) { for (int rank = 1; rank <=
 * 13; rank++) { for (int suit = 0; suit <= 3; suit++) { Card tempCard = new
 * Card(rank, suit); originalDecks.add(tempCard); } } } } catch
 * (PlayingCardException e) { System.err.println("Rank or Suit is invalid!"); }
 * dealDecks = new ArrayList<Card>(); dealDecks.addAll(originalDecks);
 * 
 * }
 * 
 *//**
 * Task: Shuffles cards in deal deck. Hint: Look at java.util.Collections
 */
/*
 * public void shuffle() { Collections.shuffle(dealDecks);
 * 
 * }
 * 
 *//**
 * Task: Deals cards from the deal deck.
 *
 * @param numberCards number of cards to deal
 * @return a list containing cards that were dealt
 * @throw PlayingCardException if numberCard > number of remaining cards
 *
 *        Note: You need to create ArrayList to stored dealt cards and should
 *        removed dealt cards from dealDecks
 *
 */
/*
 * public List<Card> deal(int numberCards) throws PlayingCardException { //
 * implement this method! ArrayList<Card> playerHand = new ArrayList<Card>(); if
 * (numberCards > dealDecks.size()) { throw new
 * PlayingCardException("Number of Cards cannot exceed deck size"); } else { for
 * (int i = 0; i < numberCards; i++) { Card tempCard = dealDecks.remove(0);
 * playerHand.add(tempCard); } return playerHand; } }
 *//**
 * Task: Resets deal deck by getting all cards from the original deck.
 */
/*
 * public void reset() { // implement this method! dealDecks.clear();
 * dealDecks.addAll(originalDecks); }
 * 
 *//**
 * Task: Return number of remaining cards in deal deck.
 */
/*
 * public int remain() { return dealDecks.size(); }
 * 
 *//**
 * Task: Returns a string representing cards in the deal deck
 */
/*
 * public String toString() { return ""+dealDecks; }
 * 
 * 
 * Quick test
 * 
 * Do not modify these tests Generate 2 decks of cards Loop 2 times: Deal 30
 * cards for 4 times Expect exception last time reset()
 * 
 * public static void main(String args[]) {
 * 
 * System.out.println("*******    Create 2 decks of cards      *********\n\n");
 * Decks decks = new Decks(2);
 * 
 * for (int j=0; j < 2; j++) {
 * System.out.println("\n************************************************\n");
 * System.out.println("Loop # " + j + "\n");
 * System.out.println("Before shuffle:"+decks.remain()+" cards");
 * System.out.println("\n\t"+decks);
 * System.out.println("\n==============================================\n");
 * 
 * int numHands = 4; int cardsPerHand = 30;
 * 
 * for (int i=0; i < numHands; i++) { decks.shuffle();
 * System.out.println("After shuffle:"+decks.remain()+" cards");
 * System.out.println("\n\t"+decks); try {
 * System.out.println("\n\nHand "+i+":"+cardsPerHand+" cards");
 * System.out.println("\n\t"+decks.deal(cardsPerHand));
 * System.out.println("\n\nRemain:"+decks.remain()+" cards");
 * System.out.println("\n\t"+decks);
 * System.out.println("\n==============================================\n"); }
 * catch (PlayingCardException e) {
 * System.out.println("*** In catch block : PlayingCardException : msg : "+e.
 * getMessage()); } }
 * 
 * 
 * decks.reset(); } }
 * 
 * }
 * 
 * 
 * 
 * /* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code? 
       Mark out of 5: 5
       Comment: Used MAX_ATTEMPTS to cap attempts
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
       Mark out of 5: 5
       Comment: MAX_ATTEMPTS is properly formatted
   3. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 10
       Comment: All variable names are self-explanatory
   4. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 5: 5
       Comment: All the variables are properly formatted
   5. Did I indent the code appropriately? 
       Mark out of 10: 10
       Comment: All code blocks are indented accordingly
   6. Did I use an appropriate loop to allow the user to enter their guesses until they win or lose? 
       Mark out of 20: 20
       Comment: I used a do-while loop as the user will always input an answer at least once
   7. Did I check the input to ensure that invalid input was handled appropriately? 
       Mark out of 10: 10
       Comment: Any input other than higher, lower or equal is handled, and the question is repeated
   8. Did I generate the cards properly using random number generation (assuming all cards are equally likely each time)? 
       Mark out of 10: 10
       Comment: Yes, assuming java.util.Random supplies properly random numbers
   9. Did I output the cards correctly as 2, 3, 4, ... 9, 10, Jack, Queen, King? 
       Mark out of 10: 10
       Comment: Yes, including changing "a 8" to "an 8"
   10. Did I report whether the user won or lost the game before the program finished? 
       Mark out of 10: 10
       Comment: Yes, it says congratulations if the user guesses correctly 4 times and says they lost if they guess incorrectly before then
   11. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: It's all accurate
   Total Mark out of 100 (Add all the previous marks): 100

import java.util.Random;
import java.util.Scanner;

public class HiLoCardGame {
	
	public static final int MAX_ATTEMPTS = 4;
	
	public static void main(String[] args) {

		boolean finished = false;
		Random randomGen = new Random();
		int answer = 0;
		int randomNum = randomGen.nextInt(13) + 1;
		int randomNum2 = randomGen.nextInt(13) + 1;
		int count = MAX_ATTEMPTS;
		
		do {
			
			randomNum2 = randomGen.nextInt(13) + 1;
			
			if (randomNum == 7) {
				System.out.println("The card is an 8");
			} else if (randomNum >= 1 && randomNum <= 9) {
				System.out.println("The card is a " + randomNum);
			} else if (randomNum == 10) {
				System.out.println("The card is a Jack");
			} else if (randomNum == 11) {
				System.out.println("The card is a Queen");
			} else if (randomNum == 12) {
				System.out.println("The card is a King");
			} else if (randomNum == 13) {
				System.out.println("The card is an Ace");
			}
			
			Scanner inputScanner = new Scanner(System.in);
			System.out.print("Do you think the next card will be higher, lower or equal? ");
			
			if (inputScanner.hasNext("higher")) {
				answer = 1;
			} else if (inputScanner.hasNext("lower")) {
				answer = -1;
			} else if (inputScanner.hasNext("equal")) {
				answer = 0;
			} else {
				System.out.println("Invalid input.");
				continue;
			}
			
			if (randomNum < randomNum2) {
				if (answer == 1) {
					randomNum = randomNum2;
					count--;
				} else if (answer == -1 || answer == 0) {
					if (randomNum2 == 7) {
						System.out.println("You lose, the card was an 8");
					} else if (randomNum2 >= 1 && randomNum2 <= 9) {
						System.out.println("You lose, the card was a " + randomNum2);
					} else if (randomNum2 == 10) {
						System.out.println("You lose, the card was a Jack");
					} else if (randomNum2 == 11) {
						System.out.println("You lose, the card was a Queen");
					} else if (randomNum2 == 12) {
						System.out.println("You lose, the card was a King");
					} else if (randomNum2 == 13) {
						System.out.println("You lose, the card was an Ace");
					}
					inputScanner.close();
					finished = true;
				}
			} else if (randomNum > randomNum2) {
				if (answer == -1) {
					randomNum = randomNum2;
					count--;
				} else if (answer == 1 || answer == 0) {
					if (randomNum2 == 7) {
						System.out.println("You lose, the card was an 8");
					} else if (randomNum2 >= 1 && randomNum2 <= 9) {
						System.out.println("You lose, the card was a " + randomNum2);
					} else if (randomNum2 == 10) {
						System.out.println("You lose, the card was a Jack");
					} else if (randomNum2 == 11) {
						System.out.println("You lose, the card was a Queen");
					} else if (randomNum2 == 12) {
						System.out.println("You lose, the card was a King");
					} else if (randomNum2 == 13) {
						System.out.println("You lose, the card was an Ace");
					}
					inputScanner.close();
					finished = true;
				}
			} else if (randomNum == randomNum2) {
				if (answer == 0) {
					randomNum = randomNum2;
					count--;
				} else if (answer == 1 || answer == -1) {
					if (randomNum2 == 7) {
						System.out.println("You lose, the card was an 8");
					} else if (randomNum2 >= 1 && randomNum2 <= 9) {
						System.out.println("You lose, the card was a " + randomNum2);
					} else if (randomNum2 == 10) {
						System.out.println("You lose, the card was a Jack");
					} else if (randomNum2 == 11) {
						System.out.println("You lose, the card was a Queen");
					} else if (randomNum2 == 12) {
						System.out.println("You lose, the card was a King");
					} else if (randomNum2 == 13) {
						System.out.println("You lose, the card was an Ace");
					}
					inputScanner.close();
					finished = true;
				}
			}
			
			if (count == 0) {
				
				if (randomNum == 7) {
					System.out.println("The card is an 8");
				} else if (randomNum >= 1 && randomNum <= 9) {
					System.out.println("The card is a " + randomNum);
				} else if (randomNum == 10) {
					System.out.println("The card is a Jack");
				} else if (randomNum == 11) {
					System.out.println("The card is a Queen");
				} else if (randomNum == 12) {
					System.out.println("The card is a King");
				} else if (randomNum == 13) {
					System.out.println("The card is an Ace");
				}
				
				System.out.println("Congratulations. You got them all correct.");
				inputScanner.close();
				finished = true;
			
			}
			
		} while (!finished);		
		
	}

}




import java.util.Arrays;
// copying 2d array
public class Main {
 
    public static int[][] copy(int[][] src) {
        if (src == null) {
            return null;
        }
 
        int[][] copy = new int[src.length][];
        for (int i = 0; i < src.length; i++) {
            copy[i] = src[i].clone();
        }
 
        return copy;
    }
 
    public static void main(String[] args) {
        int[][] src = new int[][] {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12}
        };
 
        int[][] copy = copy(src);
        System.out.println(Arrays.deepToString(copy));
    }
}



// Java program to print diamond star pattern
// Using while loop

// Importing input output classes
import java.io.*;

// Main class
public class GFG {

	// Main driver method
	public static void main(String[] args)
	{

		// Declaring and initializing variables

		// Variable initialized to the row where max star
		// should be there as after that they decreases to
		// give diamond pattern
		int number = 7;

		// Diamond starting with single star in first row
		int m = 1;

		// Columnar printing
		int n;

		// Outer loop 1
		// Prints the first half diamond

		// Condition holding true till
		// number of rows initialized
		while (m <= number) {
			n = 1;

			// Inner loop 1
			// Prints space until n++ <= number - m is false
			while (n++ <= number - m) {

				// Print whitespaces inbetween
				System.out.print(" ");
			}

			n = 1;

			// Inner loop 2
			// Prints star until n++ <= m * 2 - 1 is false
			while (n++ <= m * 2 - 1) {

				// Print star
				System.out.print("*");
			}

			// By now we are done for above pyramid printing
			// ending line after each row
			System.out.println();

			// Incrementing as we want pyramid generation
			m++;
		}

		// Now we are done with printing the upper half
		// diamond.

		// Note: Not to print the bottom row again in lower
		// half diamond printing Hence variable t be
		// initialized should one lesser than number
		m = number - 1;

		// Outer loop 2
		// Prints the second half diamond
		while (m > 0) {
			n = 1;

			// Inner loop 1
			// Prints spaces until n++ <= number - m is
			// false
			while (n++ <= number - m) {

				// Print whitespace in between
				System.out.print(" ");
			}

			n = 1;

			// Inner loop 2
			// Prints star until n++ <= m * 2 - 1 is false
			while (n++ <= m * 2 - 1) {

				// Print star
				System.out.print("*");
			}

			// Ending line after each row
			System.out.println();

			// Decrementing as we want reverse pyramid
			// generation
			m--;
		}
	}
}



//vanity num 
 * import java.util.Scanner;

public class StringToNumbers
{
    private static Scanner input;

    public static void main(String[] args)
    {
        input = new Scanner(System.in);
        System.out.println("Enter The Phone Number (With Letters): ");
        String initial_phone_number = input.nextLine();

        initial_phone_number = initial_phone_number.toUpperCase();
        long phone_number_final = full_number(initial_phone_number);

        System.out.printf("%nOutput phone number for '%s' is '%s'",
                initial_phone_number, phone_number_final);
    }

    public static long full_number(String initial_phone_number)
    {
        // Use long instead of int for 'number' if the string will be longer than max int value
        // 2147483647, which is '10 digits'
        long number = 0;
        int strLen = initial_phone_number.length();


        for (int currCharacter = 0; currCharacter < strLen; currCharacter++) 
        {
            char ch = initial_phone_number.charAt(currCharacter);
            // For A-Z & 0-9, multiply by 10, add the 'char' to number.
            // i.e., Shift existing value to the left by 1 digit, add current 'char' to it
            // Use long instead of int if the string will be longer than max int value (2147483647)

            if (Character.isLetter(ch)) 
            {
                switch(ch)
                {
                case 'A' : case 'B' : case 'C' : number *= 10; number += 2; break;
                case 'D' : case 'E' : case 'F' : number *= 10; number += 3; break;
                case 'G' : case 'H' : case 'I' : number *= 10; number += 4; break;
                case 'J' : case 'K' : case 'L' : number *= 10; number += 5; break;
                case 'M' : case 'N' : case 'O' : number *= 10; number += 6; break;
                case 'P' : case 'Q' : case 'R' : case 'S' : number *= 10; number += 7; break;
                case 'T' : case 'U' : case 'V' : number *= 10; number += 8; break;
                case 'W' : case 'X' : case 'Y' : case 'Z' : number *= 10; number += 9; break;
                }
            }
            else if (Character.isDigit(ch))
            {
                number *= 10; number += Character.getNumericValue(ch);
            }
            else
            {
                System.out.println("Invalid character!");
            }

        } // End of for loop

        // Return actual number only at the end of the function
        return number;

    }// End of full_number function    
}


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
  // combo lock
import javax.swing.JOptionPane ;
/**
 *
 * @author John

public class ComboLockTester
{
 public static void main (String args[])
 {
 
    ComboLock MasterLock = new ComboLock("J","A","P");
   System.out.println("The combination to MasterLock is " + MasterLock.getfirst() + MasterLock.getsecond()
           + MasterLock.getthird());
 
   String input = JOptionPane.showInputDialog("Enter first character");
   MasterLock.setPosition(input);
 
 
   String input2 = JOptionPane.showInputDialog("Enter second character");
   MasterLock.setPosition(input2);
 
   String input3 = JOptionPane.showInputDialog("Enter third character");
   MasterLock.setPosition(input3);
 
   System.out.println("The user entered combo is " + input + input2 + input3);
 
   MasterLock.tryToOpen();
 
   System.out.println(MasterLock.isOpen());
 
   MasterLock.lock();
 }
}


public class ComboLock
{
    /**
     	Creates a lock with a given combination consisting of three
upper-case characters.
     	@param first the first letter of the combination
	@param second the second letter of the combination
@param third the third letter of the combination
  
   private String first;
   private String second;
   private String third;
   private boolean open;
   private String Pos1;
   private String Pos2;
   private String Pos3;
   private int count;
 
 
 
   public ComboLock(String first, String second, String third)
   {
      open = false;
      this.first = first;
      this.second = second;
      this.third = third;
      count = 0;
   }
 
   public String getfirst()
   {
       return first;
   }
   public String getsecond()
   {
       return second;
   }
   public String getthird()
   {
       return third;
   }
 
   /**
      Set the dial to a position.
      @param aPosition a String consisting of a single uppercase
       letter (A..Z)

   public void setPosition(String aPosition)
   {
       count++;
 
   if(count==0)
   {
       Pos1 = aPosition ;
   }
   else if(count == 1)
       {
           Pos2 = aPosition;
       }
   else if(count == 2)
   {
       Pos3 = aPosition;
   }
  }
 
   /**
      Try opening the lock.

   public void tryToOpen()
   {
      if(Pos1.equals(first) && Pos2.equals(second) && Pos3.equals(third))
      {
          open = true;
          System.out.println("Combo correct! Lock is open.");
      }
      else
      {
          open = false;
          System.out.println("Wrong combo. Try again.");
      }
   }
 
   /**
   	 Check whether the lock is open.
   	 @return true or false indicating whether the lock is open.
  
   public boolean isOpen()
   {
      return open;
   }
 
   /**
      Close the lock and print a message indicating that the lock is now closed
 
   public void lock()
   {
      count = 0;
      open = false;
      System.out.println("The MasterLock is now locked");
   }
}


import java.util.*;

public class CombinationLockTest
{
    public static void main(String[] args)
    {
       CombinationLock myLock = new CombinationLock("11-22-33");
       System.out.println("The current combination is " + myLock.getCombination());
       System.out.println();
       myLock.open();
       System.out.println(myLock);
       myLock.close();
       
       System.out.println();
       System.out.println("Change combination to 55-66-77");
       System.out.print("Type new combination -->");
       Scanner keyboard = new Scanner(System.in);
       String combo = keyboard.nextLine();
       myLock.setCombination(combo);
       System.out.println("Combination has been changed.");
       System.out.println();
       
       myLock.open();
       System.out.println(myLock);
       myLock.close();
       
       System.out.println();
       System.out.println("Type an incorrect combination.");
       
       myLock.open();
       System.out.println(myLock);
       myLock.close();
    }
}


public class Lock
{
    // Instance Variable
    private boolean locked;
    
    // Default Constructor
    public Lock()
    {
      locked = true;  // lock starts in a closed state
    }
    
    // Mutator Methods
    public void open()
    {
        locked = false;
    }
    
    public void close()
    {
        locked = true;
    }
    
    // Accessor Method
    public boolean amILocked()
    {
        return locked;
    }
    
    // toString Method
    public String toString()
    {
        if(locked == false)
          return "Lock is open";
        else
          return "Lock is closed";
    }	
}




import java.util.Scanner;
public class VotingCounter1
{
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        final int SIZE = 6;
        int[] votes = new int[SIZE];
        String[] names = new String[SIZE];

        for (int i = 0; i < names.length && i < votes.length; i++){
            System.out.print("Enter candidate's name: ");
            names[i] = userInput.next( );
            System.out.print("Enter number of votes: ");
            votes[i] = userInput.nextInt( );
        }

        System.out.println("And the Winner is: " + highest(votes));
    }
    public static int highest(int[] votes){
        int high = votes[0];

        for (int i = 1; i < votes.length; i++){
            if (votes[i] > high){
                high = votes[i];
            }
        }
        return high;
    }
}



import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<Integer> numbers = new LinkedList<>();

    // add elements in LinkedList
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);
    System.out.println("LinkedList: " + numbers);

    // remove all elements less than 4
    numbers.removeIf((Integer i) -> i < 4);
    System.out.println("Updated LinkedList: " + numbers);

  }
}



//
//** Doubly linked list with nodes of type DNode storing strings. */
//public class DList {
//  protected int size; // number of elements
//  protected DNode header, trailer; // sentinels
//  /** Constructor that creates an empty list */
//  public DList() {
//    size = 0;
//    header = new DNode(null, null, null); // create header
//    trailer = new DNode(null, header, null); // create trailer
//    header.setNext(trailer); // make header and trailer point to each other
//  }
//  /** Returns the number of elements in the list */
//  public int size() { return size; }
//  /** Returns whether the list is empty */
//  public boolean isEmpty() { return (size == 0); }
//  /** Returns the first node of the list */
//  public DNode getFirst() throws IllegalStateException {
//    if (isEmpty()) throw new IllegalStateException("List is empty");
//      return header.getNext();
//  }
//  /** Returns the last node of the list */
//  public DNode getLast() throws IllegalStateException {
//    if (isEmpty()) throw new IllegalStateException("List is empty");
//      return trailer.getPrev();
//  }
//  /** Returns the node before the given node v. An error occurs if v
//  * is the header */
//  public DNode getPrev(DNode v) throws IllegalArgumentException {
//    if (v == header) throw new IllegalArgumentException
//    ("Cannot move back past the header of the list");
//      return v.getPrev();
//  }
//  /** Returns the node after the given node v. An error occurs if v
//  * is the trailer */
//  public DNode getNext(DNode v) throws IllegalArgumentException {
//    if (v == trailer) throw new IllegalArgumentException
//    ("Cannot move forward past the trailer of the list");
//      return v.getNext();
//  }
//  /** Inserts the given node z before the given node v. An error
//  * occurs if v is the header */
//  public void addBefore(DNode v, DNode z) throws IllegalArgumentException {
//    DNode u = getPrev(v); // may throw an IllegalArgumentException
//    z.setPrev(u);
//    z.setNext(v);
//    v.setPrev(z);
//    u.setNext(z);
//    size++;
//  }
//  /** Inserts the given node z after the given node v. An error occurs
//  * if v is the trailer */
//  public void addAfter(DNode v, DNode z) {
//    DNode w = getNext(v); // may throw an IllegalArgumentException
//    z.setPrev(v);
//    z.setNext(w);
//    w.setPrev(z);
//    v.setNext(z);
//    size++;
//  }
//  /** Inserts the given node at the head of the list */
//  public void addFirst(DNode v) {
//    addAfter(header, v);
//  }
//  /** Inserts the given node at the tail of the list */
//  public void addLast(DNode v) {
//    addBefore(trailer, v);
//  }
//  /** Removes the given node v from the list. An error occurs if v is
//  * the header or trailer */
//  public void remove(DNode v) {
//    DNode u = getPrev(v); // may throw an IllegalArgumentException
//    DNode w = getNext(v); // may throw an IllegalArgumentException
//    // unlink the node from the list
//    w.setPrev(u);
//    u.setNext(w);
//    v.setPrev(null);
//    v.setNext(null);
//    size--;
//  }
//  /** Returns whether a given node has a previous node */
//  public boolean hasPrev(DNode v) { return v != header; }
//  /** Returns whether a given node has a next node */
//  public boolean hasNext(DNode v) { return v != trailer; }
//  /** Returns a string representation of the list */
//  public String toString() {
//    String s = "[";
//    DNode v = header.getNext();
//    while (v != trailer) {
//      s += v.getElement();
//      v = v.getNext();
//      if (v != trailer)
//        s += ",";
//    }
//    s += "]";
//    return s;
//  }
//}


/*
 * class StarAndTri2 {
    public static void main(String...args) {
        final double q2 = Math.sqrt(2);
        out(1);
        int a = 1;
        for(int i = 1; a > 0; i++) {
            a += (12 * i);
            if(x((int)(Math.sqrt(a)*q2))==a)out(a);
        }
    }
    static int x(int q) { return (q*(q+1))/2; }
    static void out(int i) {System.out.println("found: " + i);}
}

List<Integer> tris = new ArrayList<Integer>();
for(int i = 2, t = 1; t > 0; i++) { // loop ends after integer overflow
    tris.add(t);
    t += i; // compute the next triangle value
}

List<Integer> stars = new ArrayList<Integer>();
for(int i = 1, s = 1; s > 0; i++) {
    stars.add(s);
    s += (12 * i);
}
 */


/*
 * 
import java.util.Random;


public class Minesweeper {

	public static final int NUMBER_OF_ROWS = 6;
	public static final int NUMBER_OF_COLUMNS = 20;
	public static final int NUMBER_OF_MINES = 15;
	public static final char MINE = '*';
	public static final char NO_MINE = ' ';
	public static void main(String[] args) {
		char[][] board = new char[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
		clearBoard(board);
		System.out.println("After clearing:");
		printBoard(board);
		layMines(board,NUMBER_OF_MINES);
		System.out.println("After laying mines:");
		printBoard(board);
		determineNumberOfMineNeighbours(board);
		System.out.println("After setting number of mine neighbours:");
		printBoard(board);
	}
	
	public static void clearBoard( char[][] board )
	{
		for (int row = 0; (row < board.length); row++)
			for (int column = 0; (column < board[row].length); column++)
				board[row][column] = NO_MINE;
	}
	
	public static void printBoard( char[][] board )
	{
		for (int row = -1; (row <= board.length); row++)
		{
			System.out.print("|");
			for (int column = 0; (column < board[0].length); column++)
				if ((row == -1) || (row == board.length))
					System.out.print("-");
				else System.out.print(board[row][column]);
			System.out.println("|");
		}
	}
		
	public static void layMines( char[][] board, int number_of_mines )
	{
	    Random randomNumberGenerator = new Random();
	    boolean mineLaid = false;
		for (int mine=0; (mine < number_of_mines); mine=mineLaid?mine+1:mine)
		{
			mineLaid = false;
			int mineRow = randomNumberGenerator.nextInt( board.length );
			int mineColumn = randomNumberGenerator.nextInt( board[mineRow].length );
			if (board[mineRow][mineColumn] == NO_MINE)
			{
				board[mineRow][mineColumn] = MINE;
				mineLaid = true;
			}
		}
	}

	public static void determineNumberOfMineNeighbours( char[][] board )
	{
		for (int row = 0; (row < board.length); row++)
			for (int column = 0; (column < board[row].length); column++)
				if (board[row][column] != MINE)
				{
					int numberOfMineNeighbours = numberOfNeighbouringMines( board, row, column );
					if (numberOfMineNeighbours > 0)
						board[row][column] = (char) (((int) '0') + numberOfMineNeighbours);
				}
	}
	
	public static int numberOfNeighbouringMines( char[][] board, int passedRow, int passedColumn )
	{
		int numberOfMines = 0;
		for (int row=(passedRow==0)?0:passedRow-1; row <= ((passedRow==board.length-1)?passedRow:passedRow+1); row++)
			for (int column=(passedColumn==0)?0:passedColumn-1; column <= ((passedColumn==board[row].length-1)?passedColumn:passedColumn+1); column++)
				if (((row != passedRow) || (column!= passedColumn)) && (board[row][column] == MINE))
					numberOfMines++;
		return numberOfMines;
	}

}
 */


/*
 * 
public class Polynomial{
    private int[] coef;  // coefficients
    private int deg;     // degree of polynomial (0 for the zero polynomial)


    // a * x^b
    public Polynomial( int a, int b ){
        coef = new int[ b + 1 ];
        coef[ b ] = a;
        deg = degree();
    }


    public Polynomial( Polynomial p ){
        coef = new int[ p.coef.length ];
        for( int i = 0; i < p.coef.length; i++ ){
            coef[ i ] = p.coef[ i ];
        }//end for
        deg = p.degree();
    }


    // return the degree of this polynomial (0 for the zero polynomial)
    public int degree(){
        int d = 0;
        for( int i = 0; i < coef.length; i++ )
            if( coef[ i ] != 0 ) d = i;
        return d;
    }


    // return c = a + b
    public Polynomial plus( Polynomial b ){
        Polynomial a = this;
        Polynomial c = new Polynomial( 0, Math.max( a.deg, b.deg ) );
        for( int i = 0; i <= a.deg; i++ ) c.coef[ i ] += a.coef[ i ];
        for( int i = 0; i <= b.deg; i++ ) c.coef[ i ] += b.coef[ i ];
        c.deg = c.degree();
        return c;
    }


    // return (a - b)
    public Polynomial minus( Polynomial b ){
        Polynomial a = this;
        Polynomial c = new Polynomial( 0, Math.max( a.deg, b.deg ) );
        for( int i = 0; i <= a.deg; i++ ) c.coef[ i ] += a.coef[ i ];
        for( int i = 0; i <= b.deg; i++ ) c.coef[ i ] -= b.coef[ i ];
        c.deg = c.degree();
        return c;
    }


    // return (a * b)
    public Polynomial times( Polynomial b ){
        Polynomial a = this;
        Polynomial c = new Polynomial( 0, a.deg + b.deg );
        for( int i = 0; i <= a.deg; i++ )
            for( int j = 0; j <= b.deg; j++ )
                c.coef[ i + j ] += ( a.coef[ i ] * b.coef[ j ] );
        c.deg = c.degree();
        return c;
    }


    // get the coefficient for the highest degree
    public int coeff(){return coeff( degree() ); }


    // get the coefficient for degree d
    public int coeff( int degree ){
        if( degree > this.degree() ) throw new RuntimeException( "bad degree" );
        return coef[ degree ];
    }


    /*
     Implement the division as described in wikipedia
        function n / d:
          require d ≠ 0
          q ← 0
          r ← n       # At each step n = d × q + r
          while r ≠ 0 AND degree(r) ≥ degree(d):
          t ← lead(r)/lead(d)     # Divide the leading terms
          q ← q + t
          r ← r − t * d
          return (q, r)
     
    public Polynomial[] divides( Polynomial b ){
        Polynomial q = new Polynomial( 0, 0 );
        Polynomial r = new Polynomial( this );
        while( !r.isZero() && r.degree() >= b.degree() ){
            int coef = r.coeff() / b.coeff();
            int deg = r.degree() - b.degree();
            Polynomial t = new Polynomial( coef, deg );
            q = q.plus( t );
            r = r.minus( t.times( b ) );
        }//end while

        System.out.printf( "(%s) / (%s): %s, %s", this, b, q, r );
        return new Polynomial[]{ q, r };
    }


    // return a(b(x))  - compute using Horner's method
    public Polynomial compose( Polynomial b ){
        Polynomial a = this;
        Polynomial c = new Polynomial( 0, 0 );
        for( int i = a.deg; i >= 0; i-- ){
            Polynomial term = new Polynomial( a.coef[ i ], 0 );
            c = term.plus( b.times( c ) );
        }
        return c;
    }


    // do a and b represent the same polynomial?
    public boolean eq( Polynomial b ){
        Polynomial a = this;
        if( a.deg != b.deg ) return false;
        for( int i = a.deg; i >= 0; i-- )
            if( a.coef[ i ] != b.coef[ i ] ) return false;
        return true;
    }


    // test wether or not this polynomial is zero
    public boolean isZero(){
        for( int i : coef ){
            if( i != 0 ) return false;
        }//end for
        return true;
    }


    // use Horner's method to compute and return the polynomial evaluated at x
    public int evaluate( int x ){
        int p = 0;
        for( int i = deg; i >= 0; i-- )
            p = coef[ i ] + ( x * p );
        return p;
    }


    // differentiate this polynomial and return it
    public Polynomial differentiate(){
        if( deg == 0 ) return new Polynomial( 0, 0 );
        Polynomial deriv = new Polynomial( 0, deg - 1 );
        deriv.deg = deg - 1;
        for( int i = 0; i < deg; i++ )
            deriv.coef[ i ] = ( i + 1 ) * coef[ i + 1 ];
        return deriv;
    }


    // convert to string representation
    public String toString(){
        if( deg == 0 ) return "" + coef[ 0 ];
        if( deg == 1 ) return coef[ 1 ] + "x + " + coef[ 0 ];
        String s = coef[ deg ] + "x^" + deg;
        for( int i = deg - 1; i >= 0; i-- ){
            if( coef[ i ] == 0 ){
                continue;
            }else if( coef[ i ] > 0 ){
                s = s + " + " + ( coef[ i ] );
            }else if( coef[ i ] < 0 ) s = s + " - " + ( -coef[ i ] );
            if( i == 1 ){
                s = s + "x";
            }else if( i > 1 ) s = s + "x^" + i;
        }
        return s;
    }


    // test client
    public static void main( String[] args ){
        Polynomial zero = new Polynomial( 0, 0 );

        Polynomial p1 = new Polynomial( 1, 3 );
        Polynomial p2 = new Polynomial( 2, 2 );
        Polynomial p3 = new Polynomial( 4, 0 );
        Polynomial p4 = new Polynomial( 0, 1 );
        Polynomial p = p1.plus( p2 ).plus( p3 ).plus( p4 );   // 4x^3 + 3x^2 + 1

        Polynomial q1 = new Polynomial( 1, 1 );
        Polynomial q2 = new Polynomial( 3, 0 );
        Polynomial q = q1.plus( q2 );                     // 3x^2 + 5


        Polynomial r = p.plus( q );
        Polynomial s = p.times( q );
        Polynomial t = p.compose( q );

        System.out.println( "zero(x) =     " + zero );
        System.out.println( "p(x) =        " + p );
        System.out.println( "q(x) =        " + q );
        System.out.println( "p(x) + q(x) = " + r );
        System.out.println( "p(x) * q(x) = " + s );
        System.out.println( "p(q(x))     = " + t );
        System.out.println( "0 - p(x)    = " + zero.minus( p ) );
        System.out.println( "p(3)        = " + p.evaluate( 3 ) );
        System.out.println( "p'(x)       = " + p.differentiate() );
        System.out.println( "p''(x)      = " + p.differentiate().differentiate() );

        p.divides( q );
    }

}

 */


/*
 *average of array
 * import java.util.*;

class arr15
{  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
	        int i,j,row,col;
		float sum=0,average;
		System.out.println("Enter the number of rows:");
		row = sc.nextInt();
		System.out.println("Enter the number of columns:");
		col = sc.nextInt();

		int[][] mat = new int[row][col];
 
    		System.out.println("Enter the elements of the matrix") ;
    		for(i=0;i<row;i++)
    		{ 
	    		for(j=0;j<col;j++)
	    		{ 
	        		mat[i][j] = sc.nextInt();
    			}
		}
		
    		System.out.println("The elements of the matrix") ;
    		for(i=0;i<row;i++)
    		{ 
	    		for(j=0;j<col;j++)
	    		{ 
	       	 		System.out.print(mat[i][j]+"\t");
    			}
      	 		System.out.println("");
		}

    		for(i=0;i<row;i++)
    		{ 
	    		for(j=0;j<col;j++)
	    		{ 
				sum = sum + mat[i][j];
    			}
		}

	    	average=sum/(row*col);
    		System.out.printf("AVERAGE of the elements of the matrix = %.2f",average) ;
 	}	
}


public class MatrixAdditionExample{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}    
}}  

 */

/*
 * import java.util.Arrays;
public class CheckIfStringAlphabetical 
{
   public static void main(String[] args) 
   {
      String strInput = "helloworld";
      if(checkIfAlphabaticOrder(strInput))
      {
         System.out.println("Given string is in alphabetical order.");
      }
      else
      {
         System.out.println("Given string is not in alphabetical order.");
      }
   }
   static boolean checkIfAlphabaticOrder(String str)  
   {  
      int size = str.length();  
      char[] chArray = new char[size];  
      for(int a = 0; a < size; a++) 
      {  
         chArray[a] = str.charAt(a);  
      }  
      Arrays.sort(chArray);
      for(int a = 0; a < size; a++)
      {
         if(chArray[a] != str.charAt(a))
         {
            return false;
         }
      }                
      return true;      
   }
}

public class Main {
average word length

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Please type some words, then press enter: ");

    String words = sc.nextLine();

    int count = 0;
    double sum = 0;
    double average = 0;

    sc = new Scanner(words);

    while (sc.hasNext()) {

        String userInput = sc.next();

        double charNum = userInput.length();
        sum = charNum + sum;
        count++;

        if (count > 0) {
            average = sum / count;
        }
    }
 */


/*
 * import java.util.Scanner;

public class Assignment_HiScores {

    public static int[] highScores;

    public static void main(String[] args) {
        System.out.println("How many highscores would you like to maintain?: ");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        highScores = new int[response];
        initialiseHighScores(highScores);
        askForScore(highScores);
    }

    public static void askForScore(int[] highScores) {
        System.out.println("What number would you like to add to the highscores?: ");
        Scanner scanner = new Scanner(System.in);
        int response = scanner.nextInt();
        if(insertScore(highScores, response) == false) {
            printHighScores(highScores);
            askForScore(highScores);
        }
        else{
            printHighScores(highScores);
        }


    }

    public static void initialiseHighScores(int[] highScores) {
        for(int score = 0; score < highScores.length; score++) {
            highScores[score] = 0;
        }
    }

    public static void printHighScores(int[] highScores) {
        System.out.print("The high scores are ");
        for(int score = 0; score < highScores.length; score++) {
            System.out.print(highScores[score]);
            if(score < highScores.length - 1) {
                System.out.print(", ");
            }
            else {
                System.out.print(". \n");
            }
        }
    }

    public static boolean higherThan(int[] highScores, int addScore) {
        int highestScore = 0;
        for(int score = 0; score < highScores.length; score++) {
            if(highScores[score] > highestScore) {
                highestScore = highScores[score];
            }
        }
        if(addScore > highestScore) {
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean insertScore(int[] highScores, int addScore) {

        if(higherThan(highScores, addScore)) {
            for(int score = 0; score < highScores.length; score++) {
                if(highScores[score] == 0) {
                    highScores[score] = addScore;
                    return false;
                }
            }
            System.out.println("The highscores list is full!");
            return true;
        }
        return false;
    }


}
 */





/*
 * import java.util.Scanner;

public class Assignment_Frequencies {

    public static final int NUMBER_OF_DIGITS = 10;
    public static int[] frequencies = new int[NUMBER_OF_DIGITS];

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter a number: ");
            if(scanner.hasNextInt()) {
                int input = scanner.nextInt();
                countDigitFrequencies(input, frequencies);
                printDigitFrequencies(frequencies);
            } else {
                scanner.next();
            }
        }
    }

    public static void countDigitFrequencies(int number, int[] frequencies) {
        while(number > 0) {
            int digit = number % 10;
            frequencies[digit]++;
            number /= 10;
        }
    }

    public static void printDigitFrequencies(int[] frequencies) {
        System.out.print("Digit frequencies: ");
        for(int index = 0; index < frequencies.length; index++) {
            if(frequencies[index] != 0) {
                System.out.print(index + "(" + frequencies[index] + ") ");
            }
        }
    }
}
 */
 

 
 /*
   SELF ASSESSMENT

 1. Did I use easy-to-understand meaningful properly formatted, variable names and CONSTANTS?
        Mark out of 10: 10
        Comment: All constants were formatted in all upper case lettering and variables made use of lowerCamelCase.
                 I chose not to make a constant for numbers like 100(for percentages), 0 for nothing and 1 as part of the formula.
 2. Did I indent the code appropriately?
        Mark out of 5: 5
        Comment: None of the lines move off the screen so yes.
 3. Did I implement the mainline correctly with a loop which continues using the user says "no" ?
       Mark out of 10: 10
        Comment: I made use of a variable called exit and looped the main function until exit was true which only occurred if the user said no to using the calculator again.
 4. Did I obtain the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats ?
       Mark out of 10: 10
        Comment: All inputs and outputs are as shown in the question brief.
 5. Did I implement the readDoubleFromUser function correctly and in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment: I made use of recursion within an if statement to handle if a non boolean was entered and produce an error message.
 6. Did I implement the calculateMonthlyRepayment function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 16
        Comment: I implemented the formula as shown in the question however it appeared slightly messy so I attempted to add some constants for a few numbers such as MONTHS_IN_YEAR.
                 However it still looks hard to understand so I feel it could have been implemented in a more readable way hence I docked 4 marks.
 7. Did I implement the calculateMonthsToRepayMortgage function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 16
        Comment: I made use of a for loop to decrease and increase the mortgage by the amount paid and apr respectively each month while also increasing a month variable.
                 However I docked 4 marks because I believe my way of copying the mortgageAmount variable into mortgageAmountLoop is somewhat messy as well as my formula for increasing my APR.
 8. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment: I elaborated on all marks given.
 Total Mark out of 100 (Add all the previous marks): 92


import java.util.Scanner;

public class Assignment_Mortgage {

    public static final int TERM = 20;
    public static final int MONTHS_IN_YEAR = 12;
    public static final int ERROR = -1;

    public static void main(String[] args) {

        boolean exit = false;
        int years = 0;
        int months = 0;

        while(exit == false) {
            System.out.println("Welcome to the mortgage calculator.");
            double mortgageAmount = readDoubleFromUser("Please enter the mortgage amount: ");
            double apr = readDoubleFromUser("Please enter the annual interest rate: ");
            System.out.println("Assuming a " + TERM + " year term, the monthly repayments would be " + calculateMonthlyRepayment(mortgageAmount, TERM, apr));
            double afford = readDoubleFromUser("How much can you afford to pay per month? ");

            if(calculateMonthsToRepayMortgage(mortgageAmount, afford, apr) != ERROR) {
                years = calculateMonthsToRepayMortgage(mortgageAmount, afford, apr) / MONTHS_IN_YEAR;
                months = calculateMonthsToRepayMortgage(mortgageAmount, afford, apr) % MONTHS_IN_YEAR;
                System.out.println("If you pay " + afford + " per month your mortgage would be paid off in " + years + " years and " + months + " months.");
            }
            else {
                System.out.println("You can never pay off your mortgage :(");
            }

            System.out.println("Would you like to use the mortgage calculator again? (yes/no); ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            if(input.equals("yes")) {
                exit = false;
            }
            else if(input.equals("no")){
                exit = true;
                scanner.close();
            }
        }

    }

    public static double readDoubleFromUser(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        double input = 0.00;
        if(scanner.hasNextDouble()) {
            input = scanner.nextDouble();
        }
        else {
            System.out.println("Error! Input was not a double.");
            readDoubleFromUser(prompt);
        }
        return input;
    }

    public static double calculateMonthlyRepayment(double mortgageAmount, double duration, double apr) {
        double monthlyRepayment = (mortgageAmount * (apr/MONTHS_IN_YEAR/100))/(1 - Math.pow(1 + (apr/MONTHS_IN_YEAR/100), -MONTHS_IN_YEAR*duration));
        return monthlyRepayment;
    }

    public static int calculateMonthsToRepayMortgage(double mortgageAmount, double repayMonthly, double apr) {
        int months = 0;
        if(repayMonthly > (mortgageAmount + (mortgageAmount*(apr/MONTHS_IN_YEAR/100))) - mortgageAmount) {
            for(double mortgageAmountLoop = mortgageAmount; mortgageAmountLoop > 0; mortgageAmountLoop -= repayMonthly ) {
                months++;
                mortgageAmountLoop = mortgageAmountLoop + (mortgageAmountLoop*(apr/MONTHS_IN_YEAR/100));
            }
        }
        else {
            return ERROR;
        }
        return months;
    }
}
  */
 


/*
 * /* SELF ASSESSMENT
   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code?
       Mark out of 10: 10
       Comment: I could have used constants within the if statements for deciding who has one each round, however I felt this was unnecessary.
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)?
       Mark out of 5: 5
       Comment: All variables and constants are formatted correctly.
   3. Did I generate the computer's choice in each game correctly using a Random number generator?
       Mark out of 10: 10
       Comment: Yes, I used the Random library and the nextInt() function.
   4. Did I input the user's choice in each game correctly?
       Mark out of 10: 10
       Comment: I simply read the number the user inputted using the Scanner library nextInt() function.
                Later in the code I compared this number to others in the if statement to determine of the user won or lost.
   5. Did I correctly compare the choices and update the score appropriately?
       Mark out of 20: 20
       Comment: To compare the choices I made some if cases comparing the number the user entered with the computers randomly generated number.
                For example if the number the computer entered was one less than the number that the user entered then the user must win as 3(Scissors) < 2(Paper) < 1(Rock).
   6. Did I inform the user of who won each game (and why) correctly?
       Mark out of 10: 8
       Comment: When outputting the score I wanted to have it print the string for the guess instead of just the number. Therefore I wrote an
                if case to convert the guess to the corresponding string (paper, rock or scissors) however I believe there is possibly a better
                way to implement this that is less messy and more efficient.
   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop.
       Mark out of 20: 20
       Comment: I simply created a loop that ran the code for each game a set number of times as specified by the constant GAMES.
   8. Did I output the final scores correctly after the 5 games were played.
       Mark out of 10: 10
       Comment: I made it output in the exact format as the example output given in the assignment. After each game I made use of post increment to increment the score.
                I chose to make it so a tie does not increment either players score.
   9. How well did I complete this self-assessment?
       Mark out of 5: 5
       Comment: I answered all questions and filled in all comments with relevant information.
   Total Mark out of 100 (Add all the previous marks): 98


import java.util.Random;
import java.util.Scanner;

public class Assignment_RPS {

    public static final int GAMES = 5;
    public static final int NUM_OPTIONS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computerScore = 0;
        int userScore = 0;
        for(int i = 0; i < GAMES; i++) {
            System.out.println("Enter 1 (for Rock) or 2 (for Paper) or 3 (for Scissors): ");
            int userChoice = scanner.nextInt();
            int computerChoice = random.nextInt(NUM_OPTIONS) + 1;

            //Convert the choice to a string for use in the prints down below
            String printChoice;
            if (computerChoice == 1) {
                printChoice = "Rock";
            }
            else if (computerChoice == 2) {
                printChoice = "Paper";
            }
            else {
                printChoice = "Scissors";
            }

            if (userChoice > 0 && userChoice < 4) {
                if (userChoice - 1 == computerChoice) {
                    System.out.println("I lose this round as I chose " + printChoice);
                    userScore++;
                }
                else if (computerChoice - 1 == userChoice) {
                    System.out.println("I win this round as I chose " + printChoice);
                    computerScore++;
                }
                else if (userChoice - 2 == computerChoice) {
                    System.out.println("I win this round as I chose " + printChoice);
                    computerScore++;
                }
                else if (computerChoice - 2 == userChoice) {
                    System.out.println("I lose this round as I chose " + printChoice);
                    userScore++;
                }
                else if (userChoice == computerChoice) {
                    System.out.println("This round is a tie as I chose " + printChoice + " too");
                }
            }
            else {
                System.out.println("That is an invalid choice! You have wasted this turn.");
            }


        }
        System.out.println("The final score was Computer: " + computerScore + " User: " + userScore);
        scanner.close();
    }
}
 */


/*
 * import java.util.Scanner;

public class Tutorial2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number?:");
        double firstDouble = scanner.nextDouble();
        System.out.println("What is the second number?:");
        double secondDouble = scanner.nextDouble();
        System.out.println("What is the third number?");
        double thirdDouble = scanner.nextDouble();
        scanner.close();

        double average = calculateAverage(firstDouble, secondDouble, thirdDouble);
        System.out.println("The average of your three numbers is " + average);
        double standard_deviation = calculateStandardDeviation(firstDouble, secondDouble, thirdDouble, average);
        System.out.println("The standard deviation of your three numbers is " + standard_deviation);


    }

    public static double calculateAverage(double d1, double d2, double d3) {
        double average = (d1 + d2 +d3) / 3;
        return average;
    }

    public static double calculateStandardDeviation(double d1, double d2, double d3, double average) {
        double standard_deviation = Math.sqrt(
                (Math.pow(d1 - average, 2) + Math.pow(d2 - average, 2) + Math.pow(d3 - average, 2)) / 3
        );
        return standard_deviation;
    }
}
 */


/*
 * public class Tutorial_10 {
    public static void main(String[] args) {

    }

    public static double calculateMagnitudeOfVector(double[] vector) {
        if(vector != null) {
            double total = 0;
            for(int index = 0; index < vector.length; index++) {
                total += Math.pow(vector[index], 2);
            }
            return Math.sqrt(total);
        }
        return 0;
    }
    
    public static void normaliseVector(double[] vector) {
        if(vector != null) {
            double magnitude = calculateMagnitudeOfVector(vector);
            for(int index = 0; index < vector.length; index++) {
                vector[index] = vector[index] / magnitude;
            }
        }
    }
    
    public static double calculateDotProductOfVector(double[] vector1, double[] vector2) {
        if(vector1 != null && vector2 != null) {
            if(vector1.length == vector2.length) {
                double total = 0;
                for(int index = 0; index < vector1.length; index++) {
                    total += vector1[index] * vector2[index];
                }
                return total;
            }
            else{
                System.out.println("Vectors are not the same dimension. Returning 0");
                return 0;
            }
        }
        return 0;
    }

    public static double[] addVectors(double[] vector1, double[] vector2) {
        if(vector1 != null && vector2 != null) {
            if(vector1.length == vector2.length) {
                double[] result = new double[vector1.length];
                for(int index = 0; index < vector1.length; index++) {
                    result[index] = vector1[index] + vector2[index];
                }
                return result;
            }
            else{
                System.out.println("Vectors are not the same dimension. Returning a null vector");
                return null;
            }
        }
        return null;
    }
}
 */
 

/*
 * import java.util.Scanner;

public class Tutorial_11 {

    public static double[] marks;
    public static double FIRST_CLASS = 70;

    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a student percentage: ");
            if (scanner.hasNextDouble()) {
                double percentage = scanner.nextDouble();
                if (marks != null) {
                    double[] temp = new double[marks.length + 1];
                    for (int index = 0; index < marks.length; index++) {
                        temp[index] = marks[index];
                    }
                    marks = temp;
                    marks[marks.length - 1] = percentage;
                } else {
                    marks = new double[1];
                    marks[0] = percentage;
                }
                System.out.println(countFirstClassHonours(marks) + " students obtained first class honours. The highest mark was " + determineBestMark(marks));
            } else {
                scanner.next();
            }

        }
    }

    public static double determineBestMark(double[] marks) {
        double highest = 0;
        for(int index = 0; index < marks.length; index++) {
            if(marks[index] > highest) {
                highest = marks[index];
            }
        }
        return highest;
    }

    public static int countFirstClassHonours(double[] marks) {
        int count = 0;
        for (int index = 0; index < marks.length; index++) {
            if (marks[index] > FIRST_CLASS) {
                count++;
            }
        }
        return count;
    }
}
 */ 


/*
 * import java.util.Scanner;

public class Tutorial_13 {
    private static String key;
    private static String plaintext;
    private static String cipherText;
    private static String decryptText;
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        plaintext = scanner.next();
        key = randomAlphaNumeric(plaintext.length());
        System.out.println("Key: " + key);
        cipherText = cipher(plaintext, key);
        System.out.println("Encrypted Text: " + cipherText);
        decryptText = cipher(cipherText, key);
        System.out.println("Decrypted Text: " + decryptText);

    }

    public static String randomAlphaNumeric(int count) {
        String result = "";
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            result += ALPHA_NUMERIC_STRING.charAt(character);
        }
        return result;
    }

    public static String cipher(String text, String key) {
        char[] textArray = text.toCharArray();
        char[] keyArray = key.toCharArray();
        char[] cipherArray = new char[textArray.length];
        for(int index = 0; index < textArray.length; index++) {
            cipherArray[index] = (char) (textArray[index] ^ keyArray[index]);
        }
        return String.valueOf(cipherArray);
    }
}
 */


/*
 * import java.util.Scanner;

public class Tutorial_13_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("The greatest common divisor (GCD) by iteration is: " + iterativeEuclideanAlgorithm(a, b));
        System.out.println("The greatest common divisor (GCD) by recursion is: " + recursiveEuclideanAlgorithm(a, b));
    }

    public static int iterativeEuclideanAlgorithm(int a, int b) {
        int temp = 0;
        if(a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        while(b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static int recursiveEuclideanAlgorithm(int a, int b) {
        if(b == 0) {
            return a;
        }
        else {
            return recursiveEuclideanAlgorithm(b, a % b);
        }
    }
}
 */


/*
 * import java.util.ArrayList;
import java.util.Scanner;

public class Tutorial_14 {
    // N Queens Problem (Usually 8 Queens)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many queens would you like to place?: ");
        int queens = scanner.nextInt();
        ArrayList<ArrayList<Integer>> board = getQueens(queens);
    }

    private static ArrayList<ArrayList<Integer>> getQueens(int queens) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        solveQueens(queens, 0, new ArrayList<Integer>(), result);
        return result;
    }

    private static void solveQueens(int queens, int row, ArrayList<Integer> columns, ArrayList<ArrayList<Integer>> result) {
        if(row == queens) {
            result.add(new ArrayList<Integer>(columns));
        }
        else {
            for(int column = 0; column < queens; column++) {
                columns.add(column);
                if(isValidPlacement(columns)) {
                    solveQueens(queens, row  + 1, columns, result);
                }
                columns.remove(columns.size() - 1);
            }
        }
    }

    private static boolean isValidPlacement(ArrayList<Integer> columns) {
        return true;
    }
}
 */

/*
 * import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Tutorial_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What file would you like to write to?: ");
        String file = scanner.nextLine();
        System.out.println("What directory would you like to ls?: ");
        String directory = scanner.nextLine();
        try {
            FileWriter fileWriter = new FileWriter(file);
            toDocument(fileWriter);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("The files in " + directory + " are: ");
        ls(directory);
        scanner.close();

    }

    public static void toDocument(FileWriter fw) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(true) {
            System.out.println("Enter a word to add to the file (or type nothing to quit): ");
            input = scanner.nextLine();
            try {
                fw.write(input + " ");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(input.equals("")) {
                break;
            }
        }
        scanner.close();
    }

    public static void ls(String directory) {
        File file = new File(directory);
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            if(files != null) {
                for(File f : files) {
                    System.out.print(f.getName() + " ");
                }
            }
            else {
                System.out.print("");
            }
            System.out.print("");
        } else {
            System.out.println("[ERROR] The input " + directory + " is not a directory!");
        }
    }
}
 */


/*
 * import java.util.Scanner;

public class etest2 {

    public static int[] integers;
    public static int FIRST_ELEMENT = 0;

    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter an integer to add to the array (or 'quit' to finish): ");
            Scanner scanner = new Scanner(System.in);
            if(scanner.hasNextInt()) {
                int input = scanner.nextInt();
                //Increase array size by 1 and add input
                if(integers != null) {
                    int[] tempArray = new int[integers.length + 1];
                    for(int index = 0; index < integers.length; index++) {
                        tempArray[index] = integers[index];
                    }
                    integers = tempArray;
                    integers[integers.length - 1] = input;
                }
                else {
                    integers = new int[1];
                    integers[FIRST_ELEMENT] = input;
                }

                System.out.print("The average value is " + getAverage(integers));
                if(isIncreasing(integers)) {
                    System.out.print(", and all values are increasing.\n");
                }
                else {
                    System.out.print(", and all values are not increasing.\n");
                }
            }
            else {
                String input = scanner.nextLine();
                if(input.equals("quit")) {
                    System.out.println("The program will now exit!");
                    break;
                }
                else {
                    System.out.println("Invalid input!");
                }
            }

        }
    }

    public static double getAverage(int[] integers) {
        if(integers != null) {
            double count = 0;
            double total = 0;
            for(int index = 0; index < integers.length; index++) {
                total += integers[index];
                count++;
            }
            return total/count; //average
        }
        else {
            return 0;
        }
    }

    public static boolean isIncreasing(int[] integers) {
        int currentInt = 0;
        int previousInt = 0;
        if(integers != null) {
            if(integers.length > 1) {
                currentInt = integers[FIRST_ELEMENT];
                for(int index = 1; index < integers.length; index++) {
                    previousInt = currentInt;
                    currentInt = integers[index];
                    if(previousInt >= currentInt) {
                        return false;
                    }
                }
                return true;
            }
            else {
                return true;
            }
        }
        return false;
    }

}
 */

/*
 * /* SELF ASSESSMENT
Harness Class: Member variables (8 marks) 8
All my data members are declared. I also have a constant for the maximum number of uses of a harness.
Comment: Yes, all the data members are declared and they are accessed using Getters ad Setters. I used MAX_USE for the maximum number of uses of a harness
Harness Class: Harness constructor 1 & constructor 2 (6 marks) 6
I initialise all the variables using the parameters given and set the other members to reasonable default values.
Comment: The proper constructors have been made.
Harness Class: checkHarness method (5 marks) 5
My method takes an instructor's name as a parameter, and if the harness is not on loan sets the instructor member variable to the given parameter value (assuming the instructor's name is not null/empty). It also resets the number of times the harness was used.
Comment: Yes,it does this
Harness Class: isHarnessOnLoan method (2 marks)
My method has no parameters and returns the value of the loan status variable.
Comment: Yes, the method doesn't take any parameter and returns loan
Harness Class: canHarnessBeLoaned method (4 marks)
My method has no parameters and returns true if the harness is not on loan and if the number of times it was used is less than the maximum allowed number of times.
Comment: Yes, the method has no parameters an does this
Harness Class: loanHarness method (6 marks)
My method has a member name as a parameter and it checks if harness can be loaned by using the canHarnessBeLoaned method. If true, it sets the club member value to the parameter value, sets the on loan status to true and increments the number of times used variable.
Comment: Yes.
 
Harness Class: returnHarness method (5 marks)
My method has no parameters, checks if the harness is on loan, and if so, changes its on-loan status to false, and resets the club member value.
Comment: Yes, the method doesn't have any parameter and if the boolean loan is true, the method sets it to false and the String variable borrower to null
Harness Class: toString method (3 marks)
My method returns a String representation of all the member variables.
Comment: Yes, this method is present.
HarnessRecords Class: member variables (3 marks)
I declare the member variable as a private collection of Harnesses 
Comment: Yes, the collection of Harnesses is declared as private
HarnessRecords Class: HarnessRecords constructor 1 & 2 (9 marks)
In the first constructor, I set the member variable to null [1 mark]. In the second constructor, I use the Java I/O to read data from a text file I created containing sets of Harness characteristics. I use these set of characteristics to create Harness objects and add them to the collection. 
Comment: Yes, both the constructors have been created with the required conditions
HarnessRecords Class: isEmpty method (1 marks)
I return true if the collection is null/empty and, false otherwise.
Comment: The method returns true if the size of the collection is 0, and false otherwise
HarnessRecords Class: addHarness method (5 marks)
My method takes a Harness object as a parameter and adds the harness to the collection.
Comment: Yes, the method takes a Harness objects parameter.
HarnessRecords Class: findHarness method (6 marks)
My method takes a make and model number as parameters. It checks if a harness with such properties exists and if it does it returns harness object, otherwise returns null.
Comment: Yes, it takes the made and model number as parameters and checks for a harness with these properties and returns it. if not found it returns null
HarnessRecords Class: checkHarness method (6 marks)
must take instructor name, make and model number as parameters and return a Harness. If a harness with the make and model number exists by using the findHarness method and is not on loan, the Harness method checkHarness is called with the instructor name as a parameter and the updated Harness object is returned. If the harness is not available returns null.
Comment: Instructor name, make and model number have been passed as parameters. The required harness is found using findHarness. The harness is checked if it is not null and if it is available for loan or not using isHarnessOnLoan(). Finally, checkHarness is called with the instructor name as parameter and the Harness object is returned
HarnessRecords Class: loanHarness method (7 marks)
My method takes a club member name as a parameter and looks for an available harness by calling the method canHarnessBeLoaned be loaned. If an available harness is found it is loaned by using the Harness method loanHarness with the club member as a parameter, returning the harness. If there's no available harness null is returned.
Comment: 
HarnessRecords Class: returnHarness method (7 marks)
My method takes a make and model number as parameters. It checks if a harness with those properties exists by using the findHarness method. If the found harness is not null, it returns the harness object by using Harness method returnHarness, otherwise returns null.
Comment: Yes, the method has make and model number as parameter and does this also
HarnessRecords Class: removeHarness method (8 marks)
My method takes a make and model number as parameters and check the collection for a harness with those properties and removes it. It returns the harness object if it is found, otherwise returns null.
Comment: Yes, the method takes the make and model number as parameters, finds the required harness with the method findHarness. If found, it removes it and returns the harness object, and otherwise returns null.
GUI (Java main line) (5 marks)
My test class has a menu which implements at least the five points specified using the HarnessRecords class methods.
Comment: Yes, the main has a menu using the switch statement with the  5 options that were required in the question


import java.util.Scanner;

public class ClimbingClubHarnessRecordSystem {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
	HarnessRecords records = new HarnessRecords("src\\AllTheHarnessRecords.txt"); //put path here 
	boolean finished = false;
	while(!finished){
	System.out.println("Enter choice(1-5)");
	System.out.println("(1)- Add a record for a newly purchased harness");
	System.out.println("(2)- remove a climbing harness from the club");
	System.out.println("(3)- record the fact that a club instructor has checked the safety of a harness");
	System.out.println("(4)- loan a harness to a club member if there is an availabe harness");
	System.out.println("(5)- return a harness which is no longer in use by a club member.");
	System.out.println("(6)-Find a specific harness");
	System.out.println("(7)- Check if the Arraylist is empty or not");
	
	String choice;
	if(input.hasNext("exit")){
	finished = true;
	}else if(input.hasNext()){
	choice = input.next();
	switch (choice){
	case "1":
	System.out.print("Enter make: ");
	String make = input.next();
	System.out.print("Enter model number: ");
	int model = input.nextInt();
	System.out.print("Enter number Of times already used: ");
	int numberOfTimesUsed = input.nextInt();
	System.out.print("Enter name of the instructor who checked it: ");
	String name = input.next();
	Harness harness = new Harness(make, model, numberOfTimesUsed, name, false, null);;
	records.addHarness(harness);
	break;
	
	case "2":
	System.out.print("Enter make: ");
	make = input.next();
	System.out.print("Enter model number: ");
	model = input.nextInt();
	records.removeHarness(make, model);
	break;
	
	case "3":
	System.out.print("Enter make: ");
	make = input.next();
	System.out.print("Enter model number: ");
	model = input.nextInt();
	System.out.print("Enter name: ");
	name = input.next();
	records.checkHarness(name, make, model);
	break;
	
	case "4":
	System.out.println("Enter member name: ");
	name = input.next();
	if(records.loanHarness(name)==null)
	System.out.println("No harnessess to loan");;
	break;
	case "5":
	System.out.print("Enter make: ");
	make = input.next();
	System.out.print("Enter model number: ");
	model = input.nextInt();
	records.returnHarness(make, model);
	break;
	case "6":
	System.out.print("Enter make: ");
	make = input.next();
	System.out.print("Enter model number: ");
	model = input.nextInt();
	System.out.println(records.findHarness(make, model));
	break;
	case "7":
	if(records.isEmpty())
	System.out.println("The Arraylist is empty");
	else
	System.out.println("The Arraylist is not empty");
	break;
	default: System.out.println("Invalid Input");
	}
	}else{
	System.out.println("Invalid input");
	
	}
	}
	input.close();
	}
}
 */


/*
 * package noughtsAndCrosses;
import java.util.Scanner;
public class noughtsAndCrosses {
	static char[][] board = new char[3][3];
	static char[] firstRow = new char[3];
	static char[] secondRow = new char[3];
	static char[] thirdRow = new char[3];
	static char[] firstColumn = new char[3];
	static char[] secondColumn = new char[3];
	static char[] thirdColumn = new char[3];
	public static int row;
	public static int column;
	public static boolean isBoardFull;
	public static boolean canMakeMove ;
	public static char winner;


	public static void main(String[] args)
	{
	
		clearBoard(board);
		printBoard(board);


	}


	public static void clearBoard(char [][] board)
	{
		for (int row = 0; row < 3; row++) 
		{
			for (int col = 0; col < 3; col++) 
			{
				board [row][col] = ' ';
			}

		}



	}
	public static void printBoard(char[][] board)
	{
		System.out.println("       0               1                2   ");
		System.out.println("0    " + board[0][0] + "        |       " + board[0][1] + "         |        "
				+ board[0][2]);
		System.out.println(" ---------------------------------------------");
		System.out.println("1    " + board[1][0] + "        |      " + board[1][1] + "          |        "
				+ board[1][2]);
		System.out.println(" ---------------------------------------------");
		System.out.println("2    " + board[2][0] + "        |       " + board[2][1] + "         |        " 
				+ board[2][2]);



	}
	public static boolean canMakeMove(char[][] board, int row , int column)
	{
       if(board [row][column] == ' ' )
       {
    	   canMakeMove = true;
       }
       else
       {
    	   canMakeMove = false;
       }


		return canMakeMove;
	}

	public static void makeMove(char[][] board, char currentPlayerPiece,int row,int column)
	{
		int n =0;
       Scanner input = new Scanner(System.in);
       row = input.nextInt();
       column = input.nextInt();
       if(n % 2 ==0)
       {
    	  board[row][column] = 'X';
       }
       else
       {
    	   board[row][column] = 'O';
       }
       input.close();




	}
	public static boolean isBoardFull(char [][] board)
	{
		char[][] boardCloned = new char[3][3];
		boardCloned[0][1] = 'X';
		boardCloned[0][2] = 'O';
		boardCloned[0][0] = 'X';
		boardCloned[1][0] = 'O';
		boardCloned[1][1] = 'X';
		boardCloned[1][2] = 'O';
		boardCloned[2][0] = 'X';
		boardCloned[2][1] = 'X';
		boardCloned[2][2] = 'O';
		
		
		
		
           if(board.equals(boardCloned))
           {
        	   isBoardFull = true;
           }
           else
           {
        	   isBoardFull = false;
           }

		return isBoardFull;
	}

	public static char winner(char[][] board)
	{
		


		return winner;
	}




}
 */


/*
 * /* SELF ASSESSMENT

 1. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?

        Mark out of 5:  5
       Yes I did use easy to understand variable names.
 2. Did I indent the code appropriately?

        Mark out of 5: 5
             Yes.
 3. Did I write the initialiseHighScores function correctly (parameters, return type and function body) and invoke it correctly?

       Mark out of 15:  15
         Yes.I did
 4. Did I write the printHighScores function correctly (parameters, return type and function body) and invoke it correctly?

       Mark out of 15:  15
       Yes I wrote the printHighScores function properly.

 5. Did I write the higherThan function correctly (parameters, return type and function body) and invoke it correctly?

       Mark out of 15:  15
       Yeah I wrote this function correctly too.

 6. Did I write the insertScore function correctly (parameters, return type and function body) and invoke it correctly?

       Mark out of 20:20
       Yes. I wrote this function too without a problem.

 7. Did I write the main function body correctly (first asking for the number of scores to be maintained and then repeatedly asking for scores)?

       Mark out of 20: 10
       I could not figure out how to maintain a number of scores the user wished to maintain however I was able to repeatedly ask for scores. 

 8. How well did I complete this self-assessment?

        Mark out of 5:5
       I completed this self assessment well.
 Total Mark out of 100 (Add all the previous marks):

import java.util.Scanner;
public class highScores 
{
	public  static int MAX_NUMBER_OF_SCORES = 5;
	public static boolean isHigherThan = false;
	public static double score;
	public static int numberOfScores;
	public static double[] highScoreList = new double[MAX_NUMBER_OF_SCORES];
	public static void main(String[] args)
		{
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your  score");
		while(numberOfScores<=MAX_NUMBER_OF_SCORES&& numberOfScores >= 0 )
		{
			try {
				if(input.hasNext("reset"))
				{
					initialiseHighScores( highScoreList);
					numberOfScores = 0;
					input.next();
					System.out.println("Please enter your next  score");

				}

				else
				{
					score = input.nextDouble();
					try 
					{
						highScoreList[numberOfScores] = score;
					}
					catch(java.lang.ArrayIndexOutOfBoundsException highScoreList)
					{

					}

					numberOfScores++;
					higherThan(highScoreList,score);
					insertScore(highScoreList, score);
					printHighScores(highScoreList);
					System.out.println("Please enter your next  score");

				}
			}
			catch(java.util.InputMismatchException score)
			{
				System.out.println("Error: You entered a letter. Please enter any numeric score");
				input.next();
			}


		}
		input.close();
	}
	public static double[]  initialiseHighScores( double[] highScoreList)
	{
		java.util.Arrays.fill(highScoreList, 0, MAX_NUMBER_OF_SCORES, 0);
		return highScoreList;
	}
	public static double[] printHighScores(double[] highScoreList)
	{
		int count = 1;
		System.out.println("The highscores are : ");
		while(score >= 0 && count <= 5)
		{
			switch(count)
			{
			case 1:
				System.out.println(count + ": " + highScoreList[0] );
				count++;
				break;
			case 2:
				System.out.println(count + ": " + highScoreList[1] );
				count++;
				break;
			case 3:
				System.out.println(count + ": " + highScoreList[2] );
				count++;
				break;
			case 4:
				System.out.println(count + ": " + highScoreList[3] );
				count++;
				break;
			case 5: 
				System.out.println(count + ": " + highScoreList[4] );
				count++;
				break;
			}
		}
		return highScoreList;
	}
	public static boolean higherThan(double[] highScoreList,double score)
	{
		if(score > highScoreList[4])
		{
			isHigherThan = true;
		}
		else
		{
			isHigherThan = false;
		}
		return isHigherThan;
	}
	public static void insertScore(double[] highScoreList,double score)
	{
		if(isHigherThan = true)
		{
			if(score > highScoreList[0])
			{
				highScoreList[4] = highScoreList[3];
				highScoreList[3] = highScoreList[2];
				highScoreList[2] = highScoreList[1];
				highScoreList[1] = highScoreList[0];
				highScoreList[0] = score;
			}
			else if(score > highScoreList[1] && score< highScoreList[0])
			{
				highScoreList[4] = highScoreList[3];
				highScoreList[3] = highScoreList[2];
				highScoreList[2] = highScoreList[1];
				highScoreList[1] = score;

			}
			else if(score > highScoreList[2] && score< highScoreList[1])
			{
				highScoreList[4] = highScoreList[3];
				highScoreList[3] = highScoreList[2];
				highScoreList[2] = score;
			}
			else if(score > highScoreList[3] && score< highScoreList[2])
			{
				highScoreList[4] = highScoreList[3];
				highScoreList[3] = score;
			}
			else if(score > highScoreList[4] && score< highScoreList[3] )
			{
				highScoreList[4] = score;
			}



		}
	}
}
 */


/*
 *
import java.util.Random;


public class Minesweeper {

	public static final int NUMBER_OF_ROWS = 6;
	public static final int NUMBER_OF_COLUMNS = 20;
	public static final int NUMBER_OF_MINES = 15;
	public static final char MINE = '*';
	public static final char NO_MINE = ' ';
	public static void main(String[] args) {
		char[][] board = new char[NUMBER_OF_ROWS][NUMBER_OF_COLUMNS];
		clearBoard(board);
		System.out.println("After clearing:");
		printBoard(board);
		layMines(board,NUMBER_OF_MINES);
		System.out.println("After laying mines:");
		printBoard(board);
		determineNumberOfMineNeighbours(board);
		System.out.println("After setting number of mine neighbours:");
		printBoard(board);
	}
	
	public static void clearBoard( char[][] board )
	{
		for (int row = 0; (row < board.length); row++)
			for (int column = 0; (column < board[row].length); column++)
				board[row][column] = NO_MINE;
	}
	
	public static void printBoard( char[][] board )
	{
		for (int row = -1; (row <= board.length); row++)
		{
			System.out.print("|");
			for (int column = 0; (column < board[0].length); column++)
				if ((row == -1) || (row == board.length))
					System.out.print("-");
				else System.out.print(board[row][column]);
			System.out.println("|");
		}
	}
		
	public static void layMines( char[][] board, int number_of_mines )
	{
	    Random randomNumberGenerator = new Random();
	    boolean mineLaid = false;
		for (int mine=0; (mine < number_of_mines); mine=mineLaid?mine+1:mine)
		{
			mineLaid = false;
			int mineRow = randomNumberGenerator.nextInt( board.length );
			int mineColumn = randomNumberGenerator.nextInt( board[mineRow].length );
			if (board[mineRow][mineColumn] == NO_MINE)
			{
				board[mineRow][mineColumn] = MINE;
				mineLaid = true;
			}
		}
	}

	public static void determineNumberOfMineNeighbours( char[][] board )
	{
		for (int row = 0; (row < board.length); row++)
			for (int column = 0; (column < board[row].length); column++)
				if (board[row][column] != MINE)
				{
					int numberOfMineNeighbours = numberOfNeighbouringMines( board, row, column );
					if (numberOfMineNeighbours > 0)
						board[row][column] = (char) (((int) '0') + numberOfMineNeighbours);
				}
	}
	
	public static int numberOfNeighbouringMines( char[][] board, int passedRow, int passedColumn )
	{
		int numberOfMines = 0;
		for (int row=(passedRow==0)?0:passedRow-1; row <= ((passedRow==board.length-1)?passedRow:passedRow+1); row++)
			for (int column=(passedColumn==0)?0:passedColumn-1; column <= ((passedColumn==board[row].length-1)?passedColumn:passedColumn+1); column++)
				if (((row != passedRow) || (column!= passedColumn)) && (board[row][column] == MINE))
					numberOfMines++;
		return numberOfMines;
	}

} 
 */


/*
 *import java.util.ArrayList;
import java.util.Date;

public class Employee {
	private final int employeeId;
	private String name;
	private Date promotionDate;
	private int role;
	private ArrayList<EmployeeAppraisal> appraisalHistory;
	
	public Employee(int employeeId, String name, int role) {
		this.employeeId = employeeId;
		this.name = name;
		this.promotionDate = null;
		this.role = role;
		this.appraisalHistory = new ArrayList<EmployeeAppraisal>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPromotionDate() {
		return promotionDate;
	}
	public void setPromotionDate(Date promotionDate) {
		this.promotionDate = promotionDate;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public ArrayList<EmployeeAppraisal> getAppraisalHistory() {
		return appraisalHistory;
	}
	public void setAppraisalHistory(ArrayList<EmployeeAppraisal> appraisalHistory) {
		this.appraisalHistory = appraisalHistory;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", promotionDate=" 
				+ promotionDate + ", role=" + role + ", appraisalHistory=" + appraisalHistory + "]";
	}
	
	
	
}

 
 
 
 
 import java.util.Date;

public class EmployeeAppraisal {
	private Date appraisalDate;
	private int appraisalScore;
	
	
	public EmployeeAppraisal(Date appraisalDate, int appraisalScore) {
		this.appraisalDate = appraisalDate;
		this.appraisalScore = appraisalScore;
		
	}
	
	public Date getAppraisalDate() {
		return appraisalDate;
	}
	public void setAppraisalDate(Date appraisalDate) {
		this.appraisalDate = appraisalDate;
	}
	public int getAppraisalScore() {
		return appraisalScore;
	}
	public void setAppraisalScore(int appraisalScore) {
		this.appraisalScore = appraisalScore;
	}
	
	@Override
	public String toString() {
		return "EmployeeAppraisal [appraisalDate=" + appraisalDate + ", appraisalScore=" + appraisalScore + "]";
	}
	
	

}








import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HRClient {
	
	public static int employeeId = 110000; 

	public static void main(String[] args) {
		boolean exit = false;
		HRDepartment hrDepartment = new HRDepartment();
		Scanner scanner = new Scanner(System.in);
		while (!exit) {
			System.out.println("Please enter 1 to add an employee, 2 to view all employees, \n"
					+ "3 to record an employee appraisal, 4 to promote an employee and 5 to exit");
			if (scanner.hasNextInt()) {
				int userInput = scanner.nextInt();
				switch (userInput) {
				case 1: {
					System.out.println("Separated by spaces, please enter the employee's first name followed by his/her role code \n"
							+ "(1 for Executive, 2 for manager, 3 for team lead, 4 for designer, 5 for developer and 6 for tester)");
					if (scanner.hasNext()) {
						String employeeName = scanner.next();
						if (scanner.hasNextInt()) {
							int role = scanner.nextInt();
							if (role >= HRCodes.EXECUTIVE && role <= HRCodes.TESTER){
								hrDepartment.addEmployee(employeeId++, employeeName, role);
							} else {
								System.out.println("Role code must be between " + HRCodes.EXECUTIVE + " and " + HRCodes.TESTER);
							}
						}
					}
					
					break;
				}
				case 2: {
					hrDepartment.printAllEmployees();
					break;
				}
				case 3: {
					System.out.println("Separated by spaces please enter the employeeId \nfollowed by "
							+ "appraisal score code (1 for 'exceeded expectations', "
							+ "2 for 'met expectations' and 3 for 'did not meet expectations') \n"
							+ "followed by the appraisal date in the following format 'dd-mm-yyyy')");
					if (scanner.hasNextInt()) {
						int employeeId = scanner.nextInt();	
						if (scanner.hasNextInt()) {
							int score = scanner.nextInt();
							if (score >= HRCodes.EXCEEDED_EXPECTATIONS && score <= HRCodes.DID_NOT_MEET_EXPECTATIONS) {
								if (scanner.hasNext()) {
									String date = scanner.next();
									SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
									Date appraisalDate = null;
									try {
										appraisalDate = formatter.parse(date);
									} catch (ParseException e) {
										System.out.println("Invalid date entered");
										e.printStackTrace();
									}
									if (!hrDepartment.recordEmployeeAppraisal(employeeId, appraisalDate, score)) {
										System.out.println("Appraisal could not be recorded. Please check the employee id enetered");
									}
								}
							} else {
								System.out.println("Invalid score entered");
							}
						}
					}
					break;
				}
				case 4: {
					System.out.println("Please enter the Id (integer) of the employee to promote");
					if (scanner.hasNextInt()) {
						int employeeId = scanner.nextInt();
						if (hrDepartment.promoteEmployee(employeeId)) {
							System.out.println("Employee has been promoted");
						} else {
							System.out.println("Employee is not eligible for promotion or employee id is incorrect");
						}
					}
					break;
				}
				case 5: {
					exit = true;
					break;
				}
				}

			}
		}
		scanner.close();
		
	}
	
}








public interface HRCodes {
	
	//Appraisal Scores
	int EXCEEDED_EXPECTATIONS = 1;
	int MET_EXPECTATIONS = 2;
	int DID_NOT_MEET_EXPECTATIONS = 3;
	
	//Roles
	int EXECUTIVE = 1;
	int MANAGER = 2;
	int DESIGNER = 3;
	int DEVELOPER = 4;
	int TESTER = 5;
	
	//appraisals before eligible for promotion
	int MIN_APPRAISALS = 2;
}







import java.util.*;
public class HRDepartment {
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public void addEmployee(int employeeId,String name,int role) 
	{
		Employee myEmployee = new Employee(employeeId,name,role);
		employeeList.add(myEmployee);
	}
	
	public void printAllEmployees() 
	{
		for(int i=0;i<= employeeList.size();i++) 
		{
			Employee myEmployee = employeeList.get(i);
			System.out.println("ID :" + myEmployee.getEmployeeId()  );
			System.out.println("Name :" + myEmployee.getName());
			System.out.println("PromotionDate :" + myEmployee.getPromotionDate());
			System.out.println("Role :" + myEmployee.getRole());
			System.out.println("AppraisalHistory :" + myEmployee.getAppraisalHistory());
			
		}
	}
	
	public Employee findEmployee(int employeeId)
	{
		int employeeID = 0;
		String name = "employeeNotFound";
		int role = 0;
		Employee correctEmployee = new Employee(employeeID,name,role);
		for(int i=0;i<= employeeList.size();i++) 
		{
			Employee myEmployee = employeeList.get(i);
			if(myEmployee.getEmployeeId() == employeeId)
			{
				correctEmployee = myEmployee;
			}

		}
		return correctEmployee;


	}
	
	public boolean recordEmployeeAppraisal(int employeeId,Date appraisalDate,int score)
	{
		boolean correctEmployee;
		Employee myEmployee =findEmployee(employeeId);
		if(myEmployee.getEmployeeId() != 0)
		{
			EmployeeAppraisal myAppraisal = new EmployeeAppraisal(appraisalDate,score);
			myEmployee.getAppraisalHistory().add(myAppraisal);
			correctEmployee = true;
		}
		else
		{
			correctEmployee = false;
		}
		return correctEmployee;
	}
	
	/*public boolean promoteEmployee(int employeeId) 
	{
		findEmployee(employeeId);
	}
	

}

 */
 

/*
 * /* SELF ASSESSMENT 
Class Rational 
- I declared two member variables: numerator and denominator (marks out of 4: 4).
- Comment: I did this within the class, outside any methods.

Constructor 1 
- My program takes take two integers as parameters (for numerator and denominator) and initialises the member variables with the corresponding values . If the denominator is equal to 0 I throw an exception (marks out of 5: 5).
- Comment: The two parameters are initialised, but I don't throw an exception for a zero here as I do it elsewhere.

Constructor 2 
- My program takes only one integer as parameter (numerator), and set the numerator to this value . I set the denominator to 1 in this case, as the resulting rational number in this case is an integer (marks out of 3: 3).
- Comment: Only one parameter is initiliased here. I set the denominator to 1 at it's declaration before the constructor. 

Add Method 
- My program takes only a rational number as a parameter and returns a new rational number which has a numerator and denominator which the addition of the two objects - this and the parameter. My program does not overwrite any of the other two rational numbers (marks out of 8: 8).
- Comment: A new Rational object is created as the addition so the two rational numbers don't get overwritten.

Subtract Method 
- I have implemented this the same as add method, except it implements subtraction (marks out of 8: 8).
- Comment: Yup.

Multiply Method 
- I have implemented this the same as add method, except it implements multiplication (marks out of 8: 8).
- Comment: Yup.

Divide Method 
- I have implemented this the same as add method, except it implements divide (marks out of 8: 8).
- Comment: Yup.

Equals Method 
- My program takes a rational number as a parameter and compares it to the reference object. I only use multiplication between numerators/denominators for the purpose of comparison, as integer division will lead to incorrect results. I return a boolean value (marks out of 8: 8).
- Comment: I use division for comparison but store the answers in floats so it is not inaccurate.

isLessThan 
- My program takes a rational number as a parameter and compares it to the reference object. I only use multiplication as integer division will lead to incorrect results. I return a boolean value (marks out of 8: 8).
- Comment: Again I use division but with floats.

Simplify Method 
- My program returns a rational number but not a new rational number, instead it returns the current reference which is this. It doesn't take any parameters as it works only with the reference object. I first find the greatest common divisor (GCD) between the numerator and denominator, and then obtain the new numerator and denominator by dividing to the GCD (marks out of 8: 8).
- Comment: My program does all of this.

gcd function 
- My program returns the greatest common divider of two integers: the numerator and the denominator (marks out of 6: 6).
- Comment: Yup, using ArrayLists of divisors for the two integers.

toString Method 
- My program returns a string showing the fraction representation of the number, eg. "1/2". It takes no parameters (marks out of 4: 4).
- Comment: Yup.

Test Client Class 
- My program asks the user for two rational numbers, creates two rational objects using the constructor and passing in the provided values, calls addition, subtraction, multiplication, division, comparison and simplification and prints out the results (marks out of 22: 22).
- Comment: Yup, with error handling and good formatting.

import java.util.ArrayList;

public class Rational {
	int numerator;
	int denominator = 1;
	
	Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	Rational(int numerator) {
		this.numerator = numerator;
	}
	
	public Rational add(Rational givenRational) {
		if (this.denominatorIsZero() && this.numeratorIsZero()) {
			Rational newRational = new Rational(givenRational.numerator, givenRational.denominator);
			return newRational;
		} else if (givenRational.denominatorIsZero() && givenRational.numeratorIsZero()) {
			Rational newRational = new Rational(this.numerator, this.denominator);
			return newRational;
		} else {
			int commonDenominator = this.denominator * givenRational.denominator;
			int firstRationalNumerator = this.numerator * givenRational.denominator;
			int secondRationalNumerator = givenRational.numerator * this.denominator;
			int newNumerator = firstRationalNumerator + secondRationalNumerator;
			Rational newRational = new Rational(newNumerator, commonDenominator);
			return newRational;
		}
	}
	
	public Rational subtract(Rational givenRational) {
		if (this.denominatorIsZero() && this.numeratorIsZero()) {
			Rational newRational = new Rational(givenRational.numerator * -1, givenRational.denominator);
			return newRational;
		} else if (givenRational.denominatorIsZero() && givenRational.numeratorIsZero()) {
			Rational newRational = new Rational(this.numerator, this.denominator);
			return newRational;
		} else {
			int commonDenominator = this.denominator * givenRational.denominator;
			int firstRationalNumerator = this.numerator * givenRational.denominator;
			int secondRationalNumerator = givenRational.numerator * this.denominator;
			int newNumerator = firstRationalNumerator - secondRationalNumerator;
			Rational newRational = new Rational(newNumerator, commonDenominator);
			return newRational;
		}
	}
	
	public Rational multiply(Rational givenRational) {
		int commonDenominator = this.denominator * givenRational.denominator;
		int newNumerator = this.numerator * givenRational.numerator;
		Rational newRational = new Rational(newNumerator, commonDenominator);
		return newRational;
	}
	
	public Rational divide(Rational givenRational) {
		Rational newSecondRational = new Rational(givenRational.denominator, givenRational.numerator);
		Rational newRational = multiply(newSecondRational);
		return newRational;
	}
	
	public boolean equals(Rational givenRational) {
		if (this.denominatorIsZero() && givenRational.denominatorIsZero()) {
			return true;
		} else if (this.denominatorIsZero() || givenRational.denominatorIsZero()) {
			return false;
		} else {
			float firstRational = this.numerator / this.denominator;
			float secondRational = givenRational.numerator / givenRational.denominator;
			if (firstRational == secondRational) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean isLessThan(Rational givenRational) {
		float firstFloat = 0;
		float secondFloat = 0;
		if (this.denominatorIsZero()) {
			firstFloat = 0;
		} else {
			firstFloat = this.numerator / this.denominator;
		}
		if (givenRational.denominatorIsZero()) {
			secondFloat = 0;
		} else {
			secondFloat = givenRational.numerator / givenRational.denominator;
		}
		if (firstFloat < secondFloat) {
			return true;
		} else {
			return false;
		}
	}
	
	public Rational simplify() {
		if (!this.denominatorIsZero()) {
			this.fixSigns();
			if (this.numeratorIsZero()) {
				this.denominator = 0;
			} else {
				int gcd = GCD(this);
				int newNumerator = this.numerator/gcd;
				int newDenominator = this.denominator/gcd;
				this.numerator = newNumerator;
				this.denominator = newDenominator;
			}
		}
		return this;
	}
	
	public void fixSigns() {
		if (this.denominator < 0) {
			this.numerator *= -1;
			this.denominator *= -1;
		}
	}
	
	public int GCD(Rational rational) {
		int gcd = 0;
		ArrayList<Integer> numeratorDivisors = new ArrayList<Integer>();
		int numeratorLimit = Math.abs(rational.numerator);
		if (numeratorLimit > 1) {
			if (numeratorLimit % 2 != 0) {
				numeratorLimit /= 2;
				numeratorLimit += 1;
			} else {
				numeratorLimit /= 2;
			}
		}
		for (int i = 1; i <= numeratorLimit; i++) {
			if ((Math.abs(rational.numerator) % i) == 0) {
				numeratorDivisors.add(i);
			}
		}
		numeratorDivisors.add(Math.abs(rational.numerator));
		ArrayList<Integer> denominatorDivisors = new ArrayList<Integer>();
		int denominatorLimit = rational.denominator;
		if (denominatorLimit > 1) {
			if (denominatorLimit % 2 != 0) {
				denominatorLimit /= 2;
				denominatorLimit += 1;
			} else {
				denominatorLimit /= 2;
			}
		}
		for (int i = 1; i <= denominatorLimit; i++) {
			if ((rational.denominator % i) == 0) {
				denominatorDivisors.add(i);
			}
		}
		denominatorDivisors.add(rational.denominator);
		for (int i = 0; i < numeratorDivisors.size(); i++) {
			for (int j = 0; j < denominatorDivisors.size(); j++) {
				if (numeratorDivisors.get(i) == denominatorDivisors.get(j)) {
					gcd = numeratorDivisors.get(i);
				}
			}
		}
		return gcd;
	}
	
	public boolean denominatorIsZero() {
		if (this.denominator == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean numeratorIsZero() {
		if (this.numerator == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String result = "";
		result += this.numerator + "/" + this.denominator;
		return result;
	}
}



import java.util.Scanner;

public class RationalTest {
	public static void main(String[] args) {
		System.out.print("Enter a fraction (a/b): ");
		Scanner inputScanner = new Scanner(System.in).useDelimiter("/|\r");
		if (inputScanner.hasNextInt()) {
			int firstRationalNumerator = inputScanner.nextInt();
			if (inputScanner.hasNextInt()) {
				int firstRationalDenominator = inputScanner.nextInt();
				Rational firstRational = new Rational(firstRationalNumerator, firstRationalDenominator);
				System.out.print("Enter a second fraction (a/b): ");
				inputScanner = new Scanner(System.in).useDelimiter("/|\r");
				if (inputScanner.hasNextInt()) {
					int secondRationalNumerator = inputScanner.nextInt();
					if (inputScanner.hasNextInt()) {
						int secondRationalDenominator = inputScanner.nextInt();
						Rational secondRational = new Rational(secondRationalNumerator, secondRationalDenominator);
						inputScanner.close();
						if (firstRational.denominatorIsZero() && !firstRational.numeratorIsZero()) {
							System.out.println("Cannot divide by zero!");			
						} else if (secondRational.denominatorIsZero() && !secondRational.numeratorIsZero()) {
							System.out.println("Cannot divide by zero!");
						} else {
							System.out.println("\nSimplified:");
							System.out.println("First fraction: " + firstRational.simplify().toString());
							System.out.println("Second fraction: " + secondRational.simplify().toString());
							System.out.println("\nAddition:");
							System.out.println("a + b = " + firstRational.add(secondRational).simplify().toString());
							System.out.println("\nSubtraction:");
							System.out.println("a - b = " + firstRational.subtract(secondRational).simplify().toString());
							System.out.println("b - a = " + secondRational.subtract(firstRational).simplify().toString());
							System.out.println("\nMultiplication:");
							System.out.println("a * b = " + firstRational.multiply(secondRational).simplify().toString());
							System.out.println("\nDivision:");
							if (secondRational.denominatorIsZero()) {
								System.out.println("a / b is undefined.");
							} else {
								System.out.println("a / b = " + firstRational.divide(secondRational).simplify().toString());
							}
							if (firstRational.denominatorIsZero()) {
								System.out.println("b / a is undefined.");
							} else {
								System.out.println("b / a = " + secondRational.divide(firstRational).simplify().toString());
							}
							System.out.println("\nEquals: " + firstRational.equals(secondRational));
							System.out.println("\nFirst is less than second: " + firstRational.isLessThan(secondRational));
							System.out.println("Second is less than first: " + secondRational.isLessThan(firstRational));
						}
					} else {
						System.out.println("Invalid input.");
					}
				} else {
					System.out.println("Invalid input.");
				}
			} else {
				System.out.println("Invalid input.");
			}
		} else {
			System.out.println("Invalid input.");
		}
	}
}

 */

/*
 * /* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code?  
       Mark out of 5: 5
   2. Did I use easy-to-understand, meaningful CONSTANT names? 
       Mark out of 5: 5
   3. Did I format the CONSTANT names properly (in UPPERCASE)? 
       Mark out of 5: 5
   4. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 10
   5. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 10: 10
   6. Did I indent the code appropriately? 
       Mark out of 10: 10
   7. Did I use an appropriate for loop to test all possibilities?  There should be only one. 
       Mark out of 20:  20
   8. Did I correctly check if people alive today were or could be alive in a year that is the square of their age in that year. 
       Mark out of 30:  30
   9. How well did I complete this self-assessment? 
       Mark out of 5: 5
   Total Mark out of 100 (Add all the previous marks): 100

public class SquareAges {
	
	public static final int MAXIMUM_AGE = 123;
	public static final int CURRENT_YEAR = 2017;
	public static final int MINIMUM_YEAR_BORN = CURRENT_YEAR - MAXIMUM_AGE;
	
	public static void main(String[] args) {
		int ageSquared = 0;
		int yearOfBirth = 0;
		
		for (int ageCount = 0; ageCount <= MAXIMUM_AGE; ageCount++) {
			ageSquared = ageCount * ageCount;
			yearOfBirth = ageSquared - ageCount;
			
			if (yearOfBirth >= MINIMUM_YEAR_BORN && yearOfBirth <= CURRENT_YEAR) {
				System.out.println("People born in the year " + yearOfBirth + " will be " 
						+ ageCount + " years old in the year " + ageSquared + ", which is the square of their age.");
			}
		}
		
	}
}
 */


/*
 * /* SELF ASSESSMENT 
   1. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10:  10
   2. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 5:   5
   3. Did I indent the code appropriately? 
       Mark out of 10:  10
   4. Did I input the numbers one at a time from the command line?
       Mark out of 10:  10
   5. Did I check the input to ensure that invalid input was handled appropriately?
       Mark out of 10:  10
   6. Did I use an appropriate while or do-while loop to allow the user to enter numbers until they entered exit/quit?
       Mark out of 20:  20
   7. Did I implement the loop body correctly so that the average and variance were updated and output appropriately?
       Mark out of 30:  30
   8. How well did I complete this self-assessment? 
       Mark out of 5:   5
   Total Mark out of 100 (Add all the previous marks): 100


import java.util.Scanner;

public class IncrementalStatistics {

	public static void main(String[] args) {
		
		boolean finished = false;
		double average = 0.0;
		double oldAverage = 0.0;
		double variance = 0.0;
		double currentNumber = 0;
		int numberCount = 0;
		
		do {
			
			Scanner numberInput = new Scanner( System.in );
			System.out.print("Enter a number (or type 'exit' or 'quit'): ");
			
			if (numberInput.hasNextDouble()) {
			
				numberCount++;
				currentNumber = numberInput.nextDouble();
				
				average = average + (currentNumber - average) / numberCount;
				variance = ((variance * (numberCount-1)) + (currentNumber - oldAverage) 
						* (currentNumber - average)) / numberCount;
				
				System.out.println("So far the average is " + average 
						+ " and the variance is " + variance);
				
				oldAverage = average;
			
			} else if (numberInput.hasNext("exit") || numberInput.hasNext("quit")) {
				
				System.out.print("Goodbye.");
				numberInput.close();
				finished = true;
				
			} else if (!numberInput.hasNextDouble()) {
				
				System.out.println("Input invalid. Please use numbers or quit/exit only.");
			
			}
		} while (!finished);
		
	}
}
 */


/*
 * import java.util.Scanner;

public class Week6eTest2016 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean end = false;
		
		while (!end) {
			System.out.print("Enter the coefficients of your second order polynomial separated by spaces (or enter quit): ");
			
			if (input.hasNextDouble()) {
				double a = input.nextDouble();
				
				if (input.hasNextDouble()) {
					double b = input.nextDouble();
					
					if (input.hasNextDouble()) {
						double c = input.nextDouble();
						
						double x1 = 0;
						double x2 = 0;
						
						if (a == 0) {
							x1 = -c / b;
							System.out.println("The roots to this equation is x=" + x1);
						}
						else if (b * b - 4 * a * c > 0) {
							x1 = (-b + Math.sqrt(b * b - 4 * a *c)) / (2 * a);
							x2 = (-b - Math.sqrt(b * b - 4 * a *c)) / (2 * a);
							System.out.println("The roots to this equation are x=" + x1 + " and x=" + x2);
						}
						else if (b * b - 4 * a * c == 0) {
							x1 = -b / (2 * a);
							System.out.println("The roots to this equation is x=" + x1);
						}
						else {
							System.out.println("This equation has complex roots.");
						}
					}
					else {
						System.err.println("Enter numbers!");
						input.nextLine();
					}
					
				}
				else {
					System.err.println("Enter numbers!");
					input.nextLine();
				}
				
			}
			else if (input.next().equals("quit")) {
				end = true;
			}
			else {
				System.err.println("Enter numbers!");
				input.nextLine();
			}
			
		}

	}

}


import java.util.Scanner;

public class Week6eTestSampleQuestion {

	public static void main(String[] args) {

		boolean end = false;
		while (!end) {
			System.out.print("Please enter a number: ");
			Scanner input = new Scanner(System.in);
			if (input.hasNextDouble()) {
				double limit = input.nextDouble();
				if (limit < 1) {
					System.out.println("The number entered should be larger than or equal to 1.");
				}
				else {
					System.out.print("The numbers whose squares are less than or equal to " + limit + " are 0");
					for (int number = 1; number * number <= limit; number++) {
						System.out.print(", " + number);
					}
					System.out.print(".");
					end = true;
				}
			}
			else {
				System.err.println("Invalid input!");
				input.nextLine();
			}
		}

	}

}
 */



/*
 * /* SELF ASSESSMENT
   1. Did I use appropriate easy-to-understand, meaningful variables and CONSTANTS within the code? 
       Mark out of 10: 10
       Comment: Yes, I did.
   2. Did I format the variable and CONSTANT names appropriate (in lowerCamelCase and UPPERCASE)?
       Mark out of 5: 5
       Comment: Yes, I did.
   3. Did I generate the computer's choice in each game correctly using a Random number generator?
       Mark out of 10: 10
       Comment: Yes, I did.
   4. Did I input the user's choice in each game correctly?
       Mark out of 10: 10
       Comment: Yes, I did.
   5. Did I correctly compare the choices and update the score appropriately?
       Mark out of 20: 20
       Comment: Yes, I did.
   6. Did I inform the user of who won each game (and why) correctly?
       Mark out of 10: 10
       Comment: Yes, I did.
   7. Did I use an appropriate for loop to allow the player to play 5 games?  There should be only one loop.
       Mark out of 20: 20
       Comment: Yes, I did.
   8. Did I output the final scores correctly after the 5 games were played. 
       Mark out of 10: 10
       Comment: Yes, I did.
   9. How well did I complete this self-assessment?
       Mark out of 5: 5
       Comment: Yes, I did.
   Total Mark out of 100 (Add all the previous marks): 100


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		final int NUMBER_OF_TIMES = 5;
		final int NUMBER_OF_CHOICES = 3;
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		
		Scanner input = new Scanner(System.in);
		int computerScore = 0;
		int userScore = 0;
		
		for (int times = 0; times < NUMBER_OF_TIMES; times++) {
			System.out.print("Enter 1 (for Rock) or 2 (for Paper) or 3 (for Scissors): ");
			int userChoice = input.nextInt();
			Random rand = new Random();
			int computerChoice = rand.nextInt(NUMBER_OF_CHOICES) + 1;
			
			if (userChoice == computerChoice) {
				System.out.println("This round was a draw as I chose " + computerChoice + " too");
			}
			else if ((userChoice == ROCK && computerChoice == SCISSORS)
				  || (userChoice == PAPER && computerChoice == ROCK)
				  || (userChoice == SCISSORS && computerChoice == PAPER)) {
				System.out.println("You won this round as I chose " + computerChoice);
				userScore++;
			}
			else {
				System.out.println("You lost this round as I chose " + computerChoice);
				computerScore++;
			}
		}
		
		System.out.println("The final score was Computer: " + computerScore + " User: " + userScore);
		
		input.close();
	}

}
 */

/*
 * /* SELF ASSESSMENT

 1. Did I use easy-to-understand meaningful,l properly formatted, variable names and CONSTANTS?
        Mark out of 10: 10
        Comment:   I used easy-to-understand meaningful,l properly formatted, variable names and CONSTANTS.
 2. Did I indent the code appropriately?
        Mark out of 5: 5
        Comment:   I indented the code appropriately.
 3. Did I implement the main line correctly with a loop which continues using the user says "no" ?
       Mark out of 10: 10
        Comment:  I implemented the main line correctly with a loop which continues using the user says "no".
 4. Did I obtain the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats ?
       Mark out of 10: 10
        Comment:  I obtained the relevant inputs from the user and produce the relevant outputs using the specified prompts & formats.
 5. Did I implement the readDoubleFromUser function correctly and in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment:  I implemented the readDoubleFromUser function correctly and in a manner that can be easily understood.
 6. Did I implement the calculateMonthlyRepayment function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment:  I implemented the calculateMonthlyRepayment function correctly in a manner that can be easily understood.
 7. Did I implement the calculateMonthsToRepayMortgage function correctly in a manner that can be easily understood (4 marks for function definition, 4 marks for function call and 12 marks for function implementation)?
       Mark out of 20: 20
        Comment:  I implemented the calculateMonthsToRepayMortgage function correctly in a manner that can be easily understood.
 8. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment:  I completed this self-assessment carefully.
 Total Mark out of 100 (Add all the previous marks): 100

import java.util.InputMismatchException;
import java.util.Scanner;

public class MortgageCalculator {
	
	static Scanner input = new Scanner(System.in);
	final static int MONTHS_IN_A_YEAR = 12;
	
	public static void main(String[] args) {
		
		final int DURATION = 20;
		
		boolean use = true;
		
		do {
			System.out.println("Welcome to the mortgage calculator.");
			
			System.out.print("Please enter the mortgage amount:  ");
			double Principal = readDoubleFromUser(input);
			
			System.out.print("Please enter the annual interest rate (APR):  ");
			double APR = readDoubleFromUser(input);
			
			System.out.format("Assuming a 20 year term, the monthly repayments would be %.2f\n",
								calculateMonthRepayment(Principal, DURATION, APR));
			
			System.out.print("How much can you afford to pay per month?  ");
			double paidMonthly = readDoubleFromUser(input);
			
			int month = calculateMonthsToRepayMortgage(Principal, paidMonthly, APR);
			int year = month / MONTHS_IN_A_YEAR;
			month = month - MONTHS_IN_A_YEAR * year;
			System.out.println("If you pay " + paidMonthly + " per month your mortgage would be paid off in " 
								+ year + " years and " + month + " months.");
			System.out.print("Would you like to use the mortgage calculator again (yes/no)?  ");
			while (!(input.hasNext("yes") || input.hasNext("no"))) {
				input.next();
				input.nextLine();
				System.err.print("Please enter yes or no: ");
			}
			if (input.hasNext("yes")) {
				use = true;
				input.next();
				input.nextLine();
			}
			else {
				use = false;
			}
		} while (use);
	}
	
	public static double readDoubleFromUser(Scanner input) {
		try {
			return input.nextDouble();
		}
		catch (InputMismatchException e) {
			System.err.println("Please enter a double number:");
			input.next();
			input.nextLine();
			return readDoubleFromUser(input);
		}
	}
	
	public static double calculateMonthRepayment(double Principal, double DURATION, double APR) {
		
		double repayment = Principal * (APR/MONTHS_IN_A_YEAR/100) / 
							(1 - Math.pow((1+APR/MONTHS_IN_A_YEAR/100),(-DURATION*MONTHS_IN_A_YEAR)));
		
		return repayment;
	}
	
	public static int calculateMonthsToRepayMortgage(double Principal, double paidMonthly, double APR) {
		
		int months = 0;
		final double MPR = APR / MONTHS_IN_A_YEAR;
		
		while (Principal > 0) {
			Principal = Principal * (1+MPR/100);
			Principal = Principal - paidMonthly;
			months++;
		}
		
		return months;
	}
}
 */


/*
 * public class CommissionEmployee
{
   protected final String firstName;
   protected final String lastName;
   protected final String socialSecurityNumber;
   protected double grossSales; // Gross weekly sales
   protected double commissionRate; // Commission percentage

   // Five-argument constructor                                       
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate)
   {                                                                  
      // Implicit call to Object constructor occurs here              

      // If grossSales is invalid throw exception
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      // If commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.firstName = firstName;                                     
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // End constructor        

   // Return first name
   public String getFirstName()
   {
      return firstName;
   }

   // Return last name
   public String getLastName()
   {
      return lastName;
   } 

   // Return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 

   // Set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // Return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // Set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // Return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 

   // Calculate earnings                 
   public double earnings()              
   {                                     
      return commissionRate * grossSales;
   } 

   // Return String representation of CommissionEmployee object         
   @Override // Indicates that this method overrides a superclass method
   public String toString()                                             
   {                                                                    
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",    
         "commission employee", firstName, lastName,                    
         "social security number", socialSecurityNumber,                
         "gross sales", grossSales,                                     
         "commission rate", commissionRate);                           
   } 
} // End class CommissionEmployee


public class CommissionEmployee
{
   protected final String firstName;
   protected final String lastName;
   protected final String socialSecurityNumber;
   protected double grossSales; // Gross weekly sales
   protected double commissionRate; // Commission percentage

   // Five-argument constructor                                       
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate)
   {                                                                  
      // Implicit call to Object constructor occurs here              

      // If grossSales is invalid throw exception
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      // If commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.firstName = firstName;                                     
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // End constructor        

   // Return first name
   public String getFirstName()
   {
      return firstName;
   }

   // Return last name
   public String getLastName()
   {
      return lastName;
   } 

   // Return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 

   // Set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // Return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // Set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // Return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 

   // Calculate earnings                 
   public double earnings()              
   {                                     
      return commissionRate * grossSales;
   } 

   // Return String representation of CommissionEmployee object         
   @Override // Indicates that this method overrides a superclass method
   public String toString()                                             
   {                                                                    
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",    
         "commission employee", firstName, lastName,                    
         "social security number", socialSecurityNumber,                
         "gross sales", grossSales,                                     
         "commission rate", commissionRate);                           
   } 
} // End class CommissionEmployee


public class BasePlusCommissionEmployeeTest 
{
   public static void main(String[] args) 
   {
      // Instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee = 
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
      
      // Get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
         employee.toString());
   } // End main
} // End class BasePlusCommissionEmployeeTest



 */




/*
 * public class CommissionEmployee
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;
   private double grossSales; // Gross weekly sales
   private double commissionRate; // Commission percentage

   // Five-argument constructor                                       
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate)
   {                                                                  
      // Implicit call to Object constructor occurs here              

      // If grossSales is invalid throw exception
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      // If commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.firstName = firstName;                                     
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // End constructor        

   // Return first name
   public String getFirstName()
   {
      return firstName;
   }

   // Return last name
   public String getLastName()
   {
      return lastName;
   } 

   // Return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 

   // Set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // Return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // Set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // Return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 

   // Calculate earnings                 
   public double earnings()              
   {                                     
      return getCommissionRate() * getGrossSales();
   } 

   // Return String representation of CommissionEmployee object         
   @Override // Indicates that this method overrides a superclass method
   public String toString()                                             
   {                                                                    
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",    
         "commission employee", getFirstName(), getLastName(),
         "social security number", getSocialSecurityNumber(),                
         "gross sales", getGrossSales(),                                     
         "commission rate", getCommissionRate());                           
   } 
} // End class CommissionEmployee



public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // Base salary per week

   // Six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary)
   {
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
      return getBaseSalary() + super.earnings();
   } 

   // Return String representation of BasePlusCommissionEmployee
   @Override 
   public String toString()
   {
    return String.format("%s %s%n%s: %.2f", "base-salaried",
       super.toString(), "base salary", getBaseSalary());
   } 
} // End class BasePlusCommissionEmployee



public class BasePlusCommissionEmployeeTest 
{
   public static void main(String[] args) 
   {
      // Instantiate BasePlusCommissionEmployee object
      BasePlusCommissionEmployee employee = 
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
      
      // Get base-salaried commission employee data
      System.out.println(
         "Employee information obtained by get methods:");
      System.out.printf("%n%s %s%n", "First name is",
         employee.getFirstName());
      System.out.printf("%s %s%n", "Last name is", 
         employee.getLastName());
      System.out.printf("%s %s%n", "Social security number is", 
         employee.getSocialSecurityNumber());
      System.out.printf("%s %.2f%n", "Gross sales is", 
         employee.getGrossSales());
      System.out.printf("%s %.2f%n", "Commission rate is",
         employee.getCommissionRate());
      System.out.printf("%s %.2f%n", "Base salary is",
         employee.getBaseSalary());

      employee.setBaseSalary(1000); 
      
      System.out.printf("%n%s:%n%n%s%n", 
         "Updated employee information obtained by toString", 
         employee.toString());

   } // End main
} // End class BasePlusCommissionEmployeeTest

 */


/*
 * 
 * public class EmployeeTest
{
    public static void main(String[] args)
    {
        Employee edna = new Employee();
        Lawyer lucy = new Lawyer();
        Secretary stan = new Secretary();
	LegalSecretary leo = new LegalSecretary();

	printInfo(edna);
	printInfo(lucy);
	printInfo(stan);
	printInfo(leo);
    }

    public static void printInfo(Employee e)
    {
	System.out.println(e.getHours() + ", ");
	System.out.printf("$%.2f, ", e.getSalary());
	System.out.println(e.getVacationDays() + ", ");
	System.out.println(e); // toString representation of employee
    }
}
 */


/*
 *public class Bike
{  
    void run()
    {
        System.out.println("Running");
    }  
} 
 * 
 * // Since the object reference ‘b’ refers to the subclass object
// and the subclass method run() overrides the parent class method,
// the subclass method is invoked at runtime

public class Scooter extends Bike
{  
    void run()
    {
        System.out.println("Running safely at 60km");
    }  
  
    public static void main(String args[])
    {  
        Bike b = new Scooter(); //Upcasting  
        b.run();  
    }  
} 
 * 
 * 
 */


/*
 *public class FlyingMachine
{
    public void fly()
    {
        System.out.println("No implementation");
    }
}

 
 
 class Helicopter extends FlyingMachine
{
    @Override
    public void fly()
    {
        System.out.println("Start vertically, hover, fly");
    }
}

 
 
 public class Jet extends FlyingMachine
{
    @Override
    public void fly()
    {
        System.out.println("Start, taxi, fly");
    }

    public void bombardment()
    {
        System.out.println("Fire missile");
    }
}



// The method letTheMachinesFly also works without any change
// when you add a new class, for example PropellerPlane

import java.util.List;

public class MakeThingsFly
{
    public void letTheMachinesFly(List<FlyingMachine> flyingMachines)
    {
        for (FlyingMachine flyingMachine : flyingMachines)
        {
            flyingMachine.fly();
        }
    }
}




import java.util.ArrayList;
import java.util.List;

public class PolymorphismDemo
{
    public static void main(String[] args)
    {
        List<FlyingMachine> machines = new ArrayList<FlyingMachine>();
        machines.add(new FlyingMachine());
        machines.add(new Jet());
        machines.add(new Helicopter());

        new MakeThingsFly().letTheMachinesFly(machines);
    }
}

 * 
 */



/*
 * public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // base salary per week

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber, 
         grossSales, commissionRate);                      

      // if baseSalary is invalid throw exception
      if (baseSalary < 0.0)                   
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");  

      this.baseSalary = baseSalary;
   }
   
   // set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0)                   
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");  

      this.baseSalary = baseSalary;                
   } 

   // return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } 

   // calculate earnings
   @Override 
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   }

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString()
   {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
         super.toString(), "base salary", getBaseSalary());   
   } 
}
 *
 * 
 * public class CommissionEmployee
{
   private final String firstName;                              
   private final String lastName;                               
   private final String socialSecurityNumber;                   
   private double grossSales; // gross weekly sales       
   private double commissionRate; // commission percentage

   // five-argument constructor
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate)
   {
      // implicit call to Object constructor occurs here

      // if grossSales is invalid throw exception
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } // end constructor 

   // return first name
   public String getFirstName()
   {
      return firstName;
   }

   // return last name
   public String getLastName()
   {
      return lastName;
   }

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 

   // set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) 
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0)
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   }

   // calculate earnings
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   } 

   // return String representation of CommissionEmployee object
   @Override 
   public String toString()
   {
      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
         "commission employee", getFirstName(), getLastName(), 
         "social security number", getSocialSecurityNumber(), 
         "gross sales", getGrossSales(), 
         "commission rate", getCommissionRate());
   } 
}
 * 
 *public class PolymorphismTest  
{
   public static void main(String[] args) 
   {
      // assign superclass reference to superclass variable
      CommissionEmployee commissionEmployee = new CommissionEmployee(
         "Sue", "Jones", "222-22-2222", 10000, .06);                    

      // assign subclass reference to subclass variable
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);         

      // invoke toString on superclass object using superclass variable
      System.out.printf("%s %s:%n%n%s%n%n", 
         "Call CommissionEmployee's toString with superclass reference ",
         "to superclass object", commissionEmployee.toString());

      // invoke toString on subclass object using subclass variable      
      System.out.printf("%s %s:%n%n%s%n%n", 
         "Call BasePlusCommissionEmployee's toString with subclass",
         "reference to subclass object", 
         basePlusCommissionEmployee.toString());

      // invoke toString on subclass object using superclass variable
      CommissionEmployee commissionEmployee2 = 
         basePlusCommissionEmployee; 
      System.out.printf("%s %s:%n%n%s%n", 
         "Call BasePlusCommissionEmployee's toString with superclass",
         "reference to subclass object", commissionEmployee2.toString());
   } // end main
}
 * 
 * 
 * 
 * 
 */



/*
 * public class BasePlusCommissionEmployee extends CommissionEmployee 
{
   private double baseSalary; // Base salary per week

   // Constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales,
      double commissionRate, double baseSalary)
   {
      super(firstName, lastName, socialSecurityNumber, 
         grossSales, commissionRate);

      if (baseSalary < 0.0) // Validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   }

   // Set base salary
   public void setBaseSalary(double baseSalary)
   {
      if (baseSalary < 0.0) // validate baseSalary                  
         throw new IllegalArgumentException("Base salary must be >= 0.0");
            
      this.baseSalary = baseSalary;                
   } 

   // Return base salary
   public double getBaseSalary()
   {
      return baseSalary;
   }

   // Calculate earnings; override method earnings in CommissionEmployee
   @Override                                                            
   public double earnings()                                             
   {                                                                    
      return getBaseSalary() + super.earnings();                        
   } 

   // Return String representation of BasePlusCommissionEmployee object
   @Override                                                           
   public String toString()                                            
   {                                                                   
      return String.format("%s %s; %s: $%,.2f",                       
         "base-salaried", super.toString(),                            
         "base salary", getBaseSalary());                             
   } 
} 
 *
 * 
 * public class CommissionEmployee extends Employee 
{
   private double grossSales; // Gross weekly sales
   private double commissionRate; // Commission percentage

   // Constructor
   public CommissionEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double grossSales, 
      double commissionRate)
   {
      super(firstName, lastName, socialSecurityNumber);

      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate 
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
      this.commissionRate = commissionRate;
   } 

   // Set gross sales amount
   public void setGrossSales(double grossSales)
   {
      if (grossSales < 0.0) // validate
         throw new IllegalArgumentException("Gross sales must be >= 0.0");

      this.grossSales = grossSales;
   } 

   // Return gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 

   // Set commission rate
   public void setCommissionRate(double commissionRate)
   {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) // validate
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");

      this.commissionRate = commissionRate;
   } 

   // Return commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 

   // Calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings()                                            
   {                                                                   
      return getCommissionRate() * getGrossSales();                    
   }                                             

   // Return String representation of CommissionEmployee object
   @Override                                                   
   public String toString()                                    
   {                                                           
      return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",    
         "commission employee", super.toString(),              
         "gross sales", getGrossSales(),                       
         "commission rate", getCommissionRate());             
   } 
} 




public abstract class Employee 
{
   private final String firstName;
   private final String lastName;
   private final String socialSecurityNumber;

   // Constructor
   public Employee(String firstName, String lastName, 
      String socialSecurityNumber)
   {
      this.firstName = firstName;                                    
      this.lastName = lastName;                                    
      this.socialSecurityNumber = socialSecurityNumber;         
   } 

   // Return first name
   public String getFirstName()
   {
      return firstName;
   } 

   // Return last name
   public String getLastName()
   {
      return lastName;
   } 

   // Return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } 

   // Return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format("%s %s%nsocial security number: %s", 
         getFirstName(), getLastName(), getSocialSecurityNumber());
   } 

   // Abstract method must be overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
} 




public class HourlyEmployee extends Employee 
{
   private double wage; // Wage per hour
   private double hours; // Hours worked for week

   // Constructor
   public HourlyEmployee(String firstName, String lastName,
      String socialSecurityNumber, double wage, double hours)
   {
      super(firstName, lastName, socialSecurityNumber);

      if (wage < 0.0) // validate wage
         throw new IllegalArgumentException(
            "Hourly wage must be >= 0.0");

      if ((hours < 0.0) || (hours > 168.0)) // validate hours
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");

      this.wage = wage;
      this.hours = hours;
   } 

   // Set wage
   public void setWage(double wage)
   {
      if (wage < 0.0) // validate wage
         throw new IllegalArgumentException(
            "Hourly wage must be >= 0.0");

      this.wage = wage;
   } 

   // Return wage
   public double getWage()
   {
      return wage;
   } 

   // Set hours worked
   public void setHours(double hours)
   {
      if ((hours < 0.0) || (hours > 168.0)) // validate hours
         throw new IllegalArgumentException(
            "Hours worked must be >= 0.0 and <= 168.0");

      this.hours = hours;
   } 

   // Return hours worked
   public double getHours()
   {
      return hours;
   } 

   // Calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings()                                            
   {                                                                   
      if (getHours() <= 40) // no overtime                           
         return getWage() * getHours();                                
      else                                                             
         return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
   }                                          

   // Return String representation of HourlyEmployee object              
   @Override                                                             
   public String toString()                                              
   {                                                                     
      return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
         super.toString(), "hourly wage", getWage(),                     
         "hours worked", getHours());                                   
   }                                    
}


public class SalariedEmployee extends Employee 
{
   private double weeklySalary;

   // Constructor
   public SalariedEmployee(String firstName, String lastName, 
      String socialSecurityNumber, double weeklySalary)
   {
      super(firstName, lastName, socialSecurityNumber); 

      if (weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   } 

   // Set salary
   public void setWeeklySalary(double weeklySalary)
   {
      if (weeklySalary < 0.0)
         throw new IllegalArgumentException(
            "Weekly salary must be >= 0.0");

      this.weeklySalary = weeklySalary;
   } 

   // Return salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } 

   // Calculate earnings; override abstract method earnings in Employee
   @Override                                                           
   public double earnings()                                            
   {                                                                   
      return getWeeklySalary();                                        
   }                                             

   // Return String representation of SalariedEmployee object   
   @Override                                                    
   public String toString()                                     
   {                                                            
      return String.format("salaried employee: %s%n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary());
   } 
}



public class PayrollSystemTest 
{
   public static void main(String[] args) 
   {
      // Create subclass objects
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee(
         "Sue", "Jones", "333-33-3333", 10000, .06);
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300);

      System.out.println("Employees processed individually:");
      
      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());

      // Create four-element Employee array
      Employee[] employees = new Employee[4]; 

      // Initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee; 
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");
      
      // Generically process each element in array employees
      for (Employee currentEmployee : employees) 
      {
         System.out.println(currentEmployee); // invokes toString

         // Determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) 
         {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 

         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
      } 

      // Get type name of each object in employees array
      for (int j = 0; j < employees.length; j++)
         System.out.printf("Employee %d is a %s%n", j, 
            employees[j].getClass().getName()); 
   } // End main
}



 * 
 */


/*
 * 
public class Cylinder extends Shape{
	
	private static String name = "Rectangle";
	private double radius;
	private double height;
	
	public Cylinder (double radius, double height) {
		
		super(name);
		this.radius = radius;
		this.height = height;
		
	}
	
	public double area() {
		
		return 3.14 * (radius * radius) * height;
	}

}



public class Paint {
	
	private double coverage;
	
	public Paint (double coverage) {
		this.coverage = coverage; 
	}
	
	
	
	public double amount(Shape shape) {
		
		if("Rectangle".equals(shape.toString())) {
			System.out.println("Computing amount for " + shape + " of length " + " and width ");
			System.out.println("Amount required is " + shape.area() / coverage);
			return shape.area() / coverage;
		}
		
		if("Sphere".equals(shape.toString())) {
			System.out.println("Computing amount for " + shape + " of radius ");
			System.out.println("Amount required is " + shape.area() / coverage);
			return shape.area() / coverage;
		}
		
		if("Cylinder".equals(shape.toString())) {
			System.out.println("Computing amount for " + shape + " of radius " + " and height ");
			System.out.println("Amount required is " + shape.area() / coverage);
			return shape.area() / coverage;
		}
		
		return -1;
	}

}




public class PaintThings {
	

	public static void main(String[] args) {
		
		Paint paint = new Paint(1);
		Rectangle deck = new Rectangle(20, 35); 
		Sphere bigBall = new Sphere(15);
		Cylinder tank = new Cylinder(10, 30);
		
		paint.amount(deck);
		paint.amount(bigBall);
		paint.amount(tank);

	}
	

}




public class Rectangle extends Shape {
	
	private static String name = "Rectangle";
	public double length;
	private double width;
	
	
	public Rectangle(double length, double width){
		
		super(name);
		this.length = length;
		this.width = width;
		
	}
	
	public double area() {
		
		return length * width;
	}

}


public abstract class Shape
{
    private String shapeName;

    public Shape(String name) {
        shapeName = name;
    }

    public String toString() {
       return shapeName;
    }

    public abstract double area();
}




public class Sphere extends Shape {
	
	private static String name = "Sphere";
	private double radius;
	
	public Sphere(int radius) {
		super(name);
		this.radius = radius;
	}

	public double area() {
		
		return 4 * 3.14 * radius;
	}

}



 */



/*
 * 
public class Integer {
	
	private int value;
	
	public Integer(int value){
		
		this.value = value;
		
	}
	
	public int getValue() {
		
		return value;
	}
	
	public String toString() {
		return ("" + value);
	}

}

import java.util.ArrayList;

public class Stack {
	
	private int stackPointer;
	private ArrayList<Integer> stack = new ArrayList<Integer>();
	
	public Stack() {
		
		stackPointer = 0;
	}
	
	public void push(int pushed){
		Integer number = new Integer(pushed);
		stack.add(number);
		stackPointer++;
	}
	
	public Integer pop(){
		
		Integer number = stack.get(stackPointer);
		stack.remove(stackPointer);
		stackPointer--;
		return number;
	}
	
	public Integer peek(){
		
		Integer number = stack.get(stackPointer);
		
		if(number == null) {
			number = new Integer(-1);
		}
		
		return number;
		
	}
	
	public int search(Integer searched){
		
		int number;
		
		for(int i = 0; i < stack.size(); i++) {
			
			number = stack.get(i).getValue();
			
			if (number == searched.getValue()) {
				
				return i;
				
			}
		
		}
		
		
		return -1;
		
	}
	
	public void move(Integer toBeMoved){
		
		int index = search(toBeMoved);
		
		if (index != -1) {
			stack.add(stackPointer + 1, toBeMoved);
		}
				
		
		
	}
	
	public String toString() {
		
		String output = "";
		for(int i = 0; i < stack.size(); i++) {
			Integer number = stack.get(i);
			output += " " + number;
			
		}
		
		return output;
	}
	

}



public class StackTest {

	public static void main(String[] args) {
		
		Stack testStack = new Stack();
		
		System.out.println("Enter numbers: ");
		
		
		for (int i = 1; i <= 10; i++) { 
			testStack.push(i);
		}
		
		System.out.println(testStack);
		
		//testStack.pop();
		
		System.out.println(testStack);
		
		//System.out.println(testStack.peek());
		
		Integer number = new Integer(9);
		
		testStack.move(number);
		
	}
	
}


import java.util.Scanner;

public class XsAndOs {
	
	public static final int NUMBER_OF_ROWS = 3;
	public static final int NUMBER_OF_COLUMNS = 3;
	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		boolean finished = false;
		boolean finished2 = false;
		
		char[][] board = new char [3][3];
		clearBoard(board);
		
		char currentPlayerPiece = 'X';
		int row = -1;
		int column = -1;
		
		int turnNumber = 1;
		
		System.out.println("Enter the desired position row first, then column, separated by a space.");
		
		printBoard(board);
		
		
		while(!finished) {

			if (turnNumber % 2 == 0) {
				
				currentPlayerPiece = 'O';
				System.out.println("Player 2, where will you put an 'O'?");
				
			} else {
				
				currentPlayerPiece = 'X';
				System.out.println("Player 1, where will you put an 'X'?");
				
			}
			
			while (!finished2) {
				
				
				System.out.println("Enter the row and column: ");
				
				if (userInput.hasNextInt()) {
					
					row = userInput.nextInt();
					
					if (userInput.hasNextInt()) {
						
						column = userInput.nextInt();
						
						if (row >= 1 && row <= NUMBER_OF_ROWS && column >= 1 && column <= NUMBER_OF_COLUMNS) {
							
							finished2 = true;
							
						}
						
					}
					
				}
				
				if (!finished2)
					userInput.next();
				
			} 
			
			finished2 = false;
			
			
			if ( canMakeMove (board, row, column) )
				makeMove (board, currentPlayerPiece , row, column);
			
			printBoard(board);
			
			
			
			if (winner(board) != ' ') {
				
				System.out.println("The winner is " + winner(board) + '!');
				finished = true;
				
			}
			
			if (isBoardFull(board)) {
				
				System.out.println("The game ended in a draw; there was no winner.");
				finished = true;
				
			}
			
			
			turnNumber++;
			
		}
		
	
		userInput.close();
		
		
	}
	
	public static void clearBoard (char[][] board) {
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
			
				board[i][j] = ' ';
			
			}
			
		}
		
		
	}
	
	public static void printBoard (char[][] board) {
		
		System.out.println("\n|" + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "| 1");
		System.out.println("|" + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "| 2");
		System.out.println("|" + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "| 3");
		System.out.println(" " + '1' + " " + '2' + " " + "3\n");
	
		
	}
	
	public static boolean canMakeMove (char[][] board, int row, int column) {
		
		if (board[row - 1][column - 1] == ' ') {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static void makeMove (char[][] board, char currentPlayerPiece , int row, int column) {
		
		board[row - 1][column - 1] = currentPlayerPiece;
		
	}
	
	public static boolean isBoardFull(char[][] board) {
		
		for (int i = 0; i < 3; i++) {
					
			for (int j = 0; j < 3; j++) {
					
				if (board[i][j] == ' ')
					
					return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static char winner ( char[][] board) {
		
		for (int i = 0; i < 3; i++) {
			
			if (board[i][0] == board[i][1] && board[i][0] == board[i][2])
				return board[i][0];
			
			else if (board[0][i] == board[1][i] && board[0][i] == board[2][i])
				return board[0][i];
			
		}
		
		
		if ( (board[1][1] == board[0][0] && board[1][1] == board[2][2]) || (board[1][1] == board[2][0] && board[1][1] == board[0][2]) ) 
			return board[1][1];
		
			
		
		return ' ';
	}

}


 */


/*
 * 
 * /* SELF ASSESSMENT 
   1. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 8
       Comment: Could not think of a better name for the string that is converted to a character.
   2. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 10: 10
       Comment: Variable names are formatted as the coding standard specifies.
   3. Did I indent the code appropriately? 
       Mark out of 10: 7
       Comment: I believe I indented the code to the best of my ability but it may still be hard to read.
   4. Did I read the input correctly from the user using appropriate questions? 
       Mark out of 20: 20
       Comment: I took the user's input using easy to understand English sentences.
   5. Did I use an appropriate (i.e. not more than necessary) series of if statements? 
       Mark out of 30: 25
       Comment: I reused the code checking for 'y' or 'n' instead of putting this in a function.
   6. Did I output the correct answer for each possibility in an easy to read format? 
       Mark out of 15: 15
       Comment: Gave the answer in easy to understand English sentences.
   7. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: Gave an appropriate score and comment for each heading.
   Total Mark out of 100 (Add all the previous marks): 90

import static java.lang.System.out;
import java.util.Scanner;

public class Umbrella {
	

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		out.println("Is it raining now? (y/n)");
		String answerString = userInput.next();
		char yesNo = answerString.charAt(0);
		
		if (yesNo != 'y' && yesNo != 'n') {
		
		out.println("You may only enter a lowercase 'y' or 'n'.");
			
		System.exit(0); 
		
		} else if (yesNo == 'n') {
		
			out.println("Does it look like it might rain? (y/n)");
			answerString = userInput.next();
			yesNo = answerString.charAt(0);
			
			if (yesNo != 'y' && yesNo != 'n') {
				
				out.println("You may only enter a lowercase 'y' or 'n'.");
					
				System.exit(0); 
			
			} else if (yesNo == 'n') {
				
				out.println("You needn't bring an umbrella.");
				
			} else {
				out.println("Bring an umbrella but don't put it up.");
			}
			
			
		} else {
			
			out.println("Bring an umbrella.");
		
		}
		
		userInput.close();
		
		}
		
	}



 */


/*
 * 
 * public class StarNumber {
	
	public static final int MINIMUM_VALUE = 0;
	
	public static void main(String[] args) {
		
		System.out.println("The numbers that are both star and triangle numbers are: \n");
		
		int n = 1;
	
		int triangleNumber = determineTriangleNumber(n);
		
		while (triangleNumber >= MINIMUM_VALUE ) {
			triangleNumber = determineTriangleNumber(n++);
			
			if(isStarNumber(triangleNumber))
				System.out.println(triangleNumber);
		}
		
	}
	
	public static boolean isStarNumber(int triangleNumber) {
		
		int starNumberN = 0;
		int starNumber = 1;
		
		while (triangleNumber > starNumber) {
			starNumber = (6 * starNumberN) * (starNumberN - 1) + 1;
			starNumberN++;
		}
		
		if (starNumber == triangleNumber)
			return true;
		else
			return false;
	}
	
	public static int determineTriangleNumber(int triangleNumberN) {
		
		int triangleNumber = 1;
		
		while (triangleNumberN > 1) {
			triangleNumber = triangleNumber + triangleNumberN;
			triangleNumberN--;
		}
		
		return triangleNumber;
		
	}
		
	
	
}
 */


/*
 * 
 * /* SELF ASSESSMENT 
   1. Did I use appropriate CONSTANTS instead of numbers within the code?  
       Mark out of 5: 5
       Comment: Declared three constants in place of numbers, making it clear what each one represented.
   2. Did I use easy-to-understand, meaningful CONSTANT names? 
       Mark out of 5: 4
       Comment: It is clear what each constant represents, providing one knows what the program does.
   3. Did I format the CONSTANT names properly (in UPPERCASE)? 
       Mark out of 5: 5
       Comment: Constant names are formatted as the coding standard specifies.
   4. Did I use easy-to-understand meaningful variable names? 
       Mark out of 10: 9
       Comment: Variable names may be hard to understand if one does not fully know what the program does.
       	In particular, I could not think of a better name for 'yearSquareOfAge'.
   5. Did I format the variable names properly (in lowerCamelCase)? 
       Mark out of 10: 10
       Comment: Variable names are formatted as the coding standard specifies.
   6. Did I indent the code appropriately? 
       Mark out of 10: 10
       Comment: Code is indented appropriately.
   7. Did I use an appropriate for loop to test all possibilities?  There should be only one. 
       Mark out of 20:  20
       Comment: Used a 'for' loop instead of a 'while' loop, as instructed. The only possibility is wholly tested.
   8. Did I correctly check if people alive today were or could be alive in a year that is the square of their age in that year. 
       Mark out of 30:  30
       Comment: The program behaves as intended.
   9. How well did I complete this self-assessment? 
       Mark out of 5: 5
       Comment: Put in an appropriate mark and a comment for each criterion.
   Total Mark out of 100 (Add all the previous marks): 99
*/

/*
public class SquaredAges {
	
	public static final int MAXIMUM_AGE = 123;
	public static final int CURRENT_YEAR = 2042;
	
	public static void main(String[] args) {
		
		
		for (int age = 0; (age <= MAXIMUM_AGE); age++) {
			
			int yearSquareOfAge = (int)java.lang.Math.pow(age, 2);
			int yearOfDeath = (MAXIMUM_AGE - age) + yearSquareOfAge;
			int yearOfBirth = yearSquareOfAge - age;
		
			
			if ( (yearOfDeath >= CURRENT_YEAR) && (yearOfBirth <= CURRENT_YEAR) ) {
			
				System.out.println ( "A person who is " + age + " years old in the year " + yearSquareOfAge + " AD will have an age that is the square root of the year.");
			
			
			}
				
		}
		
	}
	
}

/*
import static java.lang.System.out;
import java.util.Scanner;

public class eTest {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		out.print("Enter a natural number: ");
		int number = user_input.nextInt();
		user_input.close();
		
		if (number <= 0) {
			out.print("Not a natural number");
		} else {
			
			out.println("The numbers whose squares are less than or equal to " + number + " are:");
			
			int squared = number;
			
			
			while (squared > 0){
				 int root = (int)Math.sqrt(squared);
				 out.println(root);
				 squared--;
			}
			
			out.print(".");
			
		}
		
		
	}

}

 */

/*
 * 
 * 
 * import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NewPence {
	
	public static final int OLD_PENCE_IN_NEW_PENCE = 67;
	public static final int SHILLINGS_IN_NEW_PENCE = 804;
	public static final int OLD_POUNDS_IN_NEW_PENCE = 16080;

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int numberOfOldPounds;
		int numberOfShillings;
		int numberOfOldPennies;
		
		while(true){
			try{
				out.print("Enter the number of old pounds: ");
				numberOfOldPounds = userInput.nextInt();
				
				out.print("Enter the number of shillings: ");
				numberOfShillings = userInput.nextInt();
				
				out.print("Enter the number of old pennies: ");
				numberOfOldPennies = userInput.nextInt();
				
				break;
				
		} catch (InputMismatchException e){
			
			out.println("Wrong; Enter numbers!");
			userInput.next();
			
			}
			
		}
		
		
		if (numberOfShillings < 0 || numberOfOldPennies < 0 || numberOfOldPounds < 0){
			
			out.println("Wrong; Enter neutral or positive numbers!");
			System.exit(0) ; 
	
		}
		
		
		userInput.close();
		
		int answerInNewPence = OLD_PENCE_IN_NEW_PENCE *(numberOfOldPennies) + SHILLINGS_IN_NEW_PENCE *(numberOfShillings)
				+ OLD_POUNDS_IN_NEW_PENCE *(numberOfOldPounds); 
		
		double answerInNewPounds = (double)answerInNewPence / 100;
		
		out.printf (numberOfOldPounds + " old pound(s), " + numberOfShillings + " shilling(s) and " + numberOfOldPennies
				+ " old penny/pence = �%.2f", answerInNewPounds);
		
		
		
	}

}
 
 *
 */


/*
 * import java.util.ArrayList;
import java.util.Date;

public class Employee {
	private final int employeeId;
	private String name;
	private Date promotionDate;
	private int role;
	private ArrayList<EmployeeAppraisal> appraisalHistory;
	
	public Employee(int employeeId, String name, int role) {
		this.employeeId = employeeId;
		this.name = name;
		this.promotionDate = null;
		this.role = role;
		this.appraisalHistory = new ArrayList<EmployeeAppraisal>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getPromotionDate() {
		return promotionDate;
	}
	public void setPromotionDate(Date promotionDate) {
		this.promotionDate = promotionDate;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public ArrayList<EmployeeAppraisal> getAppraisalHistory() {
		return appraisalHistory;
	}
	public void setAppraisalHistory(ArrayList<EmployeeAppraisal> appraisalHistory) {
		this.appraisalHistory = appraisalHistory;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", promotionDate=" 
				+ promotionDate + ", role=" + role + ", appraisalHistory=" + appraisalHistory + "]";
	}
	
	
	
}
 
import java.util.Date;

public class EmployeeAppraisal {
	private Date appraisalDate;
	private int appraisalScore;
	
	
	public EmployeeAppraisal(Date appraisalDate, int appraisalScore) {
		this.appraisalDate = appraisalDate;
		this.appraisalScore = appraisalScore;
		
	}
	
	public Date getAppraisalDate() {
		return appraisalDate;
	}
	public void setAppraisalDate(Date appraisalDate) {
		this.appraisalDate = appraisalDate;
	}
	public int getAppraisalScore() {
		return appraisalScore;
	}
	public void setAppraisalScore(int appraisalScore) {
		this.appraisalScore = appraisalScore;
	}
	
	@Override
	public String toString() {
		return "EmployeeAppraisal [appraisalDate=" + appraisalDate + ", appraisalScore=" + appraisalScore + "]";
	}
	
	

}



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HRClient {
	
	public static int employeeId = 110000; 

	public static void main(String[] args) {
		boolean exit = false;
		HRDepartment hrDepartment = new HRDepartment();
		Scanner scanner = new Scanner(System.in);
		while (!exit) {
			System.out.println("Please enter 1 to add an employee, 2 to view all employees, \n"
					+ "3 to record an employee appraisal, 4 to promote an employee and 5 to exit");
			if (scanner.hasNextInt()) {
				int userInput = scanner.nextInt();
				switch (userInput) {
				case 1: {
					System.out.println("Separated by spaces, please enter the employee's first name followed by his/her role code \n"
							+ "(1 for Executive, 2 for manager, 3 for team lead, 4 for designer, 5 for developer and 6 for tester)");
					if (scanner.hasNext()) {
						String employeeName = scanner.next();
						if (scanner.hasNextInt()) {
							int role = scanner.nextInt();
							if (role >= HRCodes.EXECUTIVE && role <= HRCodes.TESTER){
								hrDepartment.addEmployee(employeeId++, employeeName, role);
							} else {
								System.out.println("Role code must be between " + HRCodes.EXECUTIVE + " and " + HRCodes.TESTER);
							}
						}
					}
					
					break;
				}
				case 2: {
					hrDepartment.printAllEmployees();
					break;
				}
				case 3: {
					System.out.println("Separated by spaces please enter the employeeId \nfollowed by "
							+ "appraisal score code (1 for 'exceeded expectations', "
							+ "2 for 'met expectations' and 3 for 'did not meet expectations') \n"
							+ "followed by the appraisal date in the following format 'dd-mm-yyyy')");
					if (scanner.hasNextInt()) {
						int employeeId = scanner.nextInt();	
						if (scanner.hasNextInt()) {
							int score = scanner.nextInt();
							if (score >= HRCodes.EXCEEDED_EXPECTATIONS && score <= HRCodes.DID_NOT_MEET_EXPECTATIONS) {
								if (scanner.hasNext()) {
									String date = scanner.next();
									SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
									Date appraisalDate = null;
									try {
										appraisalDate = formatter.parse(date);
									} catch (ParseException e) {
										System.out.println("Invalid date entered");
										e.printStackTrace();
									}
									if (!hrDepartment.recordEmployeeAppraisal(employeeId, appraisalDate, score)) {
										System.out.println("Appraisal could not be recorded. Please check the employee id enetered");
									}
								}
							} else {
								System.out.println("Invalid score entered");
							}
						}
					}
					break;
				}
				case 4: {
					System.out.println("Please enter the Id (integer) of the employee to promote");
					if (scanner.hasNextInt()) {
						int employeeId = scanner.nextInt();
						if (hrDepartment.promoteEmployee(employeeId)) {
							System.out.println("Employee has been promoted");
						} else {
							System.out.println("Employee is not eligible for promotion or employee id is incorrect");
						}
					}
					break;
				}
				case 5: {
					exit = true;
					break;
				}
				}

			}
		}
		scanner.close();
		
	}
	
}



public interface HRCodes {
	
	//Appraisal Scores
	int EXCEEDED_EXPECTATIONS = 1;
	int MET_EXPECTATIONS = 2;
	int DID_NOT_MEET_EXPECTATIONS = 3;
	
	//Roles
	int EXECUTIVE = 1;
	int MANAGER = 2;
	int DESIGNER = 3;
	int DEVELOPER = 4;
	int TESTER = 5;
	
	//appraisals before eligible for promotion
	int MIN_APPRAISALS = 2;
}



import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class HRDepartment {
	
	private ArrayList<Employee> employeeList = new ArrayList<Employee>();
	
	public void addEmployee(int employeeId, String name, int role) {
		Employee newEmployee = new Employee(employeeId, name, role);
		employeeList.add(newEmployee);
	}
	
	public void printAllEmployees() {
		
		for(int i = 0; i < employeeList.size(); i++) {
			System.out.println("Name: " + employeeList.get(i).getName() + " ID: " + employeeList.get(i).getEmployeeId()
					+ " Role: " + employeeList.get(i).getRole());
		}
	}
	
	public Employee findEmployee(int employeeId) {
		
		for(int i = 0; i < employeeList.size(); i++) {
			
			if(employeeId == employeeList.get(i).getEmployeeId()){
				return employeeList.get(i);
			}
			
		}
		
		
		return null;
		
	}
	
	public boolean recordEmployeeAppraisal(int employeeId, Date appraisalDate, int score) {
		
		if (findEmployee(employeeId) != null) {
		
			EmployeeAppraisal appraisal = new EmployeeAppraisal(appraisalDate, score);
			findEmployee(employeeId).getAppraisalHistory().add(appraisal);
			return true;
		}
		return false;
		
	}
	
	public boolean promoteEmployee(int employeeId){
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.YEAR,-1);
		Date date = calendar.getTime();
		
		Employee tempEmployee = findEmployee(employeeId);
		
		if (tempEmployee.getAppraisalHistory().size() >= 2 ) {

		
			if (tempEmployee.getAppraisalHistory().get(tempEmployee.getAppraisalHistory().size() - 1).getAppraisalScore() == 1
					&& tempEmployee.getAppraisalHistory().get(tempEmployee.getAppraisalHistory().size() - 2).getAppraisalScore() == 1){
				
				if(tempEmployee.getPromotionDate().getTime() <= date.getTime() && tempEmployee.getRole() > 1) {
					findEmployee(employeeId).setRole(tempEmployee.getRole() - 1);
					return true;
				}
				
			}
		
		}
		
		return false;
		
	}

}
 */

/*
 * // A Java program to demonstrate assigning an array reference doesn't make any sense
import java.util.Arrays;
public class copy2DArray{
   public static void main(String [ ]args){
      // Create an array arr1[ ]  
         int [ ][ ] arr1 = { {2,4,5}, {6,8,10} };
      // Create an array arr2[ ] with the same size
         int [ ][ ] arr2 = new int[arr1.length][ ];
      // Copying elements of arr1[ ] to arr2[ ]
         for(int i = 0; i < arr1.length; i++){
      // allocation space to each row of arr2[]
            arr2[i] = new int[arr1[i].length];    
            for(int j= 0; j<arr1[i].length; j++){
                arr2[i][j] = arr1[i][j];
           }
        }

    // Any change in the elements of arr2[ ] will not be reflected  in an original array
        arr2[0][0] = 90;
       System.out.println("Elements of arr1[] are:");
        for (int i=0; i < arr1.length; i++){
           for (int j=0; j < arr1[0].length; j++){
               System.out.println(arr1[i][j] + " ");
            }
        }
      System.out.println("\n\nElements of arr2[] are:");
      for (int i=0; i < arr2.length; i++){
         for (int j=0; j < arr2[0].length; j++){
               System.out.println(arr2[i][j] + " ");
            }
        }
     }
}
 */

/*
 * import java.util.*;
public class solution {	
  public static float square_Root(float num) 
    { 
        float a = num; 
        float b = 1; 
        double e = 0.000001; 
        while (a - b > e) { 
            a = (a + b) / 2; 
            b = num / a; 
        } 
        return a; 
    } 
 
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = scan.nextInt();
        scan.close(); 
		System.out.println("Square root of a number using Babylonian method: "+square_Root(num));		
		}
 }

 */

/*
 * import java.util.*;
 public class Example13 {
     public static void main(String[] args){
		 
		int dec_num, rem, quot, i=1, j;  
        int bin_num[] = new int[100];  
        Scanner scan = new Scanner(System.in);  
          
        System.out.print("Input a Decimal Number : ");  
        dec_num = scan.nextInt();  
          
        quot = dec_num;  
          
        while(quot != 0)  
        {  
            bin_num[i++] = quot%2;  
            quot = quot/2;  
        }  
		String binary_str="";
		System.out.print("Binary number is: ");  
        for(j=i-1; j>0; j--)  
        {  
          binary_str = binary_str + bin_num[j];	
        }  
		System.out.print(binary_str);
        i = binary_str.length()-1;
        while(binary_str.charAt(i)=='0') {
            i--;
        }
        int length = 0;
        int ctr = 0;
        for(; i>=0; i--) {
            if(binary_str.charAt(i)=='1') {
                length = Math.max(length, ctr);
                ctr = 0;
            } else {
                ctr++;
            }
        }
        length = Math.max(length, ctr);
        System.out.println("\nLength of the longest sequence: "+length);
    }
 }

 */


/*
 * import java.util.*;
public class solution {	
  public static int multiply_two_nums(int a, int b) { 
          
        /* 0 multiplied with anything gives 0 
        if (b == 0) 
            return 0; 
      
        if (b > 0) 
            return (a + multiply_two_nums(a, b - 1)); 
            
        if (b < 0) 
            return -multiply_two_nums(a, -b); 
              
        return -1; 
    } 
 
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int num1 = scan.nextInt();
       System.out.print("Input second integer: ");
        int num2 = scan.nextInt();
        scan.close(); 
       System.out.println("Multiply of two integers: "+multiply_two_nums(num1, num2));		
		}
 }

 */

/*
 * import java.util.*;
public class solution {

    public static void main(String[] args) { 
	
	    Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scan.nextInt();
        if ((num % 2 == 0) || (num <=0 ))
        {
            System.out.print("Input number must be odd and >0"); 			
			System.exit(0); 
		}

        int[][] magic_square = new int[num][num];

        int row_num = num-1;
        int col_num = num/2;
        magic_square[row_num][col_num] = 1;

        for (int i = 2; i <= num*num; i++) {
            if (magic_square[(row_num + 1) % num][(col_num + 1) % num] == 0) {
                row_num = (row_num + 1) % num;
                col_num = (col_num + 1) % num;
            }
            else {
                row_num = (row_num - 1 + num) % num;                
            }
            magic_square[row_num][col_num] = i;
        }

        // print the square
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (magic_square[i][j] < 10)  System.out.print(" ");   
                if (magic_square[i][j] < 100) System.out.print(" ");  
                System.out.print(magic_square[i][j] + " ");
            }
            System.out.println();
        }

    }
}

 */


/*
 * import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class solution {
   public static void main(String[] args){
       List<Double> coeffs = new ArrayList<Double>();
       coeffs.add(-19.0);
       coeffs.add(7.0);
       coeffs.add(-4.0);
       coeffs.add(6.0);
       System.out.println(polyEval(coeffs, 3));
   }
   public static double polyEval(List<Double> coefficients, double x) {
       Collections.reverse(coefficients);
       Double accumulator = coefficients.get(0);
       for (int i = 1; i < coefficients.size(); i++) {
           accumulator = (accumulator * x) + (Double) coefficients.get(i);
       }
       return accumulator;
   }
}

 */


/*
 * import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class solution {
   public static void main(String[] args){
       List<Double> coeffs = new ArrayList<Double>();
       coeffs.add(-19.0);
       coeffs.add(7.0);
       coeffs.add(-4.0);
       coeffs.add(6.0);
       System.out.println(polyEval(coeffs, 3));
   }
   public static double polyEval(List<Double> coefficients, double x) {
       Collections.reverse(coefficients);
       Double accumulator = coefficients.get(0);
       for (int i = 1; i < coefficients.size(); i++) {
           accumulator = (accumulator * x) + (Double) coefficients.get(i);
       }
       return accumulator;
   }
}

 */

/*
 * import java.util.*;

class solution {

   static float Taylor_exponential(int n, float x) 
    { 
        float exp_sum = 1;  
   
        for (int i = n - 1; i > 0; --i ) 
            exp_sum = 1 + x * exp_sum / i; 
   
        return exp_sum; 
    } 

    public static void main(String[] args)
    {   
       Scanner scan = new Scanner(System.in);
       System.out.print("Input n: ");
       int n = scan.nextInt();
	   System.out.print("Input x: ");
       float x = scan.nextInt();
       if (n>0 && x>0)
		{	
		 System.out.println("e^x = "+Taylor_exponential(n,x)); 
		}         
   }
}

 */

/*
 * import java.util.*;
class solution {
    public static void main(String[] args)
    {   
      Scanner sc=new Scanner(System.in);
      Scanner scan = new Scanner(System.in);
      System.out.print("Input a number: ");
      int n = scan.nextInt();
	  if (n>0)
	  {	
       while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n /= 2; 
        } 
  
        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
        { 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n /= i; 
            } 
        } 
        if (n > 2) 
            System.out.print(n); 
       }
	}
}

 */


