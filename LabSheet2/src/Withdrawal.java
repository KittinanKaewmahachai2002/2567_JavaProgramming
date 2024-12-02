import javax.swing.*;
import java.util.*;
//import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int moneyWithdraw = Integer.parseInt(JOptionPane.showInputDialog
				("Your balance : "+balance+"\nInpot Money to withdraw:"));
		if(moneyWithdraw > moneyWithdraw) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than balance",
					"Error",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithdraw > 50000){
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw more than 50000",
					"Error",JOptionPane.ERROR_MESSAGE);
		}
		else if(moneyWithdraw%100 != 0) {
			JOptionPane.showMessageDialog(null,"Error : Cannot withdraw "
					+moneyWithdraw%100+" baht.","Error",JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,
					"Your withdraw "+moneyWithdraw+" baht."+
					"\n1,000 = "+moneyWithdraw/1000+
					"\n500 = "+(moneyWithdraw%1000)/500+
					"\n100 = "+(moneyWithdraw%500)/100);
		}
	}

}
