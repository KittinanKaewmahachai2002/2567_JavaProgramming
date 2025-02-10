import java.util.*;
public class MovieDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input movie id   : ");
		String mId = scan.nextLine();
		System.out.print("Input movie name : ");
		String mName = scan.nextLine();
		
		System.out.println();
		System.out.print("Input director name   : ");
		String dName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String dEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		String dGender = scan.nextLine();
		while(true) {
			if(dGender.equalsIgnoreCase("m")||dGender.equalsIgnoreCase("f")) {
				break;
			}
			System.out.print("Input director gender, again : ");
			dGender = scan.nextLine();
		}
		
		scan.close();
		
		

	}

}
