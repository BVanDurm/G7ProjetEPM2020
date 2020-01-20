package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.MonthlyPaymentSchedule;
import be.heh.EPMG7.entity.PaymentClassification;
import be.heh.EPMG7.entity.PaymentSchedule;
import be.heh.EPMG7.entity.SalariedClassification;

public class ChgEmpSalaried extends ChgEmpPayementClassification {

    private double Salary;

    public ChgEmpSalaried(int empId, double salary) {
        super(empId);
        this.Salary = salary;
    }

    @Override
    public PaymentClassification makePayementClassification() {
        return new SalariedClassification(Salary);
    }

    @Override
    public PaymentSchedule makePayemenentSchedule() {
        return new MonthlyPaymentSchedule();
    }
}
