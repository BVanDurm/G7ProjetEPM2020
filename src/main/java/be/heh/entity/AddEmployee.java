package be.heh.entity;

import be.heh.Context;

public abstract class AddEmployee implements Command {
    private int empID;
    private String name;
    private String address;
    protected Employee employee;

    public AddEmployee(int empID, String name, String address){
        this.empID = empID;
        this.name = name;
        this.address = address;
    }

    protected abstract PaymentSchedule makePaymentSchedule();
    protected abstract PaymentClassification makePaymentClassification();
    protected abstract PaymentMethod makePaymentMethod();

    @Override
    public void execute() {
        PaymentClassification pc = makePaymentClassification();
        PaymentSchedule ps = makePaymentSchedule();
        PaymentMethod pm = new DirectDepositMethod("Fortis", "be332211");

        Employee e = new Employee(empID, name, address);
        e.setPayClassification(pc);
        e.setPaySchedule(ps);
        e.setPayMethod(pm);

        Context.employeeGateway.save(empID, e);
    }
}
