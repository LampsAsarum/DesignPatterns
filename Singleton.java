package DesignPatterns;

import javax.management.RuntimeErrorException;

/*
 * ����ģʽ
 * ����ʽ
 */
public class Singleton {
	
	//���ʼ��ʱ�����������������û����ʱ���ص����ƣ�
	//������ʱ����Ȼ���̰߳�ȫ��
	private static Singleton instance = new Singleton();
	
	private Singleton() {}//˽�л�������
	
	//����û��ͬ��������Ч�ʸߡ�
	public static Singleton getInstance() {
		return instance;
	}

}

/*
 * ����ʽ
 */
class Singleton2 {
	
	//���ʼ��ʱ������ʼ�����������ʱ���أ������õ�ʱ���ٴ�����
	private static Singleton2 instance = null;
	
	private Singleton2() {
		//���ܻ���Ϊ�����ԭ��������⡣��һ�㲻�ÿ���
		/*if(instance != null) {
			throw new RuntimeException();
		}*/
	}
	
	//����û��ͬ��������Ч�ʸߡ�
	public static synchronized Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
	
}

/*
 * ˫�ؼ����
 */
//synchronized���������������
//��C++�У��Ҿ���ʹ��˫��if�ж���д������java�����ڱ������Ż���JVM�ײ��ڲ�ģ��ԭ��
//ż����������⣬���Բ�����ʹ��
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
 * ��̬�ڲ���ʵ�ַ�ʽ����õķ�����
 */
//�ⲿ��û��static���ԣ����������ʽ�������ض���
//ֻ�е�����getInstance�������Ż���ؾ�̬�ڲ��ࡣ������ʱʱ�̰߳�ȫ�ġ�
//�汸�˲�����Ч���ú��ӳټ��ص�����
class Singlenton4{
	private Singlenton4() {
	}
	
	private static class SinglentonClassInstance{
		//static final��֤���ڴ�ֻ��һ��ʵ��������ֻ�ܸ�ֵһ�Ρ�
		private static final Singlenton4 instance = new Singlenton4();
	}
	
	public static Singlenton4 getInstance() {
		return SinglentonClassInstance.instance;
	}
}
