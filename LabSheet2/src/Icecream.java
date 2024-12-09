package College;

import javax.swing.*;
public class Icecream {
	
	public static void main(String[] args) {
		final int VANILLA = 10;
		final int CHOCOLATE = 15;
		final int TOPPING = 5;
		int flavor=0;
		while(flavor != 1 && flavor != 2){
			flavor = Integer.parseInt(JOptionPane.showInputDialog(null,"[1] Vanilla Flavor 10 B."+
					"\n[2] Chocolate Flavor 15 B."+
					"\nPress number to choose flavor:"));
			JOptionPane.showMessageDialog(null,(flavor == 1 || flavor == 2)? 
				    		(JOptionPane.showConfirmDialog(null,"Do you want to add topping?",
				    				"Topping",JOptionPane.YES_NO_OPTION) == 0? 
				    						"You Choose "+(flavor == 1?"Vanila":"Chocolate")+ " Flavor"+"\nAnd with topping"+
				    						"\nTotal Price = "+(flavor == 1?VANILLA+TOPPING:CHOCOLATE+TOPPING)+" baht."
				    						: "You Choose "+(flavor == 1?"Vanila":"Chocolate")+ " Flavor"+"\nAnd no topping"+
						    				  "\nTotal Price = "+(flavor == 1?VANILLA:CHOCOLATE)+" baht.")
				    		
				        : "ERROR: Wrong choice!"+"\nTry again...",				    
				        (flavor == 1 || flavor == 2) ? "MESSAGE" : "ERROR",
				        (flavor == 1 || flavor == 2) ? JOptionPane.INFORMATION_MESSAGE : JOptionPane.ERROR_MESSAGE);
		}; 
		
	}
}