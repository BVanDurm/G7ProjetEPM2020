package be.heh.entity;

import be.heh.entity.PaymentClassification;
import be.heh.entity.TimeCard;

public class HourlyClassification implements PaymentClassification {
	private double hoursSalary;
	private double salary;
	//private HashMap <Calendar, double> listTimeCard;

	public HourlyClassification(double hoursSalary){
		this.hoursSalary = hoursSalary;
	}

    public double calculationSalary(){
		return 380;
	}

	public void addTimeCard(TimeCard timeCard) {

	}
}
