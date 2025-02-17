
public class PattanakarnBranch extends Product{
	public int payUnit() {
		return super.getUnit()/2;
	}
	public int freeUnit() {
		return super.getUnit()-payUnit();
	}
	public int getTotalprice() {
		return freeUnit()*100;
	}
	public String toString(){
		return "You buy "+payUnit()+" units, get free "+freeUnit()+" units ("+getTotalprice()+").";
	}
}
