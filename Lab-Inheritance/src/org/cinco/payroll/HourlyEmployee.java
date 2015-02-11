package org.cinco.payroll;

public  abstract class HourlyEmployee extends Employee {

	protected double hourlypayRate;
	protected double hoursWorked;
	
	public HourlyEmployee(String ID, String firstName, String lastName, String title, double hourlypayRate, double hoursWorked) {
		super(ID, firstName, lastName, title);
		// TODO Auto-generated constructor stub
		this.hourlypayRate = hourlypayRate;
		this.hoursWorked = hoursWorked;
	}
	
	public double getHourlyPay(){
		return this.hourlypayRate;
		
	}
	
	public double getHoursWorked(){
		return this.hoursWorked;
	}
	
	public double getGrosspay(){
		return this.hourlypayRate * this.hoursWorked;
	}

	@Override
	String getType() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	double getTaxes() {
		// TODO Auto-generated method stub
		return 1;
	}
}
