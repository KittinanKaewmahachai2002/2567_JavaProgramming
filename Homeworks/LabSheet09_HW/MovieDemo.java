import java.util.*;
public class MovieDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input movie id   : ");
		String mId = scan.nextLine();
		System.out.print("Input movie name : ");
		String mName = scan.nextLine();
		
		System.out.println();
		System.out.print("Input director name   : ");
		String dName = scan.nextLine();
		System.out.print("Input director e-mail : ");
		String dEmail = scan.nextLine();
		System.out.print("Input director gender : ");
		char dGender = scan.next().charAt(0);
		while(true) {
			if(dGender=='m'||dGender=='M'||dGender=='f'||dGender=='F') {
				break;
			}
			System.out.print("Input director gender, again : ");
			dGender = scan.next().charAt(0);
		}
		
		System.out.println();
		System.out.print("Input movie theater no. : ");
		int tNum = scan.nextInt();
		while(true) {
			if(tNum>=1&&tNum<=15) {
				break;
			}
			System.out.print("Please input 1 - 15 only : ");
			tNum = scan.nextInt();
		}
		
		System.out.println();
		Director di1 = new Director(dName, dEmail, dGender);
		Movie m1 = new Movie(mId,mName,di1);
		Theater th1 = new Theater(mId,mName,di1,tNum);
		System.out.println(th1.getTheaterName()+": "+m1);
		
		
		
		scan.close();
		
		
	}
}
