import java.util.*;
public class Lab404 {

	public static void main(String[] args) {
		inputStudent();

	}
	public static void inputStudent() {
		Scanner input = new Scanner(System.in);
		boolean isStudentValid, isSubjectValid,checkStudentId,checkSubjectId;
		String studentId;
		String subjectId;
		while(true) {
			System.out.print("Enter Student Id: ");
			studentId = input.nextLine();
			System.out.print("Enter Subject Id: ");
			subjectId = input.nextLine();
			isStudentValid = isLength(studentId, 10);
			isSubjectValid = isLength(subjectId, 7);
			if(isStudentValid == true && isSubjectValid == true) {
				System.out.println();
				break;
			}
		}
		checkStudentId = isItStudent(studentId);
		checkSubjectId = isItSubject(subjectId);
		displayData(checkStudentId,checkSubjectId,studentId);
	}			
		
	public static boolean isLength(String id,int length) {
		return id.length() == length? true : false;
	}
	
	public static boolean isItStudent(String studentId) {
		return studentId.charAt(2) == '1' && studentId.substring(3,5) == "311" ? true : false ;
	}
	
	public static boolean isItSubject(String subjectId) {
		return subjectId.charAt(4) == '1' && subjectId.substring(0,1) == "21" ? true : false ;
	}
	
	public static void displayData(boolean checkStudentId,boolean checkSubjectId,String studentId) {
		if(checkStudentId == true && checkSubjectId == true) {
			System.out.println("Student id: "+studentId+" 1st year student in IT");
			System.out.println("Enroll in courses for Year 1");
		}else if(checkStudentId == true && checkSubjectId == false) {
			System.out.println("Student id: "+studentId+" 1st year student in IT");
			System.out.println("not enroll in courses for Year 1");
		}else if(checkStudentId == false && checkSubjectId == true){
			System.out.println("Student id: "+studentId+" is not 1st year student in IT");
			System.out.println("Enroll in courses for Year 1");
		}else if(checkStudentId == false && checkSubjectId == false){
			System.out.println("Student id: "+studentId+" is not 1st year student in IT");
			System.out.println("not enroll in courses for Year 1");
		}
	}//fix condition
}
