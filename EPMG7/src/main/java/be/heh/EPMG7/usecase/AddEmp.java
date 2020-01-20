package be.heh.EPMG7.usecase;

import be.heh.EPMG7.Context;
import be.heh.EPMG7.entity.*;

abstract class AddEmp implements Command {

    protected Employee employee;
    private int EmpID;
    private String Address;
    private String Name;

    AddEmp(int empid, String name, String address) {
        this.EmpID = empid;
        this.Address = address;
        this.Name = name;
    }

    public abstract PaymentSchedule makePaymentSchedule();
    public abstract PaymentClassification makePaymentClassification();
    public abstract PaymentMethod makePaymentMethod();

    @Override
    public void execute() {
        Employee e = new Employee(EmpID, Name, Address);
        e.setPayClassification(makePaymentClassification());
        e.setPaySchedule(makePaymentSchedule());
        e.setPayMethod(new CashMethod());
        Context.employeeGateway.save(EmpID, e); // save a la place de addEmployee
    }
}
