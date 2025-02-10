
import java.util.*;
public class CheckStockProduct {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		int productList = scan.nextInt();
		scan.nextLine();
		System.out.println();
		Product[] products = new Product[productList];
		
		for(int i=0;i<productList;i++) {
			products[i] = new Product();
			System.out.print("Input Product Id   :");
			products[i].setId(scan.nextLine());
			System.out.print("Input product Unit :");
			products[i].setUnit(scan.nextInt());
			scan.nextLine();
			System.out.println();
		}
		
		Line();
		System.out.println("List of product in 'LOW' status.");
		Line();
		for(Product product : products) {
			if(product.getUnit()<5) {
				System.out.println(">> "+product.getId()+" has "+product.getUnit()+" units");
			}
		}
		
		Line();
		System.out.println("List of product in 'NORMAL' status.");
		Line();
		for(Product product : products) {
			if(product.getUnit()>=5&&product.getUnit()<50) {
				System.out.println(">> "+product.getId()+" has "+product.getUnit()+" units");
			}
		}
		Line();
		System.out.println("List of product in 'HIGH' status.");
		Line();
		for(Product product : products) {
			if(product.getUnit()>=50) {
				System.out.println(">> "+product.getId()+" has "+product.getUnit()+" units");
			}
		}
		
		
		
		scan.close();
	}
	
	public static void Line() {
		for(int i=1;i<50;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
