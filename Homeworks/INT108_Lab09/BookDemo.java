import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input author name   : ");
		String name = input.nextLine();
		System.out.print("Input author e-mail : ");
		String email = input.nextLine();
		System.out.println();
		System.out.print("Input book title : ");
		String title = input.nextLine();
		System.out.print("Input book page  : ");
		int page = input.nextInt();
		System.out.println();
		
		Author author1 = new Author(name, email);
        Book book1 = new Book(title, author1, page);
		
        System.out.println(book1);
		
		input.close();
	}

}
