package org.cinco.payroll;

public  class Staff extends HourlyEmployee {

	//private String type;	
	
	public Staff(String ID, String firstName, String lastName, String title, double hourlypayRate, double hoursWorked) {
		super(ID,firstName, lastName, title, hourlypayRate, hoursWorked);
		// TODO Auto-generated constructor stub
		//this.type = type;
	}
	public String getType() {
		return "Staff";
	}
	
	public double getTaxes(){
		
		return hourlypayRate*hoursWorked*0.15;
	}
	@Override
	double getGrossPay() {
		// TODO Auto-generated method stub
		return this.hourlypayRate * this.hoursWorked;
	}
	@Override
	public
	double getNetPay() {
		// TODO Auto-generated method stub
		return getGrossPay() - getTaxes();
	}
}
