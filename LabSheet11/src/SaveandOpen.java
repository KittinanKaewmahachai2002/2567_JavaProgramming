import java.io.*;
import java.util.*;


public class SaveandOpen extends Employee{
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		Scanner console = new Scanner(System.in);
		PrintStream writeFile = new PrintStream(new File("src//txtFile//employee.txt"));
		
		String answer;
		do {
			super.header();
			System.out.print("Enter name      : ");
			name = console.next();
			System.out.print("Enter department : ");
			dept = console.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter data again? : ");
			answer = console.next();
		}while(answer.equalsIgnoreCase("y"));
		
		console.close();
	}//end of insert
	
	public void searchData() {
		try {
			Scanner readFile = new Scanner(new File("src//txtFile//Employee.txt"));
			int i = 0;//นับจำนวนพนักงานในไฟล์
			boolean check = false;
			super.header();
			//ใช้คำสั่ง while() อ่านข้อมูลจากไฟล์
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next(); //ตัวแปร dept ในไฟล์
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i+") "+name);
					check = true;
				}
			}
			
			if(check) {
				super.header();
				System.out.println("Employee in dept "+super.getDept()
					+" is "+i+" person.");
			}else {
				System.out.print("Sorry, no dept : "+super.getDept()+" in file.");
			}
			
		}catch(IOException e) {
			System.out.print("\nSorry, file not found...");
		}
	}

}
