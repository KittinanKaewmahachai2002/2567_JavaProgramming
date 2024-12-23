import java.util.*;
public class Lab504 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float sum=0;
		float stuScore[] = new float[5];
		
		for(int i=0;i<5;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			float score = input.nextFloat();
			stuScore[i] = score;
			sum += score;
		}
		System.out.println();
		
		float average = sum/5;
		System.out.printf("> Average of 5 student is %.2f%n",average);
		int i=1;
		for(float _stuScore:stuScore) {
			if(_stuScore>average) {
				System.out.printf("> Student "+i+ " (%.2f)%n",_stuScore);
			}
			i++;
		}
		
		input.close();
		
	}

}
