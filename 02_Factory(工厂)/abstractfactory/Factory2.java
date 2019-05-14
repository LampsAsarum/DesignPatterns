package abstractfactory;

public class Factory2 implements Factory {

	public ProductA createA() {
		return new ProductA_2();
	}
	
	public ProductB createB() {
		return new ProductB_2();
	}
}

