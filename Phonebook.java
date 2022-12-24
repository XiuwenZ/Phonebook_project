class Phonebook {
	Map<Name, PhonebookEntry> phonebook = new HashMap<Name, PhonebookEntry>();
	
	public Phonebook(Scanner scanner) {
		while(scanner.hasNext()){
			// this phonebookentry allows multiple entries as adjusted in the PhonebookEntry class
			PhonebookEntry pbentry = PhonebookEntry.read(scanner);
			phonebook.put(pbentry.getName(), pbentry);

//			System.out.println(pbentry);
			System.out.println(phonebook.keySet());
			System.out.println(phonebook.values());
		}
		
}
	public String toString() {
		return ""+phonebook.values();
	}
	
	//*** return the name if the attempt name is in the map
	public boolean lookup(Name name) {
		if(phonebook.containsKey(name)) {
			return true;
		}

		return false;
	}

	
}
