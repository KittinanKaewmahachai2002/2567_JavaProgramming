import java.util.*;
public class Lab304 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName;
		String lastName;
		System.out.print("Full Name: ");
		String fullName = scan.nextLine();
		for(int i=0;i<fullName.length();i++) {
			char spaceName = fullName.charAt(i);
				if(spaceName == ' ') {
					firstName = fullName.substring(0,i);
					lastName = fullName.substring(i,(fullName.length()-1));
					System.out.println("First Name: "+firstName);
					System.out.println("Last Name: "+lastName);
					break;
				}
				else if{
					
				}
		}//end for loop
		
		scan.close();
	}

}
