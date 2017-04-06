package design.pattern.create.c02_MethodFactory;

/**
 * 工厂类
 * @author Administrator
 *
 */
public class SendFactory {
	
 
	   public Sender produceMail(){  
	        return new MailSender();  
	    }  
	      
	    public Sender produceSms(){  
	        return new SmsSender();  
	    } 
}
