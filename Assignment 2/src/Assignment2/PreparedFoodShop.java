package Assignment2;

public abstract class PreparedFoodShop {//2.1 Inheritance Super class
	protected String storeName;
	protected int yearEstablished;
	protected String PhoneNum;
	
	public PreparedFoodShop() {//1.4 Constructor with non-arguments
		setGroceryStoreInfo("YBK Grocey Store", 2016,"04-4916716");
		GroceryStoreInfo();
	}

	public PreparedFoodShop(String storeName, int yearEstablished,String PhoneNum) {//1.4 Constructor with arguments
		setGroceryStoreInfo(storeName,yearEstablished,PhoneNum);//call method
		GroceryStoreInfo();
	}	
	//2.3 Encapsulation---Create Setter Method
	  public void setGroceryStoreInfo(String storeName, int yearEstablished,String PhoneNum) {
		  this.storeName = storeName;
		  this.yearEstablished = yearEstablished;
		  this.PhoneNum = PhoneNum;
	  }
	  
	  //2.3 Encapsulation---Create Getter Method
	  public String getStoreName() {
		  return this.storeName;
	  }
	  
	  public int getYearEstablished() {
		  return this.yearEstablished;
	  }
	  
	  public String getPhoneNumber() {
	 	  return this.PhoneNum;
	  }
	  
	public void GroceryStoreInfo() {//method print grocery store info
		System.out.println("==================================================" 
				+ "\nName Grocery Store     : " + getStoreName()
				+ "\nYearEstablished        : " + getYearEstablished() 
				+ "\nContact number         : " + getPhoneNumber() 
				+ "\n==================================================");
	}
	
	public void printBehaviourInfo() {//2.2 Polymorphism method print behaviour info for this class
		System.out.println("Company Background are behavior of grocery store business.");
	}
	
	//2.4 Abstraction---abstract method
	public abstract double totalPaid();
	public abstract double totalPaid(double OT);
	public abstract double totalPaid(double OT,double commission);
}

