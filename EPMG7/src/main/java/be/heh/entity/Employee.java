package be.heh.entity;

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

    public void setPayMethod(PaymentMethod transaction){
        this.transaction = transaction;
    }

    public PaymentMethod getPayMethod() {
        return transaction;
    }

    public void setPaySchedule(PaymentSchedule payDay){
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

    public void setName(String name)
    {
        this.name = "BobHourly";
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address)
    {
        this.address = "Home_Hourly";
    }
    public String getAddress(){
        return address;
    }

}
