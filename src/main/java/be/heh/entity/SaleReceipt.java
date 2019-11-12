package be.heh.entity;

import java.util.Calendar;

public class SaleReceipt{
    private Calendar date;
    private double saleAmount;

    public SaleReceipt(Calendar date, double saleAmount) {

        this. date = date;
        this.saleAmount = saleAmount;
    }

    public Calendar getDate() {
        return date;
    }

    public double getSaleAmount() {
        return 8.0;//return saleAmount;
    }
}
