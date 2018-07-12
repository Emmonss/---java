package CarFactory;

//子类，实现父类实现剩下的的声明过的方法
public class Car2wheel extends CarBuilder{

	public void buildEngine() {
		car.setEngine("Engine 2");
	}

	@Override
	public void buildSteer() {
		// TODO Auto-generated method stub
		car.setSteer("Steer 2");	
	}

	@Override
	public void buildWheel() {
		// TODO Auto-generated method stub
		car.setWheel(2);
	}

}
