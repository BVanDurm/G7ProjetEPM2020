package be.heh.usecase;

import be.heh.entity.CommissionedClassification;
import be.heh.entity.PaymentClassification;
import be.heh.entity.PaymentSchedule;
import be.heh.entity.TwoWeeksPaymentSchedule;

public class ChangeCommissioned extends ChangeClassification{

    private double Salary;
    private double Commission;

    public ChangeCommissioned(int EmpID, double salary, double commission)
    {
        super(EmpID);
        this.Salary = salary;
        this.Commission = commission;
    }
    @Override
    public PaymentClassification getClassification() {
        return new CommissionedClassification(Salary, Commission);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new TwoWeeksPaymentSchedule();
    }
}
