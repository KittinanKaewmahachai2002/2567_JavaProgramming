import java.util.Scanner;
import javax.swing.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Product Name   : ");
		String productName = scan.next();
		System.out.print("Input Product Unit   : ");
		String productUnitStr = scan.next();
		int productUnit = Integer.parseInt(productUnitStr);
		System.out.print("Input Price per unit : ");
		String productPriceStr = scan.next();
		double productPrice = Double.parseDouble(productPriceStr);
		
		double totalPrice = productPrice * productUnit;
		String frmTotalPrice = String.format("%,.2f", totalPrice);
		
		System.out.println("--------------------------------------");
		System.out.print("Total Price is "+frmTotalPrice+" baht.");
		System.out.println("\n--------------------------------------");
		System.out.print("How many discount (%) : ");
		String discountStr = scan.next();
		double discount = Double.parseDouble(discountStr);
		System.out.println("--------------------------------------");
		double discountPrice = totalPrice * discount/100;
		String frmVatPrice = String.format("%,.2f", discountPrice);
		System.out.println("Discount from 15%\t"+frmVatPrice+" baht.");
		double netPrice = totalPrice - discountPrice;
		String frmNetPrice = String.format("%,.2f", netPrice);
		System.out.println("Amount to be paid\t"+frmNetPrice+" baht.");

	}

}
