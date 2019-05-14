package builder;

public interface CarBuilder {

	Shelf builderShelf();
	Tire builderTire();
}

class XzxCarBuilder implements CarBuilder{
	
	public Shelf builderShelf() {
		System.out.println("��������");
		return new Shelf("����");
	}
	
	public Tire builderTire() {
		System.out.println("��������");
		return new Tire("����");
	}

}