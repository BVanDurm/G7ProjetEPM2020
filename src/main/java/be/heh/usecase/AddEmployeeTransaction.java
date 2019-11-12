package be.heh.usecase;

import be.heh.Context;
import be.heh.entity.*;

public abstract class AddEmployeeTransaction implements Command {
    private int empId;
    private String name;
    private String address;

    protected abstract PaymentSchedule makePaymentSchedule();
    protected abstract PaymentClassification makePaymentClassification();
    protected abstract PaymentMethod makePaymentMethod();

    @Override
    public void execute() {
        PaymentClassification pc = makePaymentClassification();
        PaymentSchedule ps = makePaymentSchedule();
        PaymentMethod pm = makePaymentMethod();

        Employee e = new Employee(empId, name, address);
        e.setPayClassification(pc);
        e.setPaySchedule(ps);
        e.setPayMethod(pm);

        Context.employeeGateway.save(empId, e);
    }
}
