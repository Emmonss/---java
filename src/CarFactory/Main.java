package CarFactory;

/*
 * Builder 模式
 * */

public class Main {
	public static void main(String[] args) {
		//调用不同的子类完成目标类的闯将
		Car car4 = (new Car4Wheel()).getCar();
		Car car2 = (new Car2wheel()).getCar();
		
		System.out.println(car4);
		System.out.println(car2);
		
	}

}
