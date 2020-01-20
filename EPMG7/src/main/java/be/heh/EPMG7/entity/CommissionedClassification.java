package be.heh.EPMG7.entity;

import java.util.*;

public class CommissionedClassification implements PaymentClassification {

    private double Commission;
    private double Salary;
    private Map<Calendar, SalesReceipt> ListSaleReceipts = new HashMap<>();

    public CommissionedClassification(double salary, double commissionRate) {
        this.Commission = commissionRate;
        this.Salary = salary;
    }

    public double getCommission() {
        return Commission;
    }

    public double getSalary() {
        return Salary;
    }

    public void addReceipt(SalesReceipt receipt) {
        ListSaleReceipts.put(receipt.getDate(), receipt);
    }

    public SalesReceipt getSalesReceipt(Calendar date) {
        return ListSaleReceipts.get(date);
    }

    @Override
    public double calculationPay(PayCheck pc) {
        double commission = 0.0;
        for (Calendar c : ListSaleReceipts.keySet()) {
            if (PaymentClassification.isInPayPeriod(c, pc)) {
                commission += ListSaleReceipts.get(c).getAmount() * Commission;
            }
        }
        return Salary + commission;
    }
}
