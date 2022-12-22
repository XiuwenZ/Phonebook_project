
class Phonebook {
	
	public Phonebook(PhonebookEntry pbEntry) {
		//when create a new phonebook object, store the name and phonenumbers array into the map 
		phonebook.put(pbEntry.getName(), pbEntry.getPhoneNumber());
		
}
	
	public static String toString(HashMap<Name, ArrayList<PhoneNumber>> phonebook, String input, Name name) {
		if(input.charAt(0) == 'l') {
			if(name != null) {
				//get the name from the map key and print the value out

			}
			else {
				return "-- Name not found\n";
			}
		}
		return null;
	}
	
	//*** return the name if the attempt name is in the map
	public Name lookup(ArrayList<PhonebookEntry> pb, Name name) {
		
		for(int i = 0; i<phonebook.size(); i++) {
			if(phonebook.containsKey(name)) {
				return name;
			}
		}
		return null;
	}
	private HashMap<Name, ArrayList<PhoneNumber>> phonebook;
}
	
