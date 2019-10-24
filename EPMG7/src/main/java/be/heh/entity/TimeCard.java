package be.heh.entity;

import java.util.Calendar;

public class TimeCard extends HourlyClassification {
    private Calendar date;
    private double hours;

    public TimeCard(Calendar date, double hourlyRate) {
        super(hourlyRate);
        this.date = date;
    }
}
