package be.heh.EPMG7.entity;

public class CashMethod implements PaymentMethod {

    @Override
    public void pay(PayCheck pc) {
        pc.setField("Disposition", "Hold");
    }
}
