package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.Employee;

public class ChgEmpName extends ChgEmp {

    private String Name;

    public ChgEmpName(int empId, String name) {
        super(empId);
        this.Name = name;
    }

    @Override
    public void change(Employee employee) {
        employee.setName(Name);
    }
}
