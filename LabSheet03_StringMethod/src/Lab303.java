import java.util.*;
public class Lab303 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int	countSpacebar = 0;
		System.out.print("Input a sentence : ");
		String sentence = kb.nextLine();
		while(true) {
			if(sentence.endsWith(".")) {
				break;
			}
			else {
				System.out.print("Input a sentence, again : ");
				sentence = kb.nextLine();
			}//end if
		}//end while
		
		for(int i = 0;i < sentence.length();i++) {
			char word = sentence.charAt(i);
			if(word == ' ') {
				countSpacebar += 1  ;
			}
		}
		System.out.println();
		System.out.println("This sentence has "+countSpacebar+" spacebar.");
		System.out.println("This sentence has "+(countSpacebar+1)+" word.");
		kb.close();
	}

}
