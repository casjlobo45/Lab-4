package org.cinco.payroll;

public  class SalaryEmployee extends Employee{

//	private String type;
	private double annualSalary;
	public SalaryEmployee(String ID, String firstName, String lastName, String title, double annualSalary) {
		super(ID, firstName, lastName, title);
		// TODO Auto-generated constructor stub
		//this.type = type;
		this.annualSalary = annualSalary;
	}
	public String getType() {
		return "Salary";
	}
	
	public double getNetpay(){
		return this.annualSalary-getTaxes() + 100;
	}
	
	public double getGrossPay(){
		return this.annualSalary;
	}
	
	public double getTaxes(){
		return this.annualSalary*0.2;
	}
	@Override
	public
	double getNetPay() {
		// TODO Auto-generated method stub
		return getGrossPay() - getTaxes();
	}
	
}
