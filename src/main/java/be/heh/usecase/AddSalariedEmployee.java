package be.heh.usecase;

import be.heh.entity.*;

public class AddSalariedEmployee extends AddEmployee {
    private int empId;
    private String name;
    private String address;
    private double mlty_slry;

    public AddSalariedEmployee(int empId, String name, String address, double mlty_slry){
        super(empId,name,address);
        this.mlty_slry = mlty_slry;
    }


    @Override
    protected PaymentSchedule makePaymentSchedule() {
        return new MonthlyPaymentySchedule();
    }

    @Override
    protected PaymentClassification makePaymentClassification() {
        return new SalariedClassification(mlty_slry);
    }

    @Override
    protected PaymentMethod makePaymentMethod() {
        return new MailMethod("toto@gmail.com");
    }
}
