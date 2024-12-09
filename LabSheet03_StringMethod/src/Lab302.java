import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail").toLowerCase();
		
		while(inputEmail.startsWith("@") || inputEmail.contains(" ")) {
			//contain 'ประกอบด้วย'เครื่องหมาย "spacebar"
			inputEmail = JOptionPane.showInputDialog("Input your e-mail");
		};
		
		if(inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
			while(true) {
				inputEmail = JOptionPane.showInputDialog("Input your e-mail");
				if(inputEmail.endsWith("@gmail.com") || inputEmail.endsWith("@hotmail.com")) {
					JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
					break; //เพิ่มเติมวนรับใหม่ในกรณี e-mail ไม่ถูกต้อง
				}
			}//end while(true)
		}

	}

}
