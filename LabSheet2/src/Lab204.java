package College;

import java.util.*;
public class Lab204 {

	public static void main(String[] args) {
		int numX = 0;
		int sum = 0;
		int currentValue = 0;
		int numberX = 0;
		int numberY = Integer.MAX_VALUE;
		Scanner input = new Scanner(System.in);
		System.out.print("Input value of X : ");
		numberX = input.nextInt();
		System.out.print("Input value of Y : ");
		numberY = input.nextInt();
		while(true) {
			if(numberX > numberY) {
					System.out.print("Input value of Y, again : ");
					numberY = input.nextInt();
			}
			else {
				break;
			}
		System.out.println();
		
		currentValue = numberX; 
		numX = numberX + 1;
		}
		while(true) {
			if(numX > numberY) {
				break;
			}
			else {
				sum = currentValue + numX;
				System.out.println(currentValue + " + " + numX + " = " + sum);
				currentValue = sum;
				numX++;
			}	

		}
		
		input.close();
	}

}
