package abstractfactory;

public interface ProductA {

	void run();
}

class ProductA_1 implements ProductA{
	
	public void run() {
		System.out.println("i have ProductA_1");
	}
}

class ProductA_2 implements ProductA{
	
	public void run() {
		System.out.println("i have ProductA_2");
	}
}

