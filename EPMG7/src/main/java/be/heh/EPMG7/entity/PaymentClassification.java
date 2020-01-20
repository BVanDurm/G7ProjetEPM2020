package be.heh.EPMG7.entity;

import java.util.Calendar;

public interface PaymentClassification {

    double calculationPay(PayCheck pc);

    static boolean isInPayPeriod(Calendar date, PayCheck payCheck) {
        Calendar payPeriodStart = payCheck.getPayPeriodStart();
        Calendar payPeriodEnd = payCheck.getPayPeriodEndDate();
        return date.equals(payPeriodEnd) || date.equals(payPeriodStart) ||
                (date.after(payPeriodStart) && date.before(payPeriodEnd));
    }
}
