package HelloJava;

public class Main {

	public static void main(String[] args) {

		MailSender mailSender = new MailSender(new Gmail());
		mailSender.Send("ahmetegin@gmail.com");
		MailSender mailSender2 = new MailSender(new Hotmail());
		mailSender2.Send("ahmetegin@hotmail.com");
	}

}

class MailSender {
	private IMailService mailService;
	public MailSender(IMailService mailService) {
		this.mailService = mailService;
	}
	public void Send(String to) {
		mailService.Send(to);
	}

}

interface IMailService {
	void Send(String to);
}

class Gmail implements IMailService {
	@Override
	public void Send(String to) {
		System.out.println("Gmail ile mail gönderildi" + to);
	}
}

class Hotmail implements IMailService {
	@Override
	public void Send(String to) {
		System.out.println("Hotmail ile mail gönderildi " + to);

	}
}
class Yandex implements IMailService{

	@Override
	public void Send(String to) {
		
		
	}
	
}
