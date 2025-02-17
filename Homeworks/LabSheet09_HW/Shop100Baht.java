import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		PattanakarnBranch sold = new PattanakarnBranch();
		
		int checkPromotion = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn Branch?");
		if(checkPromotion == 1) {
			int numOfUnit  = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:"));
			sold.setUnit(numOfUnit);
			JOptionPane.showMessageDialog(null, sold);
		}else {
			int numOfUnit  = Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:"));
			sold.setUnit(numOfUnit);
			JOptionPane.showMessageDialog(null, sold);
		}

	}

}
