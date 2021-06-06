package Assignment2;

public abstract class ProductDescription {//2.1 Inheritance Super class
	protected String itemCode,itemSubcategory,itemCategory,department;

	public ProductDescription() {//Constructor with non-arguments
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Prepared Food"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t|\t\tSubcategory \t\t| \t  Category\t\t| \tDeparment \t\t|");
		setItemInfo("PF-86\t\t|","Ice Cream\t\t\t\t|","Frozen Desserts\t\t|","Frozen Foods\t\t\t|");//call method
		CategoryProduct();
		
		setItemInfo("PF-87\t\t|","Pancakes\t\t\t\t|","Frozen Desserts\t\t|","Frozen Foods\t\t\t|");//call method
		CategoryProduct();
		
		setItemInfo("PF-88\t\t|","Pizza\t\t\t\t\t|","Frozen Pizza\t\t\t|","Frozen Foods\t\t\t|");//call method
		CategoryProduct();
		
		setItemInfo("PF-89\t\t|","Frozen Chicken\t\t\t\t|","Frozen Meat\t\t\t|","Frozen Foods\t\t\t|");//call method
		CategoryProduct();
		System.out.println("=========================================================================================================================");
		IceCreamInfo();	
		PancakesInfo();
		PizzaInfo();
		ChickenInfo();
		}
	
	public ProductDescription( String itemCode,String itemSubcategory, String itemCategory,String department) {//Constructor with arguments
		setItemInfo(itemCode,itemSubcategory,itemCategory,department);//call method
		CategoryProduct();
		IceCreamInfo();	
		PancakesInfo();
		PizzaInfo();
		ChickenInfo();
	}
	
	//2.3 Encapsulation---Create Setter Method
	public void setItemInfo(String itemCode,String itemSubcategory,String itemCategory,String department){  // Method to set the item code
		this.itemCode = itemCode;
		this.itemSubcategory = itemSubcategory;
		this.itemCategory = itemCategory;
		this.department = department;
	}
	
	//2.3 Encapsulation---Create Getter Method
	public String getItemCode(){  // Method to get the item code
		return this.itemCode;
	}	
	public String getItemSubcategory() { // Method to get the item Sub-category
			return this.itemSubcategory;
	}					
	public String getItemCategory(){  // Method to get the item category
		return this.itemCategory;
	}
	public String getDepartment(){  // Method to get the item department
		return this.department;
	}
	void CategoryProduct() {
		System.out.println(getItemCode() + getItemSubcategory() + getItemCategory() + getDepartment());
	}
	
	void IceCreamInfo() {// method printInfo
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Ice Cream"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t| \t\t Item Name \t\t\t|\tItem Price \t| \t    Item Size \t\t|");
		System.out.println("FF-864\t\t|" + "\t\tIce Cream Vanilla\t\t|" + "\t RM8.00 \t|" + "\t\t1.5L\t\t|");
		System.out.println("FF-865\t\t|" + "\t\tIce Cream Chocolate\t\t|" + "\t RM8.00 \t|" + "\t\t1.5L\t\t|");
		System.out.println("FF-866\t\t|" + "\t\tIce Cream Strawberry\t\t|" + "\t RM8.00 \t|" + "\t\t1.5L\t\t|");
		System.out.println("=========================================================================================================================");
		System.out.println();
	}
	
	void PancakesInfo() {// method printInfo
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Pancakes"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t| \t\t    Item Name \t\t\t|\tItem Price \t| \t    Item Size \t\t|");
		System.out.println("FF-874\t\t|" + "\t\tOriginal Pancake\t\t|" + "\t RM9.00 \t|" + "\t\t400g\t\t|");
		System.out.println("FF-875\t\t|" + "\t\tButtermilk Pancake Mix\t\t|" + "\t RM9.00 \t|" + "\t\t400g\t\t|");
		System.out.println("FF-876\t\t|" + "\t\tMarble Butter Cake Mix\t\t|" + "\t RM9.00 \t|" + "\t\t400g\t\t|");
		System.out.println("=========================================================================================================================");
		System.out.println();
	}
	
	void PizzaInfo() {//method printInfo
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Pizza"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t| \t\t Item Name \t\t\t|\tItem Price \t| \t  Item Size \t\t|");
		System.out.println("FF-884\t\t|" + "\t\tChicken Mushroom Pizza\t\t|" + "\t RM10.00 \t|" + "\t    300g\t\t|");
		System.out.println("FF-885\t\t|" + "\t\tFour Cheese Pizza\t\t|" + "\t RM10.00 \t|" + "\t    285g\t\t|");
		System.out.println("FF-886\t\t|" + "\t\tHawaiian Chicken Pizza\t\t|" + "\t RM10.00 \t|" + "\t    310g\t\t|");
		System.out.println("=========================================================================================================================");
		System.out.println();
	}
	
	void ChickenInfo() {// method printInfo
		System.out.println("=========================================================================================================================");
		System.out.println(" \t\t\t\t\t\tList of Frozen Chicken"); 
		System.out.println("=========================================================================================================================");
		System.out.println("Item Code\t| \t\t Item Name \t\t\t\t\t|\tItem Price \t|   Item Size \t|");
		System.out.println("FF-894\t\t|" + "\t\tMushroom Chicken Sausages\t\t\t|" + "\t RM11.00 \t|" + "\t500g\t|");
		System.out.println("FF-895\t\t|" + "\t\tBlack Pepper Chicken Sausages\t\t\t|" + "\t RM10.00 \t|" + "\t500g\t|");
		System.out.println("=========================================================================================================================");
		System.out.println();
	}
	public void printBehaviourInfo() {//2.2 Polymorphism Method print behaviour info for this class
		System.out.println("Product description are behavior of grocery store business.");
	}
	public abstract double getPayment();
	public abstract double getPayment(double discount);
	public abstract double getPayment(double discount,double voucher);
}
