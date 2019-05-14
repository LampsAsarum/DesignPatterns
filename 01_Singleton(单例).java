package DesignPatterns;

import javax.management.RuntimeErrorException;

/*
 * 单例模式
 * 饿汉式
 */
public class Singleton {
	
	//类初始化时，立即加载这个对象（没有延时加载的优势）
	//加载类时，天然的线程安全。
	private static Singleton instance = new Singleton();
	
	private Singleton() {}//私有化构造器
	
	//方法没有同步，调用效率高。
	public static Singleton getInstance() {
		return instance;
	}

}

/*
 * 懒汉式
 */
class Singleton2 {
	
	//类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）
	private static Singleton2 instance = null;
	
	private Singleton2() {
		//可能会因为反射的原因出现问题。但一般不用考虑
		/*if(instance != null) {
			throw new RuntimeException();
		}*/
	}
	
	//方法没有同步，调用效率高。
	public static synchronized Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
	
}

/*
 * 双重检查锁
 */
//synchronized代表这个方法加锁
//在C++中，我经常使用双重if判断来写。但在java里由于编译器优化和JVM底层内部模型原因，
//偶尔会出现问题，所以不建议使用
class Singleton3 {
	
	private static Singleton3 instance = null;
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		if (instance == null) 
		{
			Singleton3 sc;
			synchronized (Singleton3.class) 
			{
				sc = instance;
				if (sc == null) 
				{
					synchronized (Singleton3.class) 
					{
						if(sc == null) 
						{
							sc = new Singleton3();
						}
					}
					instance = sc;
				}
			}
		}
		return instance;
	}
}

/*
 * 静态内部类实现方式（最好的方法）
 */
//外部类没有static属性，不会像饿汉式立即加载对象。
//只有调用了getInstance方法，才会加载静态内部类。加载类时时线程安全的。
//兼备了并发高效调用和延迟加载的优势
class Singlenton4{
	private Singlenton4() {
	}
	
	private static class SinglentonClassInstance{
		//static final保证了内存只有一个实例，并且只能赋值一次。
		private static final Singlenton4 instance = new Singlenton4();
	}
	
	public static Singlenton4 getInstance() {
		return SinglentonClassInstance.instance;
	}
}
