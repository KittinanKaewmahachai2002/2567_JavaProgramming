import java.util.*;
public class CoffeeShopDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Barista staff1 = new Barista("Leon",'M');
		Barista staff2 = new Barista("Claire",'F');

		System.out.print("Drink type: ");
		int drinkType = scan.nextInt();
		System.out.print("Coffee type: ");
		int coffeeType = scan.nextInt();
		System.out.print("Coffee size: ");
		char coffeeSize = scan.next().charAt(0);
		System.out.print("Barista number: ");
		int baristaNum = scan.nextInt();
		System.out.println();
		Coffee order;
		if(baristaNum==2) {
			order = new Coffee(drinkType,coffeeSize,coffeeType,staff2);
			System.out.println(order);
			System.out.println("Barista: "+staff2.getName()+" ("+staff2.getGenderName()+")");
		}else {
			order = new Coffee(drinkType,coffeeSize,coffeeType,staff1);
			System.out.println(order);
			System.out.println("Barista: "+staff1.getName()+" ("+staff1.getGenderName()+")");
		}
		
		scan.close();
	}
}