package be.heh.usecase;

import be.heh.entity.MonthlyPaymentySchedule;
import be.heh.entity.PaymentClassification;
import be.heh.entity.PaymentSchedule;
import be.heh.entity.SalariedClassification;

public class ChangeSalaried extends ChangeClassification{

    private double Salary;

    public ChangeSalaried(int EmpID, double salary)
    {
        super(EmpID);
        this.Salary = salary;
    }
    @Override
    public PaymentClassification getClassification() {
        return new SalariedClassification(Salary);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new MonthlyPaymentySchedule();
    }
}
