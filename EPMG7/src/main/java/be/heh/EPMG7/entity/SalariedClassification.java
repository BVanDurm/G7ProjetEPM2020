package be.heh.EPMG7.entity;

public class SalariedClassification implements PaymentClassification {

    private double Salary;

    public SalariedClassification(double salary) {
        this.Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }

    @Override
    public double calculationPay(PayCheck pc) {
        return Salary;
    }
}
