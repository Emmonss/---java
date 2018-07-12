package CarFactory;


//接口，一共四个功能
public interface Builder {
	public void buildEngine();
	public Car getCar();
	public void buildSteer();
	public void buildWheel();
}
