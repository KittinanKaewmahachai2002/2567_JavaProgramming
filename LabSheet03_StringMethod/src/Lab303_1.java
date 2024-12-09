import javax.swing.*;
public class Lab303_1 {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence:");
		int	countSpacebar = 0;
		while(true) {
			if(sentence.endsWith(".")) {
				break;
			}
			else {
				sentence = JOptionPane.showInputDialog("Input a sentence, again:");
			}//end if
		}//end while
		for(int i = 0;i < sentence.length();i++) {
			char word = sentence.charAt(i);
			if(word == ' ') {
				countSpacebar += 1  ;
			}//end if
		}//end for loop
		JOptionPane.showMessageDialog(null, "This sentence has "+countSpacebar+" spacebar."+
										"\nThis sentence has "+(countSpacebar+1)+" word.");
	}

}
