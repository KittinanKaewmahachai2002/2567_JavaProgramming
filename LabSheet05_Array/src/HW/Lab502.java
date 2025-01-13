import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number[] = new int[5];
		
		for(int i=0;i<number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			int num = input.nextInt();
			number[i]=num;
		}
		int sum = sumOfPos(number);
		System.out.println();
		System.out.println("Summation of positive number is "+sum);
		
		
		input.close();

	}
	
	public static int sumOfPos(int nums[]) {
		int sumPositive=0;
		for(int _nums:nums) {
			if(_nums>0) {
				sumPositive+=_nums;
			}
		}
		return sumPositive;
	}

}
