package CarFactory;


//Ä¿±êÀà
public class Car {
	private String engine;
	private String Steer;
	private int Wheel;
	
	Car(){}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	public void setSteer(String Steer) {
		this.Steer = Steer;
	}
	
	public void setWheel(int Wheel) {
		this.Wheel = Wheel;
	}
	
	public String getEngine() {
		return this.engine;
	}
	
	public String getSteer() {
		return this.Steer;
	}
	
	public int getwheel() {
		return this.Wheel;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", Steer=" + Steer + ", Wheel=" + Wheel + "]";
	}

	
}
