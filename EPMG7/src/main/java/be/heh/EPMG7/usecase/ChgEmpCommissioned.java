package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.CommissionedClassification;
import be.heh.EPMG7.entity.PaymentClassification;
import be.heh.EPMG7.entity.PaymentSchedule;
import be.heh.EPMG7.entity.TwoWeeklyPaymentSchedule;

public class ChgEmpCommissioned extends ChgEmpPayementClassification {

    private double Salary;
    private double CommissionRate;

    public ChgEmpCommissioned(int empId, double salary, double rate) {
        super(empId);
        this.Salary = salary;
        this.CommissionRate = rate;
    }

    @Override
    public PaymentClassification makePayementClassification() {
        return new CommissionedClassification(Salary, CommissionRate);
    }

    @Override
    public PaymentSchedule makePayemenentSchedule() {
        return new TwoWeeklyPaymentSchedule();
    }
}
