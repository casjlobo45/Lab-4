/*
 * PaycheckCalc.java

 * Adapted from lab4.c by Tony Schneider
 *
 * Paycheck Calculator for CSE155 Lab Debugging.
 * This program takes the percentage of a paycheck
 * as input to devote to social security, FICA, and
 * federal and state taxes, as well as the hourly
 * payrate and total hours of work and returns the
 * total paycheck amount after taxes.
 *
 * $10 is then taken out of the net pay for a separate
 * savings.
 * 
 */
package unl.cse.debugging;
import java.util.Scanner;

public class PaycheckCalc {

    public static final int SAVINGS = 10;

    public static void main( String[] args ){

        Scanner input = new Scanner( System.in );

        int socSecTax, ficaTax, fedTax, stateTax;

        double hoursWorked, payRate, grossPay;

        System.out.print( "Please enter the percentage deducted due to Social Security: " );
        socSecTax = input.nextInt();

        System.out.print( "Please enter the percentage deducted due to FICA: " );
        ficaTax = input.nextInt();

        System.out.print( "Please enter the percentage deducted due to Federal tax: " );
        fedTax = input.nextInt();

        System.out.print( "Please enter the percentage deducted due to State tax: " );
        stateTax = input.nextInt();

        System.out.print( "Please enter the number of hours worked: " );
        hoursWorked = input.nextDouble();

        System.out.print( "Please enter the pay rate(per hour): " );
        payRate = input.nextDouble();

        double netPay;

        /* Calculate gross pay */
        grossPay = payRate * hoursWorked;

        /* Calculate net pay after taxes */
        netPay = grossPay - (grossPay * socSecTax);
	netPay = grossPay - (grossPay * ficaTax);
	netPay = grossPay - (grossPay * fedTax);
	netPay = grossPay - (grossPay * stateTax);

        /* Displays the net pay */
	System.out.format( "The net pay before savings is: %f\n", netPay);
	System.out.format( "The net pay after savings is: %f\n", netPay - SAVINGS);
        
    } // End main()

} // End class definition
