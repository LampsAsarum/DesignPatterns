package simplefactory;

public class Client {

	public static void main(String[] args) {
		Product a = Factory.createA();
		Product b = Factory.createB();
		
		a.run();
		b.run();

	}

}


