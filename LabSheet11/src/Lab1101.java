import java.util.*;
import java.io.*;
public class Lab1101 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
		System.out.print("Input Section: ");
		int section = scan.nextInt();
		
		printHeader(section);
		displayStudentList(section);
	}//end main
	
	public static void printHeader(int sec) {
		System.out.println("*************************************************");
		System.out.println("\tList of Data for Setion "+sec);
		System.out.println("*************************************************");
		
	}//end printHeader
	
	public static void displayStudentList(int sec) throws IOException {
		try(BufferedReader readFile = new BufferedReader(new FileReader("src//txtFile//List107.txt"))){
			String temp="";
			while((temp = readFile.readLine()) != null) {
				String[] data = temp.split("\t");
				if(data.length<6) continue;
				int studentSection = Integer.parseInt(data[3]);
				if(studentSection == sec) {
					double midterm = Double.parseDouble(data[4]);
					double finalExam = Double.parseDouble(data[5]);
					double totalScore = midterm + finalExam;
					System.out.printf("%s %s \t%.2f \t%s %n", data[0], data[2] ,totalScore
							,determineResult(totalScore));
				}//end if
			}//end while
		}//end try
	}//end displayStudentList
	
	public static String determineResult(double totalScore) {
		return totalScore<=40?"Fail":"Pass";
	}
	
	
	
}//end class
