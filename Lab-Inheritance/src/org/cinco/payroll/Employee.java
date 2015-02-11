package org.cinco.payroll;

public abstract class Employee implements Payable {
	
	private String ID;
	private String firstName;
	private String lastName;
	private String title;
	
	
	public Employee(String title, String firstName,String lastName, String ID){
		
		this.firstName = firstName;
		this.ID = ID;
		this.lastName = lastName;
		this.title = title;
		
	}
	
	public String getID(){
		return this.ID;
		
	}
	public void setID(String ID) {
		this.ID = ID;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	abstract String getType();

	abstract double getGrossPay();
	
	public abstract double getNetPay();
	
	abstract double getTaxes();

}