import javax.swing.*;
import java.text.*;
public class Lab203 {

	public static void main(String[] args) {
		double bmi;
		DecimalFormat frm = new DecimalFormat("#,###.0");
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight"));
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Input Height(CM.)"));
		bmi = weight/((height/100)*(height/100));
		JOptionPane.showMessageDialog(null,"BMI = "+frm.format(bmi)+
								"\nYou're Over weight","BMI",JOptionPane.WARNING_MESSAGE);

	}

}
