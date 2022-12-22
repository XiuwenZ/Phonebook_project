import java.io.*;
import java.util.*;
public class PhonebookApp{
public static void main(String[]args)throws IOException{

	try {
			ArrayList<PhonebookEntry> phonebook = new ArrayList<PhonebookEntry>();
			File file = new File("phonebook.text");
			Scanner scanner = new Scanner(file);
			Phonebook pb;
			
			while(scanner.hasNext()){
				//CHANGE TO STORE INTO MAP
				//lines into a whole Array(containing all the names and phonebooks)
				PhonebookEntry one_person = PhonebookEntry.read(scanner);
				//all info are stored into the phonebook object
				phonebook.add(one_person);

			}
			//stores all the information into a phonebook that is a Map for each person(Name and phonenumbers)
			pb = new Phonebook(phonebook);
			Scanner keyboard = new Scanner(System.in);
			
			String ln, fn, pn;

			if(!(keyboard.hasNext())){
					throw new FileNotFoundException("*** IOException *** "+file.toString()+" (No such file or directory)");	
			}
			System.out.print("lookup, quit (l/q)? ");
			String input = keyboard.next();
			while(input.charAt(0) !='q'){
				if (input.charAt(0) == 'l'){
					System.out.print("last name? ");
					ln = keyboard.next();
					System.out.print("first name? ");
					fn = keyboard.next();
					Name name = new Name(ln, fn);
				
					Name valid_name = pb.lookup(phonebook, name);
					
//					System.out.print(Phonebook.toString(pb,input, name));
				}
				input = keyboard.next();
			
			System.out.println();
			System.out.print("lookup, quit (l/q)? ");	
			
			}	
		}catch(FileNotFoundException Fe){
		System.out.println(Fe.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}

}
	
}
