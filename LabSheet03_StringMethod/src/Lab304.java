package week3;
import java.util.*;
public class Lab304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName;
		String lastName;
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		if(fullName.contains(" ")) {
			firstName = fullName.substring(0,fullName.indexOf(" "));
			lastName = fullName.substring(fullName.indexOf(" "),fullName.length());
			System.out.println("First Name: "+firstName.toUpperCase());
			System.out.println("Last Name: "+lastName.toLowerCase());
		}
		else {
			System.out.println("Incorrect Name");
		}
		scan.close();
	}
}
