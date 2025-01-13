import java.util.*;
public class TestProductInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Product prd1 = new Product();
		
		System.out.print("Enter product name: ");
		String prdName = input.nextLine();
		System.out.print("Enter product price: ");
		double prdPrice = input.nextDouble();
		System.out.print("Enter VAT rate (%): ");
		double prdVat = input.nextDouble();
		
		prd1.setProductDetails(prdName, prdPrice, prdVat);
		
		System.out.println("\nProduct Details:");
		prd1.displayProductDetails();
		
		
		input.close();
	}

}
