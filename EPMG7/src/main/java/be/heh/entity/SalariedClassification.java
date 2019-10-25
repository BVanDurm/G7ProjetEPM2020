package be.heh.entity;

public class SalariedClassification implements PaymentClassification {
	private double salary;

	public SalariedClassification(double salary) {
		this.salary = salary;
	}

	public double calculationSalary(){
		return 1000; //return salary;
	}

/*
	public double getSalary() {
		return salary;
	}
*/
}
