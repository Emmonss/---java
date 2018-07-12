package CarFactory;

public abstract class CarBuilder implements Builder{
	protected Car car;
	
	//构造函数完成接口的目标类对象创建，剩下的由子类搞定
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
