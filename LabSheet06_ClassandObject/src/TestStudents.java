
public class TestStudents {

	public static void main(String[] args) {
		//create two student object
		Student std1 = new Student();
		Student std2 = new Student();
		
		//set student details
		std1.setStudentDetails("intouch",new double[] {85.0,67.0,78.5});
		std2.setStudentDetails("Sukonlawat",new double[] {90.0,59.8});
		
		line('=');
		System.out.println("Student#1 Details:");
		std1.displayStudentDetails();
		line('*');
		System.out.println("\nStudent#2 Details:");
		std1.displayStudentDetails();
		line('=');
	}//end of main method
	
	public static void line(char ch) {
		//System.out.println("********************");
		for(int i=1;i<40;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
