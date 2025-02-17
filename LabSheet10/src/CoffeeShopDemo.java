import java.util.*;
public class CoffeeShopDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Barista staff1 = new Barista("Leon",'M');
		Barista staff2 = new Barista("Claire",'F');
		
		System.out.print("Drink type: ");
		int drinkType = scan.nextInt();
		scan.nextLine();
		System.out.print("Coffee type: ");
		int coffeeType = scan.nextInt();
		scan.nextLine();
		System.out.print("Coffee size: ");
		char coffeeSize = scan.next().charAt(0);
		System.out.print("Barista number: ");
		int baristaNum = scan.nextInt();
		scan.nextLine();
		if(baristaNum==2) {
			Coffee order = new Coffee(drinkType,coffeeSize,coffeeType,staff2);
		}else {
			Coffee order = new Coffee(drinkType,coffeeSize,coffeeType,staff1);
		}
		
		System.out.println(order);
		scan.close();
	}

}
