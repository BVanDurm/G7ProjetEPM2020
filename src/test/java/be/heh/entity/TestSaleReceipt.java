package be.heh.entity;

import be.heh.Context;
import be.heh.usecase.AddCommissionEmployee;
import be.heh.usecase.SaleReceiptTransaction;
import be.heh.usecase.TimeCardTransaction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestSaleReceipt {
    @Before
    public void setup()
    {
        TestSetup.setupContext();
    }

    @Test
    public void testTimeCardTransaction() {
        int empID = 2;

        AddCommissionEmployee t = new AddCommissionEmployee(empID, "Bill", "Home", 1500.0,50.0);
        t.execute();

        Calendar date = new GregorianCalendar(2001, Calendar.NOVEMBER, 9);

        SaleReceiptTransaction srt = new SaleReceiptTransaction(empID, date, 8.0);
        srt.execute();

        Employee e = Context.employeeGateway.getEmployee(empID);
        assertNotNull(e);

        Assert.assertNotNull(t);

        PaymentClassification pc = e.getPayClassification();
        assertTrue(pc instanceof CommissionedClassification);

        CommissionedClassification cc = (CommissionedClassification) e.getPayClassification();
        Assert.assertNotNull(pc);
        SaleReceipt tc = cc.getSalesReceipt(date);
        Assert.assertEquals(8.0, tc.getSaleAmount(), 0.001);
    }
}
