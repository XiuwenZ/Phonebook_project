

import java.io.*;
import java.util.*;


public class PhonebookApp{
public static void main(String[]args)throws IOException{

	try {
			// store all info into a Arraylist of PhonebookEntry type
			ArrayList<PhonebookEntry> all_info = new ArrayList<PhonebookEntry>();
			File file = new File("phonebook.txt");
			Scanner scanner = new Scanner(file);

//			System.out.println(all_info);
////[David·Arnow·'s·phone·numbers:·[cell,·(345)678-9012,·work,·(324)564-0987,·fax,·(987)234-9823,·home,·(234)567-8901,·work,·(243)123-6574,·mobile,·(123)456-7890],·Keith·Harrow·'s·phone·numbers:·[cell,·(345)678-9012,·work,·(324)564-0987,·fax,·(987)234-9823,·home,·(234)567-8901,·work,·(243)123-6574,·mobile,·(123)456-7890],·Jackie·Jones·'s·phone·numbers:·[cell,·(345)678-9012,·work,·(324)564-0987,·fax,·(987)234-9823,·home,·(234)567-8901,·work,·(243)123-6574,·mobile,·(123)456-7890]]↵

			
			Scanner keyboard = new Scanner(System.in);

			System.out.print("lookup, quit (l/q)? ");
			String input = keyboard.next();
			while(input.charAt(0) !='q'){
				String ln, fn, pn;
				if (input.charAt(0) == 'l'){
					System.out.print("last name? ");
					ln = keyboard.next();
					System.out.print("first name? ");
					fn = keyboard.next();
					Name name = new Name(ln, fn);
					Phonebook phonebook = new Phonebook(scanner);
//					System.out.println(phonebook.toString());
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
		
		}catch(Exception e){
			System.out.println("all exception" + e.getMessage());
		}

}
	
}
