package be.heh.usecase;

import be.heh.Context;
import be.heh.entity.Employee;

abstract class ChangeEmployee implements Transaction{


    private int EmpID;

    public ChangeEmployee(int id){this.EmpID = id;}

    public abstract void change(Employee employee);

    @Override
    public void execute() {
        Employee e = Context.employeeGateway.getEmployee(EmpID);
        if(e != null)
        {
            change(e);
        }

    }
}
