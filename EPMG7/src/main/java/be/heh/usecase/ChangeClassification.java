package be.heh.usecase;

import be.heh.entity.Employee;
import be.heh.entity.PaymentClassification;
import be.heh.entity.PaymentSchedule;

abstract class ChangeClassification extends ChangeEmployee {


    public ChangeClassification(int id) {
        super(id);
    }

    public abstract PaymentClassification getClassification();

    public abstract PaymentSchedule getSchedule();

    @Override
    public void change(Employee employee)
    {
        employee.setPayClassification(getClassification());
        employee.setPaySchedule(getSchedule());
    }
}
