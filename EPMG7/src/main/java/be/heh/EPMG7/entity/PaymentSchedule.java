package be.heh.EPMG7.entity;

import java.util.Calendar;

public interface PaymentSchedule {

    boolean isPayday(Calendar date);
    Calendar getPayPeriodStartDate(Calendar payPeriodEndDate);
}
