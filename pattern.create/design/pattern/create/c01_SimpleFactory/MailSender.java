package design.pattern.create.c01_SimpleFactory;

public class MailSender implements Sender{

	@Override
	public void send() {
		 System.out.println("this is mailsender!");  		
	}

	
}
