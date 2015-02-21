
/**
  * CIS 1500
  * @author Joseph Borkowski
  * Winter Semester
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class GroceryBill {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a cost for the grocery bill.");
		Scanner sc = new Scanner(System.in);
//		String userInput = sc.nextLine(); 
		int x = sc.nextInt();
		System.out.println("Your bill is $" + x);
		for(double i = 5; i < 8; i++){
			DecimalFormat df = new DecimalFormat("#.00");
			double determineTax = 1 + ( i / 100);
			double total = determineTax * x;
			
			System.out.println("With "+ i + "% tax that is $" + df.format(total));
		}
		
	}
 
}
