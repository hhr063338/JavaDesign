package design.pattern.create.c02_MethodFactory;

public class MailSender implements Sender{

	@Override
	public void send() {
		 System.out.println("this is mailsender!");  		
	}

	
}
