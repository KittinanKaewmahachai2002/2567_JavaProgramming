import javax.swing.*;
public class Lab501_1 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean checkDepartmentName = false;
		String departmentName = JOptionPane.showInputDialog("Enter a department name");
		for(int i=0;i<deptName.length;i++) {
			if(deptName[i].equalsIgnoreCase(departmentName)) {
				checkDepartmentName = true;
			}
		}//check in deptName array
		
		if(checkDepartmentName) {
			JOptionPane.showMessageDialog(null, departmentName+" was found in the list");
		}else {
			JOptionPane.showMessageDialog(null, departmentName+" was not found in the list");
		}
	}

}
