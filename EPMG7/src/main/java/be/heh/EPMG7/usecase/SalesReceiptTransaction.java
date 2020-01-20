package be.heh.EPMG7.usecase;

import be.heh.EPMG7.Context;
import be.heh.EPMG7.entity.Employee;
import be.heh.EPMG7.entity.SalesReceipt;
import be.heh.EPMG7.entity.CommissionedClassification;
import be.heh.EPMG7.entity.PaymentClassification;
import be.heh.EPMG7.entity.Command;
import java.util.Calendar;

public class SalesReceiptTransaction implements Command {

    private Calendar SaleDate;
    private double Amount;
    private int Empid;

    public SalesReceiptTransaction(int empid, Calendar date, double amount) {
        this.SaleDate = date;
        this.Amount = amount;
        this.Empid = empid;
    }

    @Override
    public void execute() {
        Employee e = Context.employeeGateway.getEmployee(Empid);
        if (e != null) {
            PaymentClassification pc = e.getPayClassification();
            if (pc instanceof CommissionedClassification) {
                CommissionedClassification cc = (CommissionedClassification) pc;
                cc.addReceipt(new SalesReceipt(SaleDate, Amount));
            } else {
                throw new RuntimeException("Tried to add sales receipt to non-commissioned employee");
            }
        } else {
            throw new RuntimeException("Employee not found");
        }
    }
}
