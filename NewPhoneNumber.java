class NewPhoneNumber extends PhoneNumber{
	  private String description;
		
	  public NewPhoneNumber(String number, String description){
	    super(number);
	    this.description=description;
	  }
	  @Override
	  public String toString(){
		  return this.description +": "+ super.toString();
	  }
	  public static NewPhoneNumber read(Scanner scanner){
	    if(!scanner.hasNext()) return null;
	    String description = scanner.next();
	    String number = scanner.next();
//	    System.out.println(description + ": "+ number);
	    NewPhoneNumber npn = new NewPhoneNumber(number,description);
//	    System.out.println("new phone number read in "+ npn );
	    return npn;
	  }
}
 
