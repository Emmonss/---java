package CarFactory;

/*
 * Builder ģʽ
 * */

public class Main {
	public static void main(String[] args) {
		//���ò�ͬ���������Ŀ����Ĵ���
		Car car4 = (new Car4Wheel()).getCar();
		Car car2 = (new Car2wheel()).getCar();
		
		System.out.println(car4);
		System.out.println(car2);
		
	}

}
