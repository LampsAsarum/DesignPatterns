package factorymethod;

public class FactoryB implements Factory{

	public Product create() {
		return new ProductB();
	}
}
