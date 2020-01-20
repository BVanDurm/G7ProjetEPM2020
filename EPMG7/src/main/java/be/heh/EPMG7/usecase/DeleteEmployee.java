package be.heh.EPMG7.usecase;

import be.heh.EPMG7.Context;
import be.heh.EPMG7.entity.Command;

public class DeleteEmployee implements Command {

    private int EmpId;

    public DeleteEmployee(int empId) {
        this.EmpId = empId;
    }

    @Override
    public void execute() {
        Context.employeeGateway.deleteEmployee(EmpId);
    }
}
