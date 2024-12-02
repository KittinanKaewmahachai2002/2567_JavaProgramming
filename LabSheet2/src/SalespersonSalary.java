import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		// Declare constants
		 final double BASE_SALARY = 1000.0;
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1; // Terminating value for input
		 
		 // Declare variables
		 int sales; // Input gross sales
		 double salary; // Salary to be computed
		 
		 Scanner input = new Scanner(System.in);
		 
		 //loop for in put and competition
		 while(true) {
			 System.out.print("Enter gross sales for the saleperson(or -1 to end) : ");
			 sales = input.nextInt();
			 if(sales == SENTINEL) {
				 break;
			 }
			 
			 //Compute salary
			 salary = BASE_SALARY + (sales*COMMISSION_RATE);
			 
			 //display the salary
			 System.out.printf("The saleperson salary is $%,.2f",salary);
			 System.out.println();
		 }
		 System.out.println("bye.");
		 System.out.println("All saleperson'n salaries have been competed.");

	}

}
