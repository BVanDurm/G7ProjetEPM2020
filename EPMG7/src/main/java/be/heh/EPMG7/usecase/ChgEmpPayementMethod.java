package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.Employee;
import be.heh.EPMG7.entity.PaymentMethod;

abstract class ChgEmpPayementMethod extends ChgEmp {

    ChgEmpPayementMethod(int empId) {
        super(empId);
    }

    public abstract PaymentMethod makePayementMethod();

    @Override
    public void change(Employee employee) {
        employee.setPayMethod(makePayementMethod());
    }
}
