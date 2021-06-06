package Assignment2;
import java.util.Scanner;
public class Advertisment {//1.3 User Define Class
	//1.2 Pre-define class
	double voucher,discount;
	
	Scanner input = new Scanner(System.in);
	public Advertisment() {//1.4 Constructor with non-argument
		System.out.print("Enter Discount: ");
		discount = input.nextDouble();//get discount
		
		System.out.print("Enter Voucher: ");
		voucher = input.nextDouble();//get voucher
		setPromotion(discount,voucher);
		
		System.out.println("=====================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tHot Promotion");
		System.out.println("=====================================================================================================================");
		System.out.println("If you buy more than RM100 can get discount " + getDiscount() + "%");
		System.out.println("If you buy more than RM250 can get discount " + getDiscount() + "% and use voucher RM" +  getVoucher());
		SocialMedia();
	}
	
	public Advertisment(double discount,double voucher) {//1.4 Constructor with argument
		setPromotion(discount,voucher);
		System.out.println("=====================================================================================================================");
		System.out.println("\t\t\t\t\t\t\tHot Promotion");
		System.out.println("=====================================================================================================================");
		System.out.println("If you buy more than RM100 can get discount " + getDiscount() + "%");
		System.out.println("If you buy more than RM250 can get discount " + getDiscount() + "% and use voucher RM" +  getVoucher());
		SocialMedia();
	}
	
	//2.3 Encapsulation---Create Setter Method
		public void setPromotion(double discount,double voucher){  // Method to set promotion discount and voucher
			this.discount = discount;//discount 3%
			this.voucher = voucher ;//Get voucher RM50
	}
		
	//2.3 Encapsulation---Create Getter Method
	public double getDiscount() {//Method to get discount
			return this.discount;
	}
	public double getVoucher() {//Method to get voucher
		return this.voucher ;
	}
	
	void SocialMedia() {//Method print social media
		System.out.println("You can find more information about us on numerous social media platforms!!!"
							+ "\nFacebook  : YBK Grocery Store"
							+ "\nInstagram : @YBKGroceryStore"
							+ "\nWebsite   : http://www.YBKGroceryStore.com.my");
		System.out.println("=====================================================================================================================");
	}
	public void printBehaviourInfo() {//2.2 Polymorphism Method print behaviour info for this class
		System.out.println("Advertisement or Marketing for product are behavior of grocery store business.");
	}
}
