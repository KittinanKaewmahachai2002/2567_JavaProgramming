import java.util.*;
public class productList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] products = new Product[4];
		for(int i=0;i<4;i++) {
			products[i] = new Product();
			System.out.print("Input product Id    : ");
			products[i].setId(scan.nextLine());
			System.out.print("Input product Unit  : ");
			products[i].setUnit(scan.nextInt());
			scan.nextLine();
			System.out.print("Input product Price : ");
			products[i].setPrice(scan.nextDouble());
			scan.nextLine();
			System.out.println();
		}
		
		Line();
		double total = 0.0;
		for(Product product : products) {
			System.out.printf("Product ID : %s, Total price = %,.2f baht.%n"
					,product.getId(),product.calculate());
			total += product.calculate();
		}
		Line();
		System.out.printf("Total price of all products is %,.2f baht.",total);
		
		scan.close();
	}
	
	public static void Line() {
		for(int i=1;i<50;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
