package design.pattern.create.c04_AbstractFactory;

public interface Provider {
	/**
	 * 生产实例
	 * @return
	 */
	public Sender produce();
}
