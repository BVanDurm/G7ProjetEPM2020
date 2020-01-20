package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.CashMethod;
import be.heh.EPMG7.entity.PaymentMethod;

public class ChgEmpCash extends ChgEmpPayementMethod {

    public ChgEmpCash(int EmpId) {
        super(EmpId);
    }

    @Override
    public PaymentMethod makePayementMethod() {
        return new CashMethod();
    }
}
