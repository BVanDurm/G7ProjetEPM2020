package be.heh.usecase;

import be.heh.entity.HourlyClassification;
import be.heh.entity.PaymentClassification;
import be.heh.entity.PaymentSchedule;
import be.heh.entity.WeeklyPaymentSchedule;

public class ChangeHourly extends ChangeClassification{

    private double hrly_rate;

    public ChangeHourly(int EmpID, double hrly_rate)
    {
        super(EmpID);
        hrly_rate = hrly_rate;
    }
    @Override
    public PaymentClassification getClassification() {
        return new HourlyClassification(hrly_rate);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new WeeklyPaymentSchedule();
    }
}