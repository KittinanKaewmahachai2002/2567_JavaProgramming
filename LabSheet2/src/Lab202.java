import java.util.*;

public class Lab202 {

	public static void main(String[] args) {
		int number;
		int previus_num = 0;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Input number : ");
			number = input.nextInt();
			previus_num = number;
			if(number > previus_num) {
				break;
			}
		}
		System.out.println();
		System.out.println("BYE BYE");
	}

}
