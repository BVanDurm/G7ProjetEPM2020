package be.heh.entity;

public class MailMethod implements PaymentMethod {
	private String mail;

	public MailMethod(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "mail : " + mail;
	}

	public String getMail()
	{
		return mail;
	}
}