package be.heh.entity;

import be.heh.entity.PaymentMethod;

public class DirectDepositMethod implements PaymentMethod {
    public String BICaccount;
    public String bank;

    public DirectDepositMethod(String bank, String BICaccount) {
        this.bank = bank;
        this.BICaccount= BICaccount;
    }

    @Override
    public String toString() {
        return "direct deposit into " + bank + " : " + BICaccount;
    }
}
