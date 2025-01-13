import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int countOddNum = 0;
		String allNum = "";
		int number[] = new int[7];
		
		for(int i=0;i<number.length;i++) {
			System.out.print("Input number "+(i+1)+" : ");
			int num = input.nextInt();
			number[i] = num;
		}
		System.out.println();
		
		for(int _number:number) {
			if(_number%2!=0) {
				countOddNum+=1;
				allNum += _number+" ";
			}
		}
		System.out.println("There are "+countOddNum+" of odd number.");
		System.out.println("List of odd number : "+allNum);
		
		input.close();

	}

}
