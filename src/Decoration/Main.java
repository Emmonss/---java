package Decoration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component cpt = new ConcreteDecorator(new ConceretComponent());
		cpt.fuckyou();
		
		cpt = new ConcreteDecorator(new ConcretComponent2());
		cpt.fuckyou();
	}

}
