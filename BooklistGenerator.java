package bookhomework;
import java.io.*;
import java.util.*;

public class BooklistGenerator {

	public static void main(String[] args) throws IOException {
		// TODO Parse file for relevant information
		/*String type;
		String title;
		String author;
		String isbn;
		double initcost;
		String courseinfo;*/
		int MAXBOOKS = 100;
		Book[] booklist = new Book[MAXBOOKS];
		int bookcount = 0;
		
		int MAXCOURSES = 10;
		String[] courselist = new String[MAXCOURSES];
		int coursecount = 0;
		int inputrunning = 1;
		String major;
		double sum = 0;
		
		Scanner fromfile = new Scanner(new File("books.txt"));
		
		
		//File read section
		while (fromfile.hasNext())
		{
			String type;
			String title;
			String author;
			String isbn;
			double initcost;
			String courseinfo;
			
			type = fromfile.nextLine();
			title = fromfile.nextLine();
			author = fromfile.nextLine();
			isbn = fromfile.nextLine();
			initcost = fromfile.nextDouble();
			courseinfo = fromfile.nextLine();				//Use two lines because nextdouble doesnt change current line
			courseinfo = fromfile.nextLine();
			
			if (type.equals("Textbook")){
				booklist[bookcount] = new Textbook(title, author, isbn, initcost, courseinfo);
			}
			else{
				booklist[bookcount] = new Tradebook(title, author, isbn, initcost, courseinfo);
			}
			bookcount++;
		}
		fromfile.close();
		Scanner inscan = new Scanner(System.in);
		System.out.printf("Enter your major: ");
		major = inscan.next();
		
		
		
		//Input section
		while(inputrunning == 1){
			String tempscan;
			System.out.printf("Please enter the course name(type xxx to quit): ");
			tempscan = inscan.next();
			if(tempscan.equals("xxx")){
				inputrunning = 2;
			}
			else{
				courselist[coursecount] = tempscan;
				coursecount++;
			}
		}
		inscan.close();
		
		
		//Output and Calculation section
		for(int i = 0; i<bookcount; i++){					//Checks all books
			for(int a = 0; a < coursecount ;a++){			//Checks all inputed classes
				String newcourse = courselist[a];
				Book newbook = booklist[i];
				if(newcourse.equals(newbook.getInfo())){
					System.out.print("Print all relevant information here\n"+newbook.getRetailPrice());
					sum += newbook.getRetailPrice();
				}
			}
			
		}
		System.out.println(sum);
		
		for (int i = 0; i < bookcount; i++) { 					// Checks all books
			Book newbook = booklist[i];
			if (major.equals(newbook.getInfo())) {
				System.out.print("\nPrint all relevant information here "+ newbook.getRetailPrice());
			}
		}
			
		// TODO Make an class that accepts the  parameters
		// TODO Make array of objects
		// TODO Accept input from a user
		// TODO Sort and print information
		
		
		
	}

}
