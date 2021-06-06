package Assignment2;
import java.util.Scanner;

public class Customer extends ProductDescription{//1.3 User Define Class //Sub class
	
	//1.2 Pre-define class
	String customerName,phoneNumber,address,orderName;// Variable to store itemNumber,itemName
	int orderQuantity;// Variable to store quantity,choice
	double itemPrice,TotalPrice,payment;// Variable to priceItem,subTotalItem,TotalPric
	char online;
	
	Scanner input = new Scanner(System.in);
	public Customer(){	//1.4 Constructor with non-argument	
		super();
		System.out.print("Are you online ordering? (Y/N):");
		char online = input.next().charAt(0); 
		input.nextLine();
		if (online == 'y' || online == 'Y'){
	          
		System.out.print("Enter Your Name: ");
		this.customerName = input.nextLine();	
				
		System.out.print("Enter Your Phone Number: ");
		this.phoneNumber = input.nextLine();
				
		System.out.print("Enter Your Address: ");
		this.address = input.nextLine();
		
		setCustomerInfo(customerName,phoneNumber,address);
		OrderItem();
		if (TotalPrice <= 100) {
			System.out.println("=================================================================================");
			System.out.println("\t\t\t\tReceipt Customer");
			System.out.println("=================================================================================");
			Payment A = new CustomerPayment();
			payment = A.Payment();
			System.out.println("Total Price\t\t: RM" + TotalPrice);
			System.out.println("Amount Payment \t\t: RM" + payment);
			System.out.println("Balance \t\t: RM" + getPayment());
			System.out.println("=================================================================================");
		}
		else if(TotalPrice > 100 && TotalPrice <= 250) {
			Payment A = new CustomerPayment();
			payment = A.Payment();
			double discount = 0.03;
			getPayment(discount);
			System.out.println("=================================================================================");
			System.out.println("\t\t\t\tReceipt Customer");
			System.out.println("=================================================================================");
			System.out.println("Total Price\t\t: RM" + TotalPrice);
			System.out.println("Discount \t\t: " + (discount*100)+"%");
			System.out.println("Amount Payment \t\t: RM" + payment);
			System.out.println("Balance \t\t: RM" + getPayment(discount));
			System.out.println("=================================================================================");
		}
		else {
			Payment A = new CustomerPayment();
			payment = A.Payment();	
			double voucher = 50;
			double discount = 0.03;
			getPayment(discount,voucher);
			System.out.println("=================================================================================");
			System.out.println("\t\t\t\tReceipt Customer");
			System.out.println("=================================================================================");
			System.out.println("Total Price\t\t: RM" + TotalPrice);
			System.out.println("Discount \t\t: " + (discount*100)+"%");
			System.out.println("Voucher \t\t: RM" + voucher);
			System.out.println("Amount Payment \t\t: RM" + payment);
			System.out.println("Balance \t\t: RM" + getPayment(discount,voucher));
			System.out.println("=================================================================================");
		}
		}//Online Ordering
		else if(online == 'n' || online == 'N'){
			OrderItem();
			if (TotalPrice <= 100) {
				System.out.println("=================================================================================");
				System.out.println("\t\t\t\tReceipt Customer");
				System.out.println("=================================================================================");
				Payment A = new CustomerPayment();
				payment = A.Payment();
				System.out.println("Total Price\t\t: RM" + TotalPrice);
				System.out.println("Amount Payment \t\t: RM" + payment);
				System.out.println("Balance \t\t: RM" + getPayment());
				System.out.println("=================================================================================");	
			}
			else if(TotalPrice > 100 && TotalPrice <= 250) {
				Payment A = new CustomerPayment();
				payment = A.Payment();
				double discount = 0.03;
				getPayment(discount);
				System.out.println("=================================================================================");
				System.out.println("\t\t\t\tReceipt Customer");
				System.out.println("=================================================================================");
				System.out.println("Total Price\t\t: RM" + TotalPrice);
				System.out.println("Discount \t\t: " + (discount*100)+"%");
				System.out.println("Amount Payment \t\t: RM" + payment);
				System.out.println("Balance \t\t: RM" + getPayment(discount));
				System.out.println("=================================================================================");
			}
			else {
				Payment A = new CustomerPayment();
				payment = A.Payment();	
				double voucher = 50;
				double discount = 0.03;
				getPayment(discount,voucher);
				System.out.println("=================================================================================");
				System.out.println("\t\t\t\tReceipt Customer");
				System.out.println("=================================================================================");
				System.out.println("Total Price\t\t: RM" + TotalPrice);
				System.out.println("Discount \t\t: " + (discount*100)+"%");
				System.out.println("Voucher \t\t: RM" + voucher);
				System.out.println("Amount Payment \t\t: RM" + payment);
				System.out.println("Balance \t\t: RM" + getPayment(discount,voucher));
				System.out.println("=================================================================================");
			}
		}//Not Online Order
	}//End Customer non-argument
	
