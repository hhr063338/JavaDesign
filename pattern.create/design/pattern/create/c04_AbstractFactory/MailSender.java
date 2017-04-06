package design.pattern.create.c04_AbstractFactory;

public class MailSender implements Sender{

	@Override
	public void send() {
		 System.out.println("this is mailsender!");  		
	}

	
}
