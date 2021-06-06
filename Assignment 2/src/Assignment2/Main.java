package Assignment2;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
//Employee
		
			System.out.println("(Grocery Store & Employee)");
			Employee E =  new Employee();
			//Employee E1 = new Employee("YBK Grocey Store",2016,"04-4916716","Yong Boon Keat",666,"Prepared Food Shop Manager",10000);
			//Employee E2 = new Employee("YBK Grocey Store",2016,"04-4916716","Yong Sei Hui ",777,"Prepared Food Shop Cashier",5000);
			//Employee E3 = new Employee("YBK Grocey Store",2016,"04-4916716","Yong Sei Li ",888,"Prepared Food Shop Stock Controller",4000);
			E.printBehaviourInfo();
			System.out.println();
			
//Customer
			System.out.println("(Product & Customer)");
			Customer C = new Customer();
			//Customer C1 = new Customer("Kang Wei Kit","013-5262963","NO 116,Taman Kobos, 09600 Lunas, Kedah.");
			C.printBehaviourInfo();
			System.out.println();
//Finance
			System.out.println("(Inventory & Finance)");
			Finance F = new Finance();
			//Finance F1 = new Finance(50000,22500,500);
			/*
			Finance i[] = new Finance[11];
			i [0]= new Finance("Ice Cream Vanilla\t",100,4);
			i [1]= new Finance("Ice Cream Chocolate\t",100,4);
			i [2]= new Finance("Ice Cream Strawberry\t",100,4);
			i [3]= new Finance("Original Pancake\t",100,5);
			i [4]= new Finance("Buttermilk Pancake Mix\t",100,5);
			i [5]= new Finance("Marble Butter Cake Mix\t",100,5);
			i [6]= new Finance("Chicken Mushroom Pizza\t",100,5);
			i [7]= new Finance("Four Cheese Pizza\t",100,5);
			i [8]= new Finance("Hawaiian Chicken Pizza\t",100,6);
			i [9]= new Finance("Mushroom Chicken Sausages",100,6);
			i [10]= new Finance("Black Pepper Chicken Sausages",100,6);
			*/
			F.printBehaviourInfo();
			System.out.println();
			
//Advertisment
			System.out.println("(Advertisment)");
			Advertisment A = new Advertisment();
			//Advertisment A1 = new Advertisment(3,50);
			A.printBehaviourInfo();
			System.out.println();
	}
}
