package factorymethod;

public class Client {

	public static void main(String[] args) {
		Product a = new FactoryA().create();
		Product b = new FactoryB().create();
		
		a.run();
		b.run();

	}

}
