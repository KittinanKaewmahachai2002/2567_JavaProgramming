package week4;

import javax.swing.JOptionPane;

public class Lab402 {

	public static void main(String[] args) {
		int year = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		while(true) {
			boolean checkYear = checkYear(year);
			if(checkYear) {
				break;
			}
			year = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
		}
		boolean checkLeapYear = isLeapYear(year);
		if(checkLeapYear) {
			JOptionPane.showMessageDialog(null, year+" is Leap year.");
		}
		else {
			JOptionPane.showMessageDialog(null, year+" is NOT Leap year.");
		}//end if
	}
	
	public static boolean isLeapYear(int year) {
		/*if(year%4 == 0 && year%100 !=0) {
			return true;
		}else if(year%100==0 && year%400==0) {
			return true;
		}else
			return false;*/
		return (year%4 == 0 && year%100 !=0) || (year%100==0 && year%400==0);
	}
	
	public static boolean checkYear(int year) {
		return year>=1000 && year<=3000;
	}

}
