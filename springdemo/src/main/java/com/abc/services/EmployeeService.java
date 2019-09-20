package com.abc.services;

public class EmployeeService {
	private TaxService ts;

	public EmployeeService() {
		super();

	}

	public EmployeeService(TaxService taxService) {
		super();
		this.ts = taxService;
	}

	public double calculaeNetIncome(double grossSalary) {
		double fedTax = ts.calculateFedTax(grossSalary);
		double stateTax = ts.calculateStateTax(grossSalary);
		double netIncome = grossSalary - fedTax - stateTax;
		return netIncome;
	}

	public TaxService getTaxService() {
		return ts;
	}

	public void setTaxService(TaxService taxService) {
		this.ts = taxService;
	}

}
