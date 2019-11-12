package be.heh.usecase;

import be.heh.Context;
import be.heh.entity.*;

import java.util.Calendar;

public class TimeCardTransaction implements Command {

    private int empID;
    private Calendar date;
    private double hours;

    public TimeCardTransaction(int empID, Calendar date, double hours) {
        this.empID = empID;
        this.date = date;
        this.hours = hours;
    }

    @Override
    public void execute() {
        Employee e = Context.employeeGateway.getEmployee(empID);
        if (e != null) {
            PaymentClassification pc = e.getPayClassification();
            if (pc instanceof HourlyClassification) {
                HourlyClassification hc = (HourlyClassification) pc;
                hc.addTimeCard(new TimeCard(date, hours));
            } else {
                System.out.println("Tried to add timecard to non-hourly employee");
            }
        } else {
            System.out.println("No such employee");
        }
    }
}
