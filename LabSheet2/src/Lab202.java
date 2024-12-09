package College;

import java.util.*;
public class Lab202 {
	
	public static void main(String[] args) {
		int number;
		int previus_num = Integer.MIN_VALUE;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Input number : ");
			number = input.nextInt();
			if(number < previus_num) {
				break;
			}
			previus_num = number;
		}
		System.out.println();
		System.out.println("BYE BYE");
		
		input.close();
	}
}
