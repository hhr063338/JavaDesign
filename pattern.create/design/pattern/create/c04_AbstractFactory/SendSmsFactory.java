package design.pattern.create.c04_AbstractFactory;

public class SendSmsFactory implements Provider{

	@Override
	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();  
	}

	
}
