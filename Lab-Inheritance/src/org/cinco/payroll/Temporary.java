package org.cinco.payroll;

public  class Temporary extends HourlyEmployee {

	//private String type;
	
	public Temporary(String ID, String firstName, String lastName, String title, double hourlypayRate, double hoursWorked) {
		super(ID, firstName, lastName, title,  hourlypayRate, hoursWorked);
		// TODO Auto-generated constructor stub
		//this.type = type;
	
	}
	
	
	public String getType() {
		return "Temporary";
	}

	public double getTaxes(){
		return 0;
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
