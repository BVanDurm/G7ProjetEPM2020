package be.heh.usecase;

import be.heh.Context;
import be.heh.entity.*;

import java.util.Calendar;

public class SaleReceiptTransaction implements Command {
    private Calendar date;
    private double saleAmount;
    private int empID;

    public SaleReceiptTransaction(int empID, Calendar date, double saleAmount) {
        this.empID = empID;
        this.date = date;
        this.saleAmount = saleAmount;
    }

    @Override
    public void execute() {
        Employee e = Context.employeeGateway.getEmployee(empID);
        if (e != null) {
            PaymentClassification pc = e.getPayClassification();
            if (pc instanceof CommissionedClassification) {
                CommissionedClassification cc = (CommissionedClassification) pc;
                cc.addSaleReceipt(new SaleReceipt(date, saleAmount));
            } else {
                System.out.println("Tried to add sales receipt to non-commissioned employee");
            }
        } else {
            System.out.println("Employee not found");
        }
    }
}