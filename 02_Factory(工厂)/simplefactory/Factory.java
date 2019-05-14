package simplefactory;

public class Factory {
	
	public static Product createA() {
		return new ProductA();
	}
	
	public static Product createB() {
		return new ProductB();
	}
}
