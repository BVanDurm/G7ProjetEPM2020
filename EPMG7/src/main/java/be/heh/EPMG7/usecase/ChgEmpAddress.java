package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.Employee;

public class ChgEmpAddress extends ChgEmp {

    private String Address;

    public ChgEmpAddress(int empID, String address) {
        super(empID);
        this.Address = address;
    }

    @Override
    public void change(Employee employee) {
        employee.setAddress(Address);
    }
}
