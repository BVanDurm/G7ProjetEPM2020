package be.heh.EPMG7.usecase;

import be.heh.EPMG7.entity.MailMethod;
import be.heh.EPMG7.entity.PaymentMethod;

public class ChgEmpMail extends ChgEmpPayementMethod {

    private String Mail;

    public ChgEmpMail(int empId, String mail) {
        super(empId);
        this.Mail = mail;
    }

    @Override
    public PaymentMethod makePayementMethod() {
        return new MailMethod(Mail);
    }
}
