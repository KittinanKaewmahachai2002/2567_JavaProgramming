package week3;
import java.util.*;
public class Lab305 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = input.nextLine();
		String word = "";
		while(true) {
			if(sentence.endsWith(".")) {
				break;
			}
			System.out.print("The sentence must end with full stop point : ");
			sentence = input.nextLine();
		}
		System.out.println();
		for(int i=0;i<sentence.length();i++) {
			char ch = sentence.charAt(i);
			if(ch == ' ' || ch == '.') {
				if(ch == '.') {
					word=word+".";
				}
				System.out.println(word);
				word = "";
			}
			else {
				word = word+ch;
			}
		}
		
		input.close();

	}

}
