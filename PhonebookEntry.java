class PhonebookEntry {

	public PhonebookEntry(Name name, PhoneNumber phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public Name getName() {
		return name;
	}
	
	public ArrayList<PhoneNumber> getPhoneNumber() {
		return all_numbers;
	}
	
	public void call() {
		if(phoneNumber.isTollFree()) {
			System.out.println("Dialing (toll-free) " + name + ": " + phoneNumber);
		}
		else 
			System.out.println("Dialing " + name + ": " + phoneNumber);
	}
	
	public String toString() {
		return name.toString() + ": " + all_numbers;
	}

	public boolean equals(PhonebookEntry other){
		return name.equals(other.name) && phoneNumber.equals(other.phoneNumber);
	}
	
	public static PhonebookEntry read(Scanner scanner){
		if(!scanner.hasNext()) return null;
		
		name = new Name(scanner.next(), scanner.next());
		int count_number = scanner.nextInt();

		for(int i= 0; i<count_number*2; i++) {
			phoneNumber = new PhoneNumber(scanner.next());
			ArrayList<PhoneNumber> all_numbers = new ArrayList<PhoneNumber>();
		}
		
		all_numbers.add(phoneNumber);
		return new PhonebookEntry(name, phoneNumber);
	}

	private static Name name;
	private static PhoneNumber phoneNumber;
	private static ArrayList<PhoneNumber> all_numbers ;
	
}
