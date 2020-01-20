package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.Command;
import be.heh.EPMG7.entity.Employee;
import be.heh.EPMG7.Context;

abstract class ChgEmp implements Command {

    private int EmpId;

    public ChgEmp(int empId) {
        this.EmpId = empId;
    }

    public abstract void change(Employee employee);

    @Override
    public void execute() {
        Employee e = Context.employeeGateway.getEmployee(EmpId);
        if (e != null) {
            change(e);
        }
    }
}
