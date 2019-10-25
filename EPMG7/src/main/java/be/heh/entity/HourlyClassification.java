package be.heh.entity;

import java.util.Calendar;
import java.util.HashMap;

public class HourlyClassification implements PaymentClassification {
	private double hoursSalary;
	private double salary;
	private HashMap<Calendar, TimeCard> listTimeCard = new HashMap<>();


	public HourlyClassification(double hoursSalary){
		this.hoursSalary = hoursSalary;
	}

    public double calculationSalary(){
		return 380;
	}

	public double getHoursSalary() {
		return hoursSalary;
	}

	public void addTimeCard(TimeCard timeCard) {
		listTimeCard.put(timeCard.getDate(), timeCard);
	}

	public TimeCard getTimeCard(Calendar date){
		return listTimeCard.get(date);
	}


}