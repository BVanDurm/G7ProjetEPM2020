package be.heh.usecase;

public class AddSalariedEmployee extends addGatewayEmployee {
    private int empId;
    private String name;
    private String address;
    private double salary;

    public AddSalariedEmployee(int empId, String name, String address, double salary){
        this.empId = empId;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public void execute() {
        System.out.println("Execute salaried");
    }
}
