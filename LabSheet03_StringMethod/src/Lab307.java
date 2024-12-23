package week3;
import java.util.*;
public class Lab307 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String palindromeWord = "";
		String fullWord = "";
		System.out.print("Text: ");
		String text = kb.nextLine();
		for(int i=0;i<text.length();i++) {
			char ch = text.charAt(i);
			if(ch == ' ') {
				continue;
			}
			else {
				fullWord = fullWord+ch;
			}
		}
		fullWord = fullWord.toLowerCase();
		for(int i=fullWord.length()-1;i>=0;i--) {
			char ch = fullWord.charAt(i);
			palindromeWord = palindromeWord+ch;
		}
		
		if(fullWord.equals(palindromeWord)) {
			System.out.println("It is palindrome");
		}
		else {
			System.out.println("It is not palindrome");
		}
		
		kb.close();

	}

}
