package design.pattern.create.c05_Singleton;

public class TestSingleton {

	
	/**
	 * 输出毫秒差
	 * @param busiName  操作名称
	 * @param startTime	开始时间
	 * @param endTime	结束时间
	 */
    public static void  takeHow(String busiName,long startTime,long endTime){
    	System.out.println("此次 【"+busiName+"】共花费"+(endTime-startTime)+"毫秒");
    	
    }
    
	/***
	 * 单例模式-线程不安全
	 * 在并发环境中测试，是否能维持单例模式
	 */
	public static void testSinglton(){
		
		System.out.println("[执行方法testSinglton]开始:");
		long times=System.currentTimeMillis();
		for(int i=0;i<50;i++){
			Thread one = new Thread(new Runnable() {			
				@Override
				public void run() {	
					//像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，肯定就会出现问题
					Singleton demo=	Singleton.getInstance();
				}
			});
			one.start();
 
		}
		takeHow("操作", times, System.currentTimeMillis());
		System.out.println("[执行方法testSinglton]结束:");
		
	}
	
	/***
	 * 单例模式-同步方法
	 * 在并发环境中测试，是否能维持单例模式
	 */
	public static void testSinglton2(){
		
		System.out.println("[执行方法testSinglton2]开始:");
		long times=System.currentTimeMillis();
		for(int i=0;i<50;i++){
			Thread one = new Thread(new Runnable() {			
				@Override
				public void run() {	
					//像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，肯定就会出现问题
					Singleton2 demo=Singleton2.getInstance();
				}
			});
			one.start(); 
		}
		takeHow("操作", times, System.currentTimeMillis());
		System.out.println("[执行方法testSinglton2]结束:");
		
	}
	
	/***
	 * 单例模式-同步对象
	 * 在并发环境中测试，是否能维持单例模式
	 */
	public static void testSinglton3(){
		
		System.out.println("[执行方法testSinglton3]开始:");
		long times=System.currentTimeMillis();
		for(int i=0;i<50;i++){
			Thread one = new Thread(new Runnable() {			
				@Override
				public void run() {	
					//像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，肯定就会出现问题
					Singleton3.getInstance();

				}
			});
			one.start(); 
		}
		takeHow("操作", times, System.currentTimeMillis());
		System.out.println("[执行方法testSinglton3]结束:");
		
	}
	public static void main(String[] args) {
	
		testSinglton();
		
		testSinglton2();

		testSinglton3();
		

	}
}
