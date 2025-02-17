
public class Drink {
	private int type;
	private char size;
	
	Drink(int type,char size){
		this.type = type;
		this.size = size;
	}
	Drink(){
		this.type = 0;
		this.size = ' ';
	}
	public String getTypeName() {
		if(this.type==1) {
			return "Hot";
		}else if(this.type==2) {
			return "Cold";
		}else
			return null;
	}
	public int getTypePrice() {
		if(this.type==1) {
			return 10;
		}else if(this.type==2) {
			return 20;
		}else
			return 0;
	}
	public String getSizeName() {
		if(this.size=='s'||this.size=='S') {
			return "Small";
		}else if(this.size=='m'||this.size=='M') {
			return "Medium";
		}else if(this.size=='l'||this.size=='L') {
			return "Large";
		}else
			return null;
	}
	public int getSizePrice() {
		if(this.size=='s'||this.size=='S') {
			return 15;
		}else if(this.size=='m'||this.size=='M') {
			return 20;
		}else if(this.size=='l'||this.size=='L') {
			return 25;
		}else
			return 0;
	}
	public int getTotalPrice() {
		return getTypePrice()+getSizePrice();
	}
}
