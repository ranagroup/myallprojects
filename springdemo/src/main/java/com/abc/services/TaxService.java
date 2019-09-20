package com.abc.services;

public class TaxService {
	public double calculateFedTax(double salary) {
		 
		double tax = 00;
		if (salary <= 10000) {
			tax = tax + 0.1 * salary;
		} else if (salary > 10000 && salary <= 50000) {
			tax = (0.1 * 10000) + (0.2 * (salary - 10000));
		} else {
			tax = (0.1 * 10000) + (0.2 * 4000) + (0.4 * (salary - 50000));
		}

		return tax;
	}

	public double calculateStateTax(double salary) {
		return 0.07 * salary;
	}
}
