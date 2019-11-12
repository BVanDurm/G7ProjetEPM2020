package be.heh.usecase;

import be.heh.entity.MailMethod;
import be.heh.entity.PaymentMethod;

public class ChangeMail extends ChangeTransaction{

    private String Address;

    public ChangeMail(int id, String address) {
        super(id);
        this.Address = address;
    }

    @Override
    public PaymentMethod getMethod() {
        return new MailMethod(Address);
    }

}
