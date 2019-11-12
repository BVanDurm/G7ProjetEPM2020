package be.heh.usecase;

import be.heh.entity.Employee;

public class ChangeEmployeeName extends ChangeEmployee{

    private String Name;

    public ChangeEmployeeName(int EmpID, String name)
    {
        super(EmpID);
        this.Name = name;
    }

    @Override
    public void change(Employee employee) {

        employee.setName(Name);

    }
}
