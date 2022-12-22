class PhoneNumber{
	private String number;
	
	public PhoneNumber(String phoneNum){
		this.number = phoneNum;
	}
	
	public String getAreaCode(){
		// the first three digits
		String areaCode = number.substring(1,4);
		return areaCode;
	}
	
	public String getExchange(){
		// return the middle three digits
		return number.substring(5,8);
			//number.indexOf(")")+1, number.indexOf("-"));
	}
	
	public String getLineNumber(){
		// return the last four digits 
		return number.substring(9);
			//number.indexOf("-")+1);
	}
	
	public boolean isTollFree(){
		return (Character.toString(number.charAt(1)).equals("8"));
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
