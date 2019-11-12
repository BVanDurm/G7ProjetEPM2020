package be.heh.entity;

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

    public String getBank()
    {
        return bank;
    }

    public String getBICaccount()
    {
        return BICaccount;
    }
}
