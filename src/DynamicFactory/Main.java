package DynamicFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory fuck = new Factory();
		 Fruit f = fuck.getInstance("Orange");
	     f.eat();
	}

}
