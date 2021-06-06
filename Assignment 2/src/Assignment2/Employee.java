package Assignment2;
import java.util.Scanner;
//Employee is subclass extends to bring some data from super class
public class Employee extends PreparedFoodShop {//2.1 Inheritance Sub class
	private String employeeName,position;												
	private int employeeID;															
	private double salary,OT,commission;					
	
	Scanner input = new Scanner(System.in);
	public Employee() {	//1.4 Constructor with non-argument
		super();
		setEmployeeInfo("Yong Boon Keat",666,"Prepared Food Shop Manager",10000);
		EmployeeInfo ();
		
		setEmployeeInfo("Yong Sei Hui",777,"Prepared Food Shop Cashier",5000);
		EmployeeInfo ();
		
		setEmployeeInfo("Yong Sei Li",888,"Prepared Food Shop Stock Controller",3000);
		EmployeeInfo ();		
    }
	
	public Employee(String storeName, int yearEstablished,String PhoneNum,String employeeName, int employeeID,String position, double salary) {	//1.4 Constructor with argument
		super(storeName, yearEstablished,PhoneNum);
		setEmployeeInfo(employeeName,employeeID,position,salary);
		EmployeeInfo();
		
    }
	
	//2.3 Encapsulation---Create Setter Method
	public void setEmployeeInfo(String employeeName,int employeeID,String position,double salary){
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.position = position;
		this.salary = salary;
	}	

	
	//2.3 Encapsulation---Create Getter Method
	public String getEmployeeName(){  // Method to get EmployeeName
		return this.employeeName;
	}	
	public int getEmployeeID() { // Method to get EmployeeID
		return this.employeeID;
	}					
	public String getPosition(){  // Method to get Position
		return this.position;
	}
	public double getSalary(){  // Method to get Salary
		return this.salary;
	}
	
	//Overloading method
	public double totalPaid() {  //overloading method with no argument
		return salary;
	}
	public double totalPaid(double OT) {  //overloading method with 1 argument
		return salary+ OT;
	}
	public double totalPaid(double OT,double commission) {  //overloading method with 2 arguments
		return salary + OT + commission; 
	} 
	
	public void EmployeeInfo () {//Method print Employee Info
		if(position == "Prepared Food Shop Manager" || position ==  "Manager"){ 
		 OT=300;
		 commission =3000;
		 totalPaid(OT,commission);
		 System.out.println("=================================================================================");
		 System.out.println("\t\t\t\tInfo Employee");
		 System.out.println("=================================================================================");
	     System.out.println("Employee Name\t\t\t\t: " + getEmployeeName());
	     System.out.println("Employee ID\t\t\t\t: " + getEmployeeID() );
	     System.out.println("Position\t\t\t\t: " + getPosition());
	     System.out.println("Basic Salary\t\t\t\t: RM" + getSalary());
	     System.out.println("OT (Overtime)\t\t\t\t: RM" +  this.OT );
	     System.out.println("Commision\t\t\t\t: RM" +  this.OT );
	     System.out.println("Total Salary\t\t\t\t: RM" +  totalPaid(OT,commission));
	     System.out.println("=================================================================================");
	}
		else if(position == "Prepared Food Shop Cashier" || position =="Cashier"){ 
			 OT=200;
			 totalPaid(OT);
			 System.out.println("=================================================================================");
			 System.out.println("\t\t\t\tInfo Employee");
			 System.out.println("=================================================================================");
		     System.out.println("Employee Name\t\t\t\t: " + getEmployeeName());
		     System.out.println("Employee ID\t\t\t\t: " + getEmployeeID() );
		     System.out.println("Position\t\t\t\t: " + getPosition());
		     System.out.println("Basic Salary\t\t\t\t: RM" + getSalary());
		     System.out.println("OT (Overtime)\t\t\t\t: RM" +  this.OT );
		     System.out.println("Total Salary\t\t\t\t: RM" +  totalPaid(OT));
		     System.out.println("=================================================================================");
	}
		else {
			 System.out.println("=================================================================================");
			 System.out.println("\t\t\t\tInfo Employee");
			 System.out.println("=================================================================================");
		     System.out.println("Employee Name\t\t\t\t: " + getEmployeeName());
		     System.out.println("Employee ID\t\t\t\t: " + getEmployeeID() );
		     System.out.println("Position\t\t\t\t: " + getPosition());
		     System.out.println("Basic Salary\t\t\t\t: RM" + getSalary());
		     System.out.println("Total Salary\t\t\t\t: RM" +  totalPaid());
		     System.out.println("=================================================================================");
		}	
	}
	public void printBehaviourInfo() {//2.2 Polymorphism Method print behaviour info for this class
		super.printBehaviourInfo();
		System.out.println("Employees are behavior of grocery store business.");
	}
	
}
