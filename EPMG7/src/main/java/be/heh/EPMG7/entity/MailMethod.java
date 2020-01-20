package be.heh.EPMG7.entity;

public class MailMethod implements PaymentMethod {

    private String Mail;

    public MailMethod(String mail) {
        this.Mail = mail;
    }

    public String getMail() {
        return Mail;
    }

    @Override
    public void pay(PayCheck pc) {
        pc.setField("Disposition", "Mail");
    }

    @Override
    public String toString() {
        return "mail : toto@gmail.com";
    }
}
