package design.pattern.create.c03_StaticMethodFactory;

/***
 * 短信实现类
 * @author Administrator
 *
 */
public class SmsSender implements Sender{

	@Override
	public void send() {
		 System.out.println("this is sms sender!");  		
	}

	
}
