import javax.swing.*;
public class JavaExample1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog("Input Product Name:");
		String productUnitStr = JOptionPane.showInputDialog("Input Product Unit:");
		int productUnit = Integer.parseInt(productUnitStr);
		String productPriceStr = JOptionPane.showInputDialog("Input Product per unit:");
		double productPrice = Double.parseDouble(productPriceStr);
		
		double totalPrice = productPrice * productUnit;
		//format output
		String frmTotalPrice = String.format("%,.2f", totalPrice);
		double totalVat = totalPrice + (totalPrice * 7/100);
		String frmTotalVat = String.format("%,.2f", totalVat);
		
		JOptionPane.showMessageDialog(null, "Total Price is "+frmTotalPrice+" baht."
				+ "\nAdd VAT 7% is "+frmTotalVat+" baht.");

	}

}
