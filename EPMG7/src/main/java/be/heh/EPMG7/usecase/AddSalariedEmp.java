package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.*;

public class AddSalariedEmp extends AddEmp {

    private double Salary;

    public AddSalariedEmp(int empid, String name, String address, double salary) {
        super(empid, name, address);
        this.Salary = salary;
    }

    @Override
    public PaymentSchedule makePaymentSchedule() {
        return new MonthlyPaymentSchedule();
    }

    @Override
    public PaymentClassification makePaymentClassification() {
        return new SalariedClassification(Salary);
    }

    @Override
    public PaymentMethod makePaymentMethod() {
        return new MailMethod("toto@gmail.be");
    }
}
