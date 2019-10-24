package be.heh.entity;

import be.heh.entity.PaymentClassification;

public class SalariedClassification implements PaymentClassification {
	private double salary;

	public SalariedClassification(double salary) {
		this.salary = salary;
	}

	public double calculationSalary(){
		return 1000;
	}
}
