class PhoneNumber{	
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
	private String number;
}
  
