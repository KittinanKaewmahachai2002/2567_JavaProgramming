import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter your password(type 'exit' to quit)");
			String password = scan.nextLine();
			
			//check if user wants to exit
			if(password.equalsIgnoreCase("exit")) {
				System.out.println("Program terminated");
			}
			
			String error = "";
			if(password.length() < 8) {
				error += "- Password must be at least 8 characters long.\n";
			}
			
			//check for Upper case,Lower case,Digit
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			
			for (int i = 0 ;i < password.length();i++) {
				char ch = password.charAt(i);
				if(ch >= 'A' && ch <= 'Z') {
					hasUpperCase = true;
				}//check upper case
				else if(ch >= 'a' && ch <= 'z') {
					hasLowerCase = true;
				}//check lower case
				else if(ch >= '0' && ch <= '9') {
					hasDigit = true;
				}//check digit
			}//end of for
			
			if(!hasUpperCase) {
				error += "- Password must contain at least on uppercase letter(A-Z).\n";
			}
			if(!hasLowerCase) {
				error += "- Password must contain at least on lowercase letter(a-z).\n";
			}
			if(!hasDigit) {
				error += "- Password must contain at least on digit(0-9).\n";
			}
			
			if(error.isEmpty()) {
				System.out.println("Your password is secure.");
				break;
			}
			else {
				System.out.println("Password Validation error.");
				System.out.println(error);
			}
			scan.close();
		}//end while
		

	}

}
