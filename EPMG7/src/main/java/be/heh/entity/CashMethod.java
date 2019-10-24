package be.heh.entity;

import be.heh.entity.PaymentMethod;

public class CashMethod implements PaymentMethod {
    @Override
    public String toString() {
        return "Payement en cash";
    }
}