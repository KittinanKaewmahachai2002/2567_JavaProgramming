import java.util.*;

public class TestEmployeesInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.println("Enter detail for Employee i:");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();	
		System.out.print("Hour Worked: ");
		int empHoursWorked1 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHoursWorked1, empHourlyRate1);
		
		System.out.println("Employee 1 Details:");
		emp1.displayEmployeeDetails();
		
		scan.nextLine();//Consume leftover newline
		
		System.out.println("Enter detail for Employee i:");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();	
		System.out.print("Hour Worked: ");
		int empHoursWorked2 = scan.nextInt();
		System.out.print("Hourly Rate: ");
		double empHourlyRate2 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName2, empHoursWorked2, empHourlyRate2);
		
		System.out.println("\nEmployee 2 Details:");
		emp2.displayEmployeeDetails();
		
		scan.close();
	}
	
}
