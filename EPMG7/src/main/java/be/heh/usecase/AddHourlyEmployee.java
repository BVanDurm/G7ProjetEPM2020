package be.heh.usecase;

public class AddHourlyEmployee {
    private int empId;
    private String name;
    private String address;
    private double salary;

    public AddHourlyEmployee(int empId, String name, String address, double salary){
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public void execute() {
        System.out.println("Execute hourly");
    }
}
