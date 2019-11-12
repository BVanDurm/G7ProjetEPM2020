package be.heh.entity;

import be.heh.Context;
import be.heh.usecase.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class TestChangeEmployee {

    @Before
    public void setup()
    {
        TestSetup.setupContext();
    }

    @Test
    public void ChangeName()
    {
        int empID = 2;
        AddHourlyEmployee t = new AddHourlyEmployee(empID, "BobHourly", "Home_Hourly", 15.25);
        t.execute();
        ChangeEmployeeName tct = new ChangeEmployeeName(empID, "Bibi");
        tct.execute();

        Employee e = Context.employeeGateway.getEmployee(empID);
        Assert.assertNotNull(e);
        Assert.assertEquals("Bibi", e.getName());
    }

    @Test
    public void ChangeAddress()
    {
        int empID = 2;
        AddHourlyEmployee t = new AddHourlyEmployee(empID, "BobHourly", "Home_Hourly", 15.25);
        t.execute();
        ChangeEmployeeAddress tct = new ChangeEmployeeAddress(empID, "Work_Hourly");
        tct.execute();

        Employee e = Context.employeeGateway.getEmployee(empID);
        Assert.assertNotNull(e);
        Assert.assertEquals("Work_Hourly", e.getAddress());
    }

    @Test
    public void ChangeToHourly()
    {
        int EmpID = 3;
        AddCommissionEmployee t = new AddCommissionEmployee(EmpID, "Didier", "Home", 1700, 3.0);
        t.execute();

        ChangeHourly tct = new ChangeHourly(EmpID, 25.50);
        tct.execute();

        Employee e = Context.employeeGateway.getEmployee(EmpID);
        Assert.assertNotNull(e);

        PaymentClassification p = e.getPayClassification();
        Assert.assertNotNull(p);

        HourlyClassification h = (HourlyClassification) p;
        Assert.assertNotNull(h);

        Assert.assertEquals(25.50, h.getHoursSalary(), 0.001);
        PaymentSchedule ps = e.getPaySchedule();

        WeeklyPaymentSchedule w = (WeeklyPaymentSchedule) ps;
        Assert.assertNotNull(w);
    }

    @Test
    public void ChangeToSalaried()
    {
        int EmpID = 3;
        AddCommissionEmployee t = new AddCommissionEmployee(EmpID, "Didier", "Home", 1700, 3.0);
        t.execute();

        ChangeSalaried tct = new ChangeSalaried(EmpID, 2000.00);
        tct.execute();

        Employee e = Context.employeeGateway.getEmployee(EmpID);
        Assert.assertNotNull(e);

        PaymentClassification p = e.getPayClassification();
        Assert.assertNotNull(p);

        SalariedClassification h = (SalariedClassification) p;
        Assert.assertNotNull(h);

        Assert.assertEquals(2000, h.getSalary(), 0.001);
        PaymentSchedule ps = e.getPaySchedule();

        MonthlyPaymentySchedule w = (MonthlyPaymentySchedule) ps;
        Assert.assertNotNull(w);

    }

    @Test
    public void ChangeToCommission()
    {
        int EmpID = 3;
        AddSalariedEmployee t = new AddSalariedEmployee(EmpID, "Didier", "Home", 1700);
        t.execute();

        ChangeCommissioned tct = new ChangeCommissioned(EmpID, 1700.00, 25.50);
        tct.execute();

        Employee e = Context.employeeGateway.getEmployee(EmpID);
        Assert.assertNotNull(e);

        PaymentClassification p = e.getPayClassification();
        Assert.assertNotNull(p);

        CommissionedClassification h = (CommissionedClassification) p;
        Assert.assertNotNull(h);

        Assert.assertEquals(25.50, h.getCommission(), 0.001);
        PaymentSchedule ps = e.getPaySchedule();

        TwoWeeksPaymentSchedule w = (TwoWeeksPaymentSchedule) ps;
        Assert.assertNotNull(w);

    }

    @Test
    public void ChangeToMail()
    {
        int empId = 1;
        AddSalariedEmployee t = new AddSalariedEmployee(empId, "JANE", "Home", 900);
        t.execute();
        ChangeMail cmt = new ChangeMail(empId, "Mail");
        cmt.execute();
        Employee e = Context.employeeGateway.getEmployee(empId);
        Assert.assertNotNull(e);
        PaymentMethod pm = e.getPayMethod();
        MailMethod mm = (MailMethod) pm;
        Assert.assertNotNull(mm);
        Assert.assertEquals("Mail", mm.getMail());
    }

    @Test
    public void ChangeToDirect()
    {
        int empId = 1;
        AddSalariedEmployee t = new AddSalariedEmployee(empId, "JANE", "Home", 900);
        t.execute();

        ChangeDirect cmt = new ChangeDirect(empId, "BNP", "BE 2405");
        cmt.execute();

        Employee e = Context.employeeGateway.getEmployee(empId);
        Assert.assertNotNull(e);

        PaymentMethod pm = e.getPayMethod();
        DirectDepositMethod mm = (DirectDepositMethod) pm;
        Assert.assertNotNull(mm);

        Assert.assertEquals("BNP", mm.getBank());
        Assert.assertEquals("BE 2405", mm.getBICaccount());
    }




}
