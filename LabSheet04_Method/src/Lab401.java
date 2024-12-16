import javax.swing.*;
public class Lab401{
	//global varriable ใช้ทุกที่ที่ต้องการ
	static String VarEmail;

	public static void main(String[] args) {
		inputEmail();
	}//end on method
	
	public static void inputEmail() {
		String ans="";
		do {
			VarEmail = JOptionPane.showInputDialog("Input your e-mail:");
			if(VarEmail != null || VarEmail.isEmpty()) {
				checkEmailError(VarEmail);
				break;
			}//ถ้า e-mail ที่รับมาไม่เป็นค่าว่างให้เรียกใช้ Method ตรวจสอบอี e-mail ขึ้นต้นด้วย@หรือspacebarหรือไม่
			else {//ถ้ารับมาแล้วเป็นค่าว่าง
				JOptionPane.showMessageDialog(null, "Email cannot be Empty");
			}
			ans = JOptionPane.showInputDialog("Continue?(y||Y to continue)");
		}while(ans != null && ans.equalsIgnoreCase("y"));

	}
	
	public static void checkEmailError(String email) {
		while(email.startsWith("@")||email.contains(" ")) {
			email=JOptionPane.showInputDialog("Input your e-mail again:");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, checkEmail(email)
				?"Your e-mail is "+email
				:"Your e-mail is not hotmail or gmail address");
	}

	public static boolean checkEmail(String email) {
		/*if(email.endsWith("@gmail.com")||email.endsWith("@hotmail.com")) {
			return true;
		}
		return false;*/
		return email.endsWith("@gmail.com")||email.endsWith("@hotmail.com");
	}

}
