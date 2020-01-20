package be.heh.EPMG7.entity;

import java.util.*;

public class HourlyClassification implements PaymentClassification {

    private Map<Calendar, TimeCard> listTimeCards = new HashMap<>();
    private double HourlySalary;

    public HourlyClassification(double hourlyRate) {
        this.HourlySalary = hourlyRate;
    }

    public double getHoursSalary() {
        return HourlySalary;
    }

    public void addTimeCard(TimeCard timeCard) {
        listTimeCards.put(timeCard.getDate(), timeCard);
    }

    public TimeCard getTimeCard(Calendar date) {
        return listTimeCards.get(date);
    }

    @Override
    public double calculationPay(PayCheck pc) {
        double totalPay = 0;
        for(TimeCard timeCard: listTimeCards.values()){
            if(PaymentClassification.isInPayPeriod(timeCard.getDate(), pc)){
                totalPay += calculatePayForTimeCard(timeCard);
            }
        }
        return totalPay;
    }

    private double calculatePayForTimeCard(TimeCard timeCard) {
        double hours = timeCard.getHours();
        double overtime = Math.max(0.0, hours-8.0);
        double straightTime = hours - overtime;
        return straightTime * HourlySalary + overtime * HourlySalary * 1.5;
    }
}
