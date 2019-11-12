package be.heh.usecase;

import be.heh.entity.*;

public class AddCommissionEmployee extends AddEmployee {
    private int empId;
    private String name;
    private String address;
    private double salary;
    private double commission;

    public AddCommissionEmployee(int empId, String name, String address, double mlty_slry, double com_rate){
        super(empId,name,address);
        this.salary = mlty_slry;
        this.commission = com_rate;
    }

    @Override
    protected PaymentSchedule makePaymentSchedule() {
        return new WeeklyPaymentSchedule();
    }

    @Override
    protected CommissionedClassification makePaymentClassification() {
        return new CommissionedClassification(salary, commission);
    }

    @Override
    protected PaymentMethod makePaymentMethod() {
        return new MailMethod("toto@gmail.com");
    }
}
