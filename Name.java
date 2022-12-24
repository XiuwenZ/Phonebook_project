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
