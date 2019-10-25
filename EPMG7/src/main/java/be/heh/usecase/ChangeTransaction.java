package be.heh.usecase;

import be.heh.entity.Employee;
import be.heh.entity.PaymentMethod;

abstract class ChangeTransaction extends ChangeEmployee {

    public ChangeTransaction(int id) {
        super(id);
    }

    public abstract PaymentMethod getMethod();

    @Override
    public void change(Employee employee) {
        employee.setPayMethod(getMethod());
    }
}
