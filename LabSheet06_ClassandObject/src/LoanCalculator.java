
public class LoanCalculator {
	private String productName;
	private double price;
	private double interestRate;
	private int years;
	
	public void setLoanDetails(String prdName, double prdPrice, double rate, int year){
		productName = prdName;
		price = prdPrice;
		interestRate = rate;
		years = year;
	}
	
	public double calculateMonthlyPayment() {
		return (price*((interestRate/100)/12)*Math.pow((1+(interestRate/100)/12), years*12)) 
				/ (Math.pow((1+(interestRate/100)/12), years*12)-1);
	}
	
	public void displayLoanDetails() {
		System.out.println("Product: "+productName);
		System.out.println("Price: "+price);
		System.out.println("Interest Rate: "+interestRate+"%");
		System.out.println("Loan Period: "+years+" years");
		System.out.printf("Monthly Payment: %.2f",calculateMonthlyPayment());
	}

}
