import java.io.*;
import java.util.*;
public class ATMChecking extends ATMData {
	private int money;
	
	ATMChecking(String accountNumber,String password,int money){
		super(accountNumber,password);
		this.money = money;
	}
	
	public boolean checkBookBank() throws IOException{
		try {
			Scanner checkFile = new Scanner(new File("src//txtFile//Employee.txt"));
			while(checkFile.hasNext()) {
				String accNum = checkFile.next();
				String accPass = checkFile.next();
				int accMoney = checkFile.nextInt();
				
				if(accNum.equalsIgnoreCase(super.getID())&&accPass.equalsIgnoreCase(super.getPass())&&accMoney == this.money ){
					return true;
				}else {
					return false;
				}
			}
		}catch(IOException e) {
			System.out.println("Sorry, your id or password is wrong, or your amount not enough.");
			return false;
		}
	}
	public void show() {
		
	}
}
