package com.capgemini;

public class EmployeeWizard4 {
	public static void main(String[] args) {
		
		int EMP_RATE_PER_HOUR = 20;
		//Variables
		int empHrs = 0;
		int empWage = 0;
		//Computation
		int empCheck =  (int) (Math.floor(Math.random()*10)%3);
		switch (empCheck) {
		case 1:
			empHrs = 4;
			break;
		case 2:
			empHrs = 8;
		default:
			empHrs = 0;
		
		}
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: "+empWage);
	}
}
