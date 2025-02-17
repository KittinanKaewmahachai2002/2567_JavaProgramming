import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Book Title: ");
		String bookTitle = input.nextLine();
		System.out.print("Book publish year: ");
		int publishYear = input.nextInt();
		input.nextLine();
		System.out.print("Author name: ");
		String authorName = input.nextLine();
		System.out.print("Author email: ");
		String authorEmail = input.nextLine();
		
		FictionBook book1 = new FictionBook(bookTitle,publishYear);
		book1.setAuthorName(authorName);
		book1.setEmail(authorEmail);
		while(!book1.checkEmail()) {
			System.out.print("Author email, again: ");
			authorEmail = input.nextLine();
			book1.setEmail(authorEmail);
		}
		
		Line();
		System.out.println(book1);
		
		input.close();
	}
	
	public static void Line() {
		for(int i=1;i<60;i++) {
			System.out.print("=");
		}
		System.out.println();
	}

}
