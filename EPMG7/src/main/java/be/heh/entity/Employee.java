package be.heh.entity;

import be.heh.entity.PaymentClassification;
import be.heh.entity.PaymentMethod;
import be.heh.entity.PaymentSchedule;

public class Employee {
    private PaymentMethod transaction; // strategy
    private PaymentSchedule payDay; // strategy
    private PaymentClassification paymentClassification; // strategy
    private int EmpID;
    private String name;
    private String address;

    public Employee(int id, String name, String address) {
        this.EmpID = id;
        this.name = name;
        this.address =address;
    }

    public void setPayMethod(PaymentMethod transaction){ // A REFAIRE
        this.transaction = transaction;
    }

    public PaymentMethod getPayMethod() {
        return transaction;
    }

    public void setPaySchedule(PaymentSchedule payDay){ // A REFAIRE
        this.payDay = payDay;
    }

    public PaymentSchedule getPaySchedule() {
        return payDay;
    }

    public void setPayClassification(PaymentClassification paymentClassification){
        this.paymentClassification = paymentClassification;
    }

    public PaymentClassification getPayClassification() {
        return paymentClassification;
    }

    public double calculatePay() {
        return paymentClassification.calculationSalary();
    }

    public String getName() {
        return this.name;
    }
}
