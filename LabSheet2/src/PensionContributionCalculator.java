package College;

import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
    	 // Declare constants
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_BELOW = 0.20;
        final double EMPLOYER_RATE_55_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_60 = 0.13;
        final double EMPLOYER_RATE_55_60 = 0.13;
        final double EMPLOYEE_RATE_60_65 = 0.075;
        final double EMPLOYER_RATE_60_65 = 0.09;
        final double EMPLOYEE_RATE_ABOVE_65 = 0.05;
        final double EMPLOYER_RATE_ABOVE_65 = 0.075;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly salary: $");
        // Declare variables
        int salary, age;     // to be input 
        int contributableSalary; 
        salary = scanner.nextInt();
        System.out.print("Enter the age: ");
        age = scanner.nextInt();
        if(salary < SALARY_CEILING) {
        	contributableSalary = salary; 
        	} 
        else { 
        	contributableSalary = SALARY_CEILING;
        	}
        double employeeContribution;
        double employerContribution;

        if (age <= 55) {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_BELOW;
            employerContribution = contributableSalary * EMPLOYER_RATE_55_BELOW;
        } else if (age <= 60) {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_60;
            employerContribution = contributableSalary * EMPLOYER_RATE_55_60;
        } else if (age <= 65) {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_60_65;
            employerContribution = contributableSalary * EMPLOYER_RATE_60_65;
        } else {
            employeeContribution = contributableSalary * EMPLOYEE_RATE_ABOVE_65;
            employerContribution = contributableSalary * EMPLOYER_RATE_ABOVE_65;
        }

        double totalContribution = employeeContribution + employerContribution;

        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);
        
        scanner.close();
    }
}

