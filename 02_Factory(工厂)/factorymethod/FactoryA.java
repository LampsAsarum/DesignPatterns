package factorymethod;

public class FactoryA implements Factory{

	public Product  create() {
		return new ProductA();
	}
}
