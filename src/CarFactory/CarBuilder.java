package CarFactory;

public abstract class CarBuilder implements Builder{
	protected Car car;
	
	//���캯����ɽӿڵ�Ŀ������󴴽���ʣ�µ�������㶨
	public CarBuilder() {
		car = new Car();
		buildEngine();
		buildSteer();
		buildWheel();	
	}
	
	public Car getCar() {
		return car;
	}
}
