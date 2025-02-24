import java.util.*;
import java.io.*;

public class ATMBookBank {

	public static void main(String[] args) throws IOException{
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter account number : ");
		String accountNum = console.nextLine();
		while(!accountNum.equalsIgnoreCase("0-000-000-00-0")) {
			System.out.print("Input wrong type, Enter account number : ");
			accountNum = console.nextLine();
		}//skip
		String pass;
		while(true) {
			System.out.print("Enter password : ");
			pass = console.nextLine();
			if(pass.length()==4) break;
		}
		int money;
		while(true) {
			System.out.print("Enter money : ");
			money = console.nextInt();
			if(money%100==0) break;
		}
		
		ATMChecking bank = new ATMChecking(accountNum,pass,money);
		bank.show();

	}

}
