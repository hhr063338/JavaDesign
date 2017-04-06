package design.pattern.create.c03_StaticMethodFactory;

public class MailSender implements Sender{

	@Override
	public void send() {
		 System.out.println("this is mailsender!");  		
	}

	
}
