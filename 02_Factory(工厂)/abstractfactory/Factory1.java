package abstractfactory;

public class Factory1 implements Factory {

	public ProductA createA() {
		return new ProductA_1();
	}
	
	public ProductB createB() {
		return new ProductB_1();
	}
}
