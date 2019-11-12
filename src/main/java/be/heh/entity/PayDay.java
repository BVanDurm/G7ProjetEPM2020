package be.heh.entity;

import be.heh.Context;
import be.heh.usecase.Transaction;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PayDay implements Transaction {

    int empId = 3;
    private Calendar PayTime;
    private Map<Integer, Paycheck> Pay;

    public PayDay(Calendar payDate)
    {
        this.PayTime = payDate;
        Pay = new HashMap<>();
    }

    public Paycheck getPaycheck(int EmpID){ return Pay.get(EmpID); }

    public int getPayCount() { return Pay.size(); }

    @Override
    public void execute() {

        Set<Integer> EmpIDs = (Set<Integer>) Context.employeeGateway.getEmployee(empId);

        for(int id : EmpIDs)
        {
            Employee e = Context.employeeGateway.getEmployee(empId);
            if(e.PayTime(PayTime))
            {
                Paycheck pc = new Paycheck(e.Pay)
            }
        }

    }
}
