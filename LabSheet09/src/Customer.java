
public class Customer {
	private int cid,discount;
	private String name;
	
	Customer(int cid,String name,int discount){
		this.cid = cid;
		this.name = name;
		this.discount = discount;
	}
	//getter and setter
	public int getCustID() {
		return this.cid;
	}
	public String getCustName() {
		return this.name;
	}
	public int getCustDiscount() {
		return this.discount;
	}
	public void setCustDiscount(int discount) {
		this.discount = discount;
	}
	public String toString() {
		return getCustName()+"("+getCustID()+")("+getCustDiscount()+"%)";
	}
	
	
}
