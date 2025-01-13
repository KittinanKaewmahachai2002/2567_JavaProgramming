
public class TestProduct {

	public static void main(String[] args) {
		Product prd1 = new Product();
		
		prd1.setProductDetails("Smartphone", 30000.0, 7.0);
		
		System.out.println("Product Details:");
		prd1.displayProductDetails();
	}

}
