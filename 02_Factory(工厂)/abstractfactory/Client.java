package abstractfactory;

public class Client {

	public static void main(String[] args) {
		Factory factory1 = new Factory1();
		ProductA a1 = factory1.createA();
		a1.run();
		ProductB b1 = factory1.createB();
		b1.run();
		
		Factory factory2 = new Factory2();
		ProductA a2 = factory2.createA();
		a2.run();
		ProductB b2 = factory2.createB();
		b2.run();

	}

}
