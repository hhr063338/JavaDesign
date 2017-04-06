package design.pattern.create.c01_SimpleFactory;

/**
 * 工厂类
 * @author Administrator
 *
 */
public class SendFactory {
	
 
	/**
	 * 生成Sender接口的实例
	 * @param type
	 * @return
	 */
	public Sender produce(String type) {  
        if ("mail".equals(type)) {  
            return new MailSender();  
        } else if ("sms".equals(type)) {  
            return new SmsSender();  
        } else {  
            System.out.println("请输入正确的类型!");  
            return null;  
        }  
	}
}
