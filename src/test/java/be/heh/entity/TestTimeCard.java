package be.heh.entity;

import be.heh.Context;
import be.heh.usecase.AddHourlyEmployee;
import be.heh.usecase.TimeCardTransaction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestTimeCard {

    @Before
    public void setup()
    {
        TestSetup.setupContext();
    }

    @Test
    public void testTimeCardTransaction() {
        int empID = 2;

        AddHourlyEmployee t = new AddHourlyEmployee(empID, "Bill", "Home", 15.25);
        t.execute();

        Calendar date = new GregorianCalendar(2001, Calendar.NOVEMBER, 9);

        TimeCardTransaction tct = new TimeCardTransaction(empID, date, 8.0);
        tct.execute();

        Employee e = Context.employeeGateway.getEmployee(empID);
        assertNotNull(e);

        Assert.assertNotNull(t);

        PaymentClassification pc = e.getPayClassification();
        assertTrue(pc instanceof HourlyClassification);

        HourlyClassification hc = (HourlyClassification) e.getPayClassification();
        Assert.assertNotNull(pc);
        TimeCard tc = hc.getTimeCard(date);
        Assert.assertEquals(8.0, tc.getHours(), 0.001);
    }
}
