package be.heh.usecase;

import be.heh.entity.CashMethod;
import be.heh.entity.PaymentMethod;

public class ChangeHold extends ChangeTransaction{
    public ChangeHold(int id) {
        super(id);
    }

    @Override
    public PaymentMethod getMethod() {
        return new CashMethod();
    }
}
