package builder;

public interface CarDirector {

	Car directCar();
}

class XzxCarDirector implements CarDirector{
	private CarBuilder builder;
	
	public XzxCarDirector(CarBuilder builder) {
		this.builder = builder;
	}
	
	public Car directCar() {
		Shelf s = builder.builderShelf();
		Tire t = builder.builderTire();
		
		//װ���Car
		Car car = new Car();
		car.setShelf(s);
		car.setTire(t);
		
		return car;
	}
}
