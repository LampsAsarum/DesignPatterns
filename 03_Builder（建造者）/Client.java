package builder;

public class Client {

	public static void main(String[] args) {
		CarDirector director = new XzxCarDirector(new XzxCarBuilder());
		
		Car car = director.directCar();
		
		System.out.println(car.getTire().getName());
		
		System.out.println(car.getShelf().getName());
		
		car.launch();

	}

}
