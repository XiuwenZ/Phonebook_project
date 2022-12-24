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
		 return name + "'s phone numbers: " + all_numbers;
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
