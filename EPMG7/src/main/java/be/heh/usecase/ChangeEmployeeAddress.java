package be.heh.usecase;

import be.heh.entity.Employee;

public class ChangeEmployeeAddress extends ChangeEmployee{

    private String Address;

    public ChangeEmployeeAddress(int EmpID, String Address)
    {
        super(EmpID);
        this.Address = Address;
    }
    @Override
    public void change(Employee employee) {
        employee.setAddress(Address);

    }
}
