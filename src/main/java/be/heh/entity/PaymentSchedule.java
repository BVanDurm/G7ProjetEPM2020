package be.heh.entity;

import java.util.Calendar;

public interface PaymentSchedule {
    public String choiceDate();

    boolean isPayday(Calendar date);
    Calendar getPayStart(Calendar PayEnd);
}
