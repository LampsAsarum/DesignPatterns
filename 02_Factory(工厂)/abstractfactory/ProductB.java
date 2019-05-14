package abstractfactory;

public interface ProductB {

	void run();
}

class ProductB_1 implements ProductB{
	
	public void run() {
		System.out.println("i have ProductB_1");
	}
}

class ProductB_2 implements ProductB{
	
	public void run() {
		System.out.println("i have ProductB_2");
	}
}
