import java.util.*;
public class Lab505 {

	public static void main(String[] args) {
		int number[] = {78,36,58,41,25,92,75};
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input index of array : ");
		int index = input.nextInt();
		while(true) {
			if(index>=0 && index<number.length) {
				break;
			}
			System.out.print("Input index of array, again : ");
			index = input.nextInt();
		}
		
		System.out.println();
		System.out.println("Value in current index is "+number[index]);
		System.out.println((index+1)<number.length?"Value in next\t index is "+number[index+1]
				:"Sorry, "+index+" is the last index in array.");
		
		input.close();
			
	}
}
