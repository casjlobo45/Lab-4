package unl.cse.library;

public class Author {
	
	private String firstName;   
	private String lastName;
	
    public Author(String firstName, String lastName) {
    	firstName = this.firstName;
    	 lastName = this.lastName;
    }
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName.length() >2){
		this.lastName = lastName;
		} else{
			this.lastName = null;
		}
	}
	
	public static String authComma(String firstName, String lastName){
		
		String n = lastName + "," + firstName;
		return n;
		
	}
}
