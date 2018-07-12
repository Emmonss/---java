package CarFactory;

public class Car4Wheel extends CarBuilder{
	
	public void buildEngine() {
		super.car.setEngine("Engine 4");
	}

	@Override
	public void buildSteer() {
		// TODO Auto-generated method stub
		car.setSteer("Steer 4");
	}

	@Override
	public void buildWheel() {
		// TODO Auto-generated method stub
		car.setWheel(4);
	}
	
}
