package builder;

public interface CarBuilder {

	Shelf builderShelf();
	Tire builderTire();
}

class XzxCarBuilder implements CarBuilder{
	
	public Shelf builderShelf() {
		System.out.println("构建架子");
		return new Shelf("架子");
	}
	
	public Tire builderTire() {
		System.out.println("构建轮子");
		return new Tire("轮子");
	}

}