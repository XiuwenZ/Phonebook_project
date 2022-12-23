import java.util.*;
import java.io.*;

/*
 * a single type array of PhonebookEntry
 * 
 * read the entries with the read method 
 * 		use the read method from the name class
 * 
 * .equals() 
 * 		use the equals method from the name class and from the PhoneNumber
 * 
 * toString to print out the information
 */

/*
 * make 100 the capacity of the Phonebook array
 * 
 * throw an exception if the capacity is exceed
 * 
 * place a try/catch around the entire main and catch both FileNot FoundException and Exceptions
 * 
 */
import java.util.*;
import java.io.*;

class Name{
	public Name(String last, String first) {
		this.last = last;
		this.first = first;
	}
	
	public Name (String first) {this("", first);}
	
	public String getFormal() {return first + " " + last;} 
			
	public String getOfficial() {
			return last + "," + first;
	}
	
	public boolean equals (Name other) {return first.equals(other.first) && last.equals(other.last);}
			
	public String toString() {return first + " " + last;}
			
	public static Name read (Scanner scanner) {
			if (!scanner.hasNext ()) return null;
			String last = scanner.next ();
			String first = scanner.next ();
			return new Name (last, first);
	}
	public String getInitials() {
		return Character.toString(first.charAt(0)) +"."+ Character.toString(last.charAt(0)) +".";
	}
	
	private String first, last;
			
}

class PhoneNumber{
	private String number;
	
	public PhoneNumber(String phoneNum){
		this.number = phoneNum;
	}
	
	public String toString(){
		return number;
	}
	
	public boolean equals(PhoneNumber num){
		return number.equals(num.number);
	}
	
	public static PhoneNumber read(Scanner scanner){
		if(!scanner.hasNext()) return null;
		String number = scanner.next();
		return new PhoneNumber(number);
	}
				
}

class NewPhoneNumber extends PhoneNumber{
	  private String description;
		
	  public NewPhoneNumber(String number, String description){
	    super(number);
	    this.description=description;
	  }
	  
	  public static NewPhoneNumber read(Scanner scanner){
	    if(!scanner.hasNext()) return null;
	    String description = scanner.next();
	    String number = scanner.next();
	    return new NewPhoneNumber(description, number);
	  }
}

class PhonebookEntry {

	public PhonebookEntry(Name name, ArrayList<NewPhoneNumber> all_numbers){
		this.name = name;
		this.all_numbers = all_numbers;
	}
	
	public Name getName() {
		return name;
	}
	
	public String getPhoneNumber() {
		return all_numbers.toString();
	}
	
	public String toString() {
		 return name + "'s phone numbers: [" + all_numbers + "]";
	}

	
	public static PhonebookEntry read(Scanner scanner){
		try {
			if (!scanner.hasNext()) return null;
		      Name name = Name.read(scanner);
		      int header = scanner.nextInt();
		      for(int i=0; i<header; i++){
		        all_numbers.add(i, NewPhoneNumber.read(scanner));
		     
		      }
			return new PhonebookEntry(name, all_numbers);
		}catch(Exception e) {
			System.out.println("exception caught in PhonebookEntry read method" + e.getMessage());
			return null;
		}
		
	}
	private Name name;
	private static ArrayList<NewPhoneNumber> all_numbers = new ArrayList<NewPhoneNumber>();

	
}

class Phonebook {
	Map<Name, PhonebookEntry> phonebook = new HashMap<Name, PhonebookEntry>();
	
	public Phonebook(Scanner scanner) {
		while(scanner.hasNext()){
			// this phonebookentry allows multiple entries as adjusted in the PhonebookEntry class
			PhonebookEntry pbentry = PhonebookEntry.read(scanner);
			phonebook.put(pbentry.getName(), pbentry);

			System.out.println(pbentry);
		}
		
}
	
	//*** return the name if the attempt name is in the map
	public boolean lookup(Name name) {
		if(phonebook.containsKey(name)) {
			return true;
		}

		return false;
	}

	
}



