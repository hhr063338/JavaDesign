package design.pattern.create.c03_StaticMethodFactory;

/**
 * 工厂类
 * @author Administrator
 *
 */
public class SendFactory {
	
	/**
	 * 返回一个有效邮箱实例
	 * @return
	 */
    public static Sender produceMail(){  
        return new MailSender();  
    }  
    
    /***
     * 返回一个短信供应商实例
     * @return
     */
    public static Sender produceSms(){  
        return new SmsSender();  
    }  
}
