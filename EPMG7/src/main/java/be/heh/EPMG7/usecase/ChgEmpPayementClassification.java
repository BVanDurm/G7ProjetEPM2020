package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.Employee;
import be.heh.EPMG7.entity.PaymentClassification;
import be.heh.EPMG7.entity.PaymentSchedule;

abstract class ChgEmpPayementClassification extends ChgEmp {

    ChgEmpPayementClassification(int empId) {
        super(empId);
    }

    public abstract PaymentClassification makePayementClassification();

    public abstract PaymentSchedule makePayemenentSchedule();

    @Override
    public void change(Employee employee) {
        employee.setPayClassification(makePayementClassification());
        employee.setPaySchedule(makePayemenentSchedule());
    }
}
