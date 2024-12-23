package week3;
import java.util.*;
public class Lab306 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Message : ");
		String message = kb.nextLine();
		String lowerCheck = message.toLowerCase(); 
		if(lowerCheck.indexOf("nichi") >= 0) {
			System.out.println("Nichi is a sentence");
		}
		else {
			System.out.println(message);
		}
		
		kb.close();

	}

}
