import java.text.*; //for decimal format
import java.util.*;
public class JavaExample1 {
	public static void main(String[] args) {
		//input from keyboards
		Scanner scan = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//input product name
		System.out.print("Input product name   : ");
		String productName = scan.nextLine();
		//input product unit
		System.out.print("Input product unit   : ");
		int productUnit = scan.nextInt();
		//input price per unit
		System.out.print("Input price per unit : ");
		float productPrice = scan.nextFloat();
		
		System.out.println();
		System.out.println("Product name is "+ productName);
		
		float totalPriceProduct = productUnit*productPrice;
		System.out.println("Total Price is " + frm.format(totalPriceProduct) + " baht.");
		//add VAT7%
		float totalVat = totalPriceProduct + (totalPriceProduct * 7/100);
		System.out.println("Add VAT 7%  is " + frm.format(totalVat) + " baht.");

		//using string format and printf
		System.out.println("\n***** Using printf and String format *****");
		System.out.printf("Product name is : %s",productName);
		System.out.printf("\nTotal Price is: %,.2f baht.", totalPriceProduct);
		System.out.printf("\nAdd VAT 7%% is %s baht.",String.format("%.2f",totalVat ));
		
		scan.close();
		
	}

}
