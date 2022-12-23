import java.io.*;
import java.util.*;

public class PhonebookApp{
public static void main(String[]args)throws IOException{

	try {
			File file = new File("phonebook.txt");
			Scanner scanner = new Scanner(file);
		
			Scanner keyboard = new Scanner(System.in);

			System.out.print("lookup, quit (l/q)? ");
			String input = keyboard.next();
			String ln, fn;
			while(input.charAt(0) !='q'){
				if (input.charAt(0) == 'l'){
					System.out.print("last name? ");
					ln = keyboard.next();
					System.out.print("first name? ");
					fn = keyboard.next();
					Name name = new Name(ln, fn);
					Phonebook phonebook = new Phonebook(scanner);
					System.out.println(phonebook.toString());
					//THE PROGRAM DIDN'T TOUCH THE FOLLOWING LINE
					if(phonebook.lookup(name)) {
//						System.out.println(name + " 's phone numbers: " + phonebook.toString());
					}
					else {
				          System.out.println("-- Name not found");
					}
				}
				input = keyboard.next();
				System.out.println();
				System.out.print("lookup, quit (l/q)? ");	
			
			}	
		scanner.close();
		keyboard.close();
			
		}catch(Exception e){
			System.out.println("all exception" + e.getMessage());
		}

}
	
}
