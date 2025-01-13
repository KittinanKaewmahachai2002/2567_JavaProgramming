import javax.swing.*;
public class Lab506 {

	public static void main(String[] args) {
		String collectWords="";
		String words[] = {"Good Morning","Good Afternoon","Good Evening","Good Night"};
		
		for(String _words:words) {
			collectWords +=("- "+ _words + "\n");
		}
		JOptionPane.showMessageDialog(null, "The greeting words in English\n"+collectWords);
	}

}
