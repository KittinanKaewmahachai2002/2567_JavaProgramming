package week4;
import java.util.*;

public class Lab404 {
    public static void main(String[] args) {
        inputStudent();
    }

    public static void inputStudent() {
        Scanner input = new Scanner(System.in);
        boolean isStudentValid, isSubjectValid, checkStudentId, checkSubjectId;
        String studentId;
        String subjectId;
        while (true) {
            System.out.print("Enter Student Id: ");
            studentId = input.nextLine();
            System.out.print("Enter Subject Id: ");
            subjectId = input.nextLine();
            isStudentValid = isLength(studentId, 10);
            isSubjectValid = isLength(subjectId, 7);
            if (isStudentValid && isSubjectValid) {
                System.out.println();
                break;
            }
        }
        checkStudentId = isItStudent(studentId);
        checkSubjectId = isItSubject(subjectId);
        displayData(checkStudentId, checkSubjectId, studentId);

        input.close();
    }

    public static boolean isLength(String id, int length) {
        return id.length() == length;
    }

    public static boolean isItStudent(String studentId) {
        return studentId.charAt(2) == '1' && studentId.substring(3, 6).equals("311");
    }

    public static boolean isItSubject(String subjectId) {
        return subjectId.charAt(4) == '1' && subjectId.substring(0, 2).equals("21");
    }

    public static void displayData(boolean checkStudentId, boolean checkSubjectId, String studentId) {
        if (checkStudentId && checkSubjectId) {
            System.out.println("Student id: " + studentId + " 1st year student in IT");
            System.out.println("Enroll in courses for Year 1");
        } else if (checkStudentId && !checkSubjectId) {
            System.out.println("Student id: " + studentId + " 1st year student in IT");
            System.out.println("Not enroll in courses for Year 1");
        } else if (!checkStudentId && checkSubjectId) {
            System.out.println("Student id: " + studentId + " is not 1st year student in IT");
            System.out.println("Enroll in courses for Year 1");
        } else {
            System.out.println("Student id: " + studentId + " is not 1st year student in IT");
            System.out.println("Not enroll in courses for Year 1");
        }
    }
}