	public Customer(String customerName,String phoneNumber,String address) {//1.4 Constructor with argument
		super();
		System.out.print("Are you online ordering? (Y/N):");
		char online = input.next().charAt(0); 
		if (online == 'y' || online == 'Y'){
			setCustomerInfo(customerName,phoneNumber,address);//call method
			System.out.println();
		OrderItem();
		if (TotalPrice <= 100) {
			System.out.println("=================================================================================");
			System.out.println("\t\t\t\tReceipt Customer");
			System.out.println("=================================================================================");
			Payment A = new CustomerPayment();
			payment = A.Payment();
			System.out.println("Total Price\t\t: RM" + TotalPrice);
			System.out.println("Amount Payment \t\t: RM" + payment);
			System.out.println("Balance \t\t: RM" + getPayment());
			System.out.println("=================================================================================");
		}
		else if(TotalPrice > 100 && TotalPrice <= 250) {
			Payment A = new CustomerPayment();
			payment = A.Payment();
			double discount = 0.03;
			getPayment(discount);
			System.out.println("=================================================================================");
			System.out.println("\t\t\t\tReceipt Customer");
			System.out.println("=================================================================================");
			System.out.println("Total Price\t\t: RM" + TotalPrice);
			System.out.println("Discount \t\t: " + (discount*100)+"%");
			System.out.println("Amount Payment \t\t: RM" + payment);
			System.out.println("Balance \t\t: RM" + getPayment(discount));
			System.out.println("=================================================================================");
		}
		else {
			Payment A = new CustomerPayment();
			payment = A.Payment();	
			double voucher = 50;
			double discount = 0.03;
			getPayment(discount,voucher);
			System.out.println("=================================================================================");
			System.out.println("\t\t\t\tReceipt Customer");
			System.out.println("=================================================================================");
			System.out.println("Total Price\t\t: RM" + TotalPrice);
			System.out.println("Discount \t\t: " + (discount*100)+"%");
			System.out.println("Voucher \t\t: RM" + voucher);
			System.out.println("Amount Payment \t\t: RM" + payment);
			System.out.println("Balance \t\t: RM" + getPayment(discount,voucher));
			System.out.println("=================================================================================");
		}
		}//Online Ordering
		else if(online == 'n' || online == 'N'){
		OrderItem();
		if (TotalPrice <= 100) {
			System.out.println("=================================================================================");
			System.out.println("\t\t\t\tReceipt Customer");
			System.out.println("=================================================================================");
			Payment A = new CustomerPayment();
			payment = A.Payment();
			System.out.println("Total Price\t\t: RM" + TotalPrice);
			System.out.println("Amount Payment \t\t: RM" + payment);
			System.out.println("Balance \t\t: RM" + getPayment());
			System.out.println("=================================================================================");
		}
		else if(TotalPrice > 100 && TotalPrice <= 250) {
			Payment A = new CustomerPayment();
			payment = A.Payment();
			double discount = 0.03;
			getPayment(discount);
			System.out.println("=================================================================================");
			System.out.println("\t\t\t\tReceipt Customer");
			System.out.println("=================================================================================");
			System.out.println("Total Price\t\t: RM" + TotalPrice);
			System.out.println("Discount \t\t: " + (discount*100)+"%");
			System.out.println("Amount Payment \t\t: RM" + payment);
			System.out.println("Balance \t\t: RM" + getPayment(discount));
			System.out.println("=================================================================================");
		}
		else {
			Payment A = new CustomerPayment();
			payment = A.Payment();	
			double voucher = 50;
			double discount = 0.03;
			getPayment(discount,voucher);
			System.out.println("=================================================================================");
			System.out.println("\t\t\t\tReceipt Customer");
			System.out.println("=================================================================================");
			System.out.println("Total Price\t\t: RM" + TotalPrice);
			System.out.println("Discount \t\t: " + (discount*100)+"%");
			System.out.println("Voucher \t\t: RM" + voucher);
			System.out.println("Amount Payment \t\t: RM" + payment);
			System.out.println("Balance \t\t: RM" + getPayment(discount,voucher));
			System.out.println("=================================================================================");
		}
		}//Not Online Order
	}//End Customer Constructor with argument
	
	//2.3 Encapsulation---Create Setter Method
	public void setCustomerInfo(String customerName,String phoneNumber,String address) {//Method to print Customer Info
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		System.out.println("=================================================================================");
		System.out.println("\t\t\t\tInfo Customer");
		System.out.println("=================================================================================");
		System.out.println("Customer Name \t:" + customerName);
		System.out.println("Phone Number \t:" + phoneNumber);
		System.out.println("Address \t:" + address);
		System.out.println("=================================================================================");
	}
	
	//2.3 Encapsulation---Create Getter Method
	
