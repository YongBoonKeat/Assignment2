package Assignment2;
import java.util.Scanner;
public abstract class Inventory {//2.1 Inheritance Super class
	
	protected String itemName;
	protected int itemQuantity;
	protected double itemPrice,TotalPricePurchase;
	protected double payment;
	Scanner input = new Scanner(System.in);
	
	
	public Inventory() {//Constructor with non-arguments
		System.out.println("=========================================================================================================================================");
		System.out.println(" \t\t\t\t\t\t\tList Inventory"); 
		System.out.println("=========================================================================================================================================");
		System.out.println("\t\t\tItem Name\t\t\t\t|\tItem Quantity \t|\tItem Price \t| \t Subtotal \t|");
		setStockInventory("Ice Cream Vanilla \t\t\t\t",100,4);
		printStockInventory();
		setStockInventory("Ice Cream Chocolate \t\t\t\t",100,4);
		printStockInventory();
		setStockInventory("Ice Cream Strawberry \t\t\t\t",100,4);
		printStockInventory();
		setStockInventory("Original Pancake \t\t\t\t",100,5);
		printStockInventory();
		setStockInventory("Buttermilk Pancake Mix \t\t\t\t",100,5);
		printStockInventory();
		setStockInventory("Marble Butter Cake Mix \t\t\t\t",100,5);
		printStockInventory();
		setStockInventory("Chicken Mushroom Pizza \t\t\t\t",100,5);
		printStockInventory();
		setStockInventory("Four Cheese Pizza \t\t\t\t",100,5);
		printStockInventory();
		setStockInventory("Hawaiian Chicken Pizza \t\t\t\t",100,6);
		printStockInventory();
		setStockInventory("Mushroom Chicken Sausages\t\t\t",100,6);
		printStockInventory();
		setStockInventory("Black Pepper Chicken Sausages\t\t\t",100,6);
		printStockInventory();
		System.out.println("_________________________________________________________________________________________________________________________________________");
        System.out.println("Total Price Purchase\t\t\t\t\t\t\t\t\t\t\t\t\tRM " + TotalPricePurchase());
        System.out.println("=========================================================================================================================================");
        System.out.println();
        Payment I = new InventoryPayment();
		payment = I.Payment();
		printReceipt();
	}
	
	public Inventory(String itemName,int itemQuantity,double itemPrice) {//1.4 Constructor with argument
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		printStockInventory();
		Payment I = new InventoryPayment();
		payment = I.Payment();

	}
	
	//2.3 Encapsulation---Create Setter Method
	public void setStockInventory(String itemName,int itemQuantity,double itemPrice){  // Method to set the Stock Inventory
			this.itemName = itemName;
			this.itemQuantity = itemQuantity;
			this.itemPrice = itemPrice;
	}
	
	//2.3 Encapsulation---Create Getter Method
	public String getItemName() {//Method to get Item name
			return this.itemName;
	}	
	public int getItemQuantity() {//Method to get Quantity Item
		return this.itemQuantity;
	}
	public double getItemPrice() {//Method to get Price Item
		return this.itemPrice;
	}
	public double SubTotalPricePurchase() {//Method to get the sub total price of every inventory stock
		return this.itemQuantity * this.itemPrice;
	}
	public double TotalPricePurchase() {//Method to get the total price of all inventory stock
		return TotalPricePurchase;
	}
	public double getPayment() {//Method to get Payment
		return payment-TotalPricePurchase;
	}
	public void printStockInventory() {//Method to print stock inventory
		System.out.println(getItemName() +"\t\t|\t"+ getItemQuantity() + "\t\t|\t" + getItemPrice() + "\t\t|\t" + SubTotalPricePurchase() +"\t\t|");
		TotalPricePurchase +=SubTotalPricePurchase() ;
	}
	public void printReceipt() {//Method to print receipt inventory
		System.out.println("=================================================================================");
		System.out.println("\t\t\t\tReceipt Inventory");
		System.out.println("=================================================================================");
		System.out.println("Total Price Purchase           RM" + TotalPricePurchase());
		System.out.println("Amount Payment                 RM" + payment);
		System.out.println("Balance                        RM" + getPayment());
		System.out.println("=================================================================================");
		System.out.println();
	}
	public void printBehaviourInfo() {//2.2 Polymorphism Method print behaviour info for this class
		System.out.println("Inventory are behavior of grocery store business.");
	}
	public abstract double getTotalIncome();
	public abstract double getTotalSalary();
	public abstract double getIncidentalCharges();
	public abstract double getTotalProfit();
	
}
