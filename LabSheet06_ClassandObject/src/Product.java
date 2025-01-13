
public class Product {
	private String name;
	private double price;
	private double vatRate;
	
	public void setProductDetails(String prdName, double prdPrice,double vat) {
		name = prdName;
		price = prdPrice;
		vatRate = vat;
	}
	
	public double calculateTotalPrice() {
		return price+(price*vatRate/100);
	}
	
	public void displayProductDetails() {
		System.out.println("Product Name: "+name);
		System.out.println("Price (Before VAT): "+price);
		System.out.println("Price (After VAT): "+calculateTotalPrice());
	}
}