	public String getCustomerName() {//Method to get Customer Name
		return this.orderName;
	}
	public String getphoneNumber() {//Method to get Phone Number
		return this.phoneNumber;
	}	
	public String getAddress() {//Method to get Customer address 
		return this.address;
	}
	public String getOrderName() {//Method to get Name Item
		return this.orderName;
	}
	public int getOrderQuantity() {//Method to get Quantity Item
		return this.orderQuantity;
	}
	public double getItemPrice() { //Method to get Price Item
		return this.itemPrice;
	}
	public double SubtotalItem() {//Method to get Sub-total Item
		return this.orderQuantity * this.itemPrice;
	}
	public double TotalPriceOrderItem() {//Method to get Total Price order item from customer
		return TotalPrice;
	}
	
	public double getPayment() {//Method to get Payment
		return payment-TotalPrice;
	}
	public double getPayment(double discount) {//Method to get Payment
		return payment-(TotalPrice*(1-discount));//discount3%
	}
	public double getPayment(double discount,double voucher) {//Method to get Payment
		return payment-(TotalPrice*(1-discount)-voucher);//discount3%
	}
	public void OrderItem() {//Method to print OrderItem
		int choice;
		System.out.println();
		System.out.println("===================================================================================");
		System.out.println("1. Ice Cream Vanilla                     RM8.00");
        System.out.println("2. Ice Cream Chocolate                   RM8.00");
        System.out.println("3. Ice Cream Strawberry                  RM8.00");
        System.out.println("4. Original Pancake                      RM9.00");
   		System.out.println("5. Buttermilk Pancake Mix                RM9.00");
   		System.out.println("6. Marble Butter Cake Mix                RM9.00");
        System.out.println("7. Chicken Mushroom Pizza                RM9.00");
        System.out.println("8. Four Cheese Pizza                     RM9.00");
        System.out.println("9. Hawaiian Chicken Pizza                RM9.00");
        System.out.println("10. Mushroom Chicken Sausages            RM10.00" );
        System.out.println("11. Black Pepper Chicken Sausages        RM10.00");         
        System.out.println("0. Payment");
        System.out.println("===================================================================================");
        System.out.println();
        
        do {
    	System.out.print("Enter Your Choice: ");
    	choice = input.nextInt();
    	input.nextLine();
    	if (choice == 0 || choice > 11)
    	break;
    	System.out.print("Enter Quantity: ");
    	this.orderQuantity = input.nextInt();
    				switch (choice) {
    				
    				case 1:;
    						orderName = "Ice Cream Vanilla\t";
    						itemPrice = 8.0;
    						SubtotalItem();
    						break;
    				case 2:
    						orderName = "Ice Cream Chocolate\t";
    						itemPrice = 8.0;
    						SubtotalItem();
    						break;
    				case 3:
    			    		orderName = "Ice Cream Strawberry\t";
    						itemPrice = 8.0;
    						SubtotalItem();
    						break;
    				case 4:
    						orderName = "Original Pancake\t";
    						itemPrice = 9.0;
    						SubtotalItem();
    						break;
    				case 5:
    						orderName = "Buttermilk Pancake Mix\t";
							itemPrice = 9.0;
							SubtotalItem();
							break;
    				case 6:
    						orderName = "Marble Butter Cake Mix\t";
							itemPrice = 9.0;
							SubtotalItem();
							break;
    				case 7:
    						orderName = "Chicken Mushroom Pizza\t";
    						itemPrice = 9.0;
    						SubtotalItem();
    						break;
    				case 8:	
    						orderName = "Four Cheese Pizza\t";
    						itemPrice = 9.0;
    						SubtotalItem();
    						break;
    				case 9:
    						orderName = "Hawaiian Chicken Pizza\t";
    						itemPrice = 9.0;
    						SubtotalItem();
							break;		
    				case 10:
    						orderName = "Mushroom Chicken Sausages ";
    						itemPrice = 10.0;
    						SubtotalItem();
							break;
    				case 11:
    						orderName = "Black Pepper Chicken Sausages";
    						itemPrice = 10.0;
    						SubtotalItem();
							break;
    			} //End switch (choice) 
    				TotalPrice = TotalPrice + (this.orderQuantity * itemPrice);
    				System.out.println("=========================================================================================================================================");
			 		System.out.println("\t\t\tItem Name\t\t\t\t|\tItem Quantity \t|\tItem Price \t| \t Subtotal \t|");
			 		System.out.println("=========================================================================================================================================");
					System.out.println(orderName +"\t\t\t\t\t|\t" + orderQuantity + "\t\t|\t" +itemPrice+ "\t\t|\t" + SubtotalItem() +"\t\t|");
					System.out.println("=========================================================================================================================================");
    				System.out.println();
        }while(choice > 0);	
        System.out.println("_________________________________________________________________________________________________________________________________________");
        System.out.println("Total Price\t\t\t\t\t\t\t\t\t\t\t\t\t       RM " + TotalPrice);
        System.out.println("=========================================================================================================================================");
        System.out.println();
}
	public void printBehaviourInfo() {//2.2 Polymorphism Method print behaviour info for this class
		super.printBehaviourInfo();
		System.out.println("Customer Registration are behavior of grocery store business.");
	}
}