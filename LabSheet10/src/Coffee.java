
public class Coffee extends Drink{
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	Coffee(int type,char sizeCoffee,int typeCoffee,Barista barista){
		super(type,' ');
		this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista = barista;
	}
	Coffee(int type,int typeCoffee){
		super(type,' ');
		this.typeCoffee=typeCoffee;	
	}
	public Barista getBarista() {
		return this.barista;
	}
	public String getTypeName() {
		if(typeCoffee==1) {
			return "Americano";
		}else if(typeCoffee==2) {
			return "Espresso";
		}else if(typeCoffee==3) {
			return "Cappuccino";
		}else
			return null;
	}
	public int getTypePrice() {
		if(typeCoffee==1) {
			return 50;
		}else if(typeCoffee==2) {
			return 55;
		}else if(typeCoffee==3) {
			return 65;
		}else
			return 0;
	}
	public String getSizeName() {
		if(this.sizeCoffee=='s'||this.sizeCoffee=='S') {
			return "Short";
		}else if(this.sizeCoffee=='t'||this.sizeCoffee=='T') {
			return "Tall";
		}else if(this.sizeCoffee=='g'||this.sizeCoffee=='G') {
			return "Grande";
		}else if(this.sizeCoffee=='v'||this.sizeCoffee=='V') {
			return "Venti";
		}else {
			return null;
		}
	}
	public int getSizePrice() {
		if(this.sizeCoffee=='s'||this.sizeCoffee=='S') {
			return 100;
		}else if(this.sizeCoffee=='t'||this.sizeCoffee=='T') {
			return 150;
		}else if(this.sizeCoffee=='g'||this.sizeCoffee=='G') {
			return 200;
		}else if(this.sizeCoffee=='v'||this.sizeCoffee=='V') {
			return 250;
		}else {
			return 0;
		}
	}
	public int getTotalPrice() {
		return super.getTotalPrice()+getTypePrice()+getSizePrice();
	}
	public String toString() {
		return super.getTypeName()+" "+getTypeName()+"("+getSizeName()+") is "+getTotalPrice()+" baht.";
	}
	
}
