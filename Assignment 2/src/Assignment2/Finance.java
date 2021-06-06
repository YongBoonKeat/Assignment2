package Assignment2;
import java.util.Scanner;
public class Finance extends Inventory{//1.3 User Define Class
	//1.2 Pre-define class
	private double income,salary,TotalPricePurchase,incidentalCharges,totalProfit;//Variable to store itemPrice,TotalPricePurchase
	
	Scanner input = new Scanner(System.in);
	public Finance() {//1.4 Constructor with non-argument
		super();
		System.out.print("Enter Income Grocery: ");//Total income grocery
		this.income = input.nextDouble();		
				
		System.out.print("Enter Total Salary: ");//Total salary for all employee
		this.salary = input.nextDouble();	
				
		System.out.print("Enter Incidental Charges: ");//Incidental Charges Grocery
		this.incidentalCharges = input.nextDouble();

		ReportFinance();
	}

	public Finance(double income,double salary,double incidentalCharges) {//1.4 Constructor with argument
		super();
		this.income = income;
		this.salary = salary;
		this.incidentalCharges = incidentalCharges;
		totalProfit = (this.income -(this.salary + TotalPricePurchase() +this.incidentalCharges));
		ReportFinance();
		
	}

	public double getTotalIncome() {//Method to get the all income prepared food shop
		return this.income;
	}
	
	public double getTotalSalary() {//Method to get the total salary pay to employee 
		return this.salary;
	}
	
	public double TotalPricePurchase() {//Method to get the total price of all inventory stock
		return super.TotalPricePurchase;
	}
	
	public double getIncidentalCharges() {//Method to get the incidental charges
		return this.incidentalCharges;
	}
	
	public double getTotalProfit() {//Method to get the total profit
		return totalProfit;
	}
	
	public void ReportFinance() {//Method to print Report Finance
		totalProfit = (this.income -(this.salary + TotalPricePurchase() +this.incidentalCharges));
		System.out.println("=========================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tReport Finance");
		System.out.println("=========================================================================================================================================");
		System.out.println("Total Income\t\t\t\t\t\t\t\t\t\t\t\t\t\tRM "+income);
		System.out.println("(-)Total Salary Employee\t\t\t\t\t\t\t\t\t\t\t\tRM "+salary);
		System.out.println("(-)Total Price Purchase Inventory\t\t\t\t\t\t\t\t\t\t\tRM "+TotalPricePurchase());
		System.out.println("(-)Incidental Charges\t\t\t\t\t\t\t\t\t\t\t\t\tRM "+ incidentalCharges);
		System.out.println("_________________________________________________________________________________________________________________________________________");
		System.out.println("Total Profit\t\t\t\t\t\t\t\t\t\t\t\t\t        RM " + getTotalProfit() );
		System.out.println("=========================================================================================================================================");
	    System.out.println();
	}
	public void printBehaviourInfo() {//2.2 Polymorphism Method print behaviour info for this class
		super.printBehaviourInfo();
		System.out.println("Finance and sales are behavior of grocery store business.");
	}
}
