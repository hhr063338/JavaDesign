package design.pattern.create.c01_SimpleFactory;

public class TestSimpleFactory {
	
	/**
	 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
	 * @param args
	 */
    public static void main(String[] args) {  
        SendFactory factory = new SendFactory();  
        Sender sender = factory.produce("sms");  
        sender.send();  
    }  
}
