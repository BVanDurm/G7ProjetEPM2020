package be.heh.EPMG7.entity;

import be.heh.EPMG7.Context;
import be.heh.EPMG7.doubles.InMemoryEmployeeGateway;

public class TestSetup {
    public static void setupContext(){
        Context.employeeGateway = new InMemoryEmployeeGateway();
    }
}
