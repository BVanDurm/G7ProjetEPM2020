package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.HourlyClassification;
import be.heh.EPMG7.entity.PaymentClassification;
import be.heh.EPMG7.entity.PaymentSchedule;
import be.heh.EPMG7.entity.WeeklyPaymentSchedule;

public class ChgEmpHourly extends ChgEmpPayementClassification {

    private double HourlyRate;

    public ChgEmpHourly(int empId, double rate) {
        super(empId);
        HourlyRate = rate;
    }

    @Override
    public PaymentClassification makePayementClassification() {
        return new HourlyClassification(HourlyRate);
    }

    @Override
    public PaymentSchedule makePayemenentSchedule() {
        return new WeeklyPaymentSchedule();
    }
}
