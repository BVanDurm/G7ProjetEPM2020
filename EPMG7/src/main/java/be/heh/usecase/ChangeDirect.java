package be.heh.usecase;

import be.heh.entity.CashMethod;
import be.heh.entity.DirectDepositMethod;
import be.heh.entity.PaymentMethod;

public class ChangeDirect extends ChangeTransaction{

    private String Bank;
    private String Account;

    public ChangeDirect(int id, String bank, String account) {

        super(id);
        this.Bank = bank;
        this.Account = account;
    }

    @Override
    public PaymentMethod getMethod() {
        return new DirectDepositMethod(Bank, Account);
    }
}
