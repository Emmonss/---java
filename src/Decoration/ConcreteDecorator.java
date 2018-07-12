package Decoration;


//构造类子类，实现方法
public class ConcreteDecorator extends Decorator{
	public ConcreteDecorator(Component cpt) {
		super(cpt);
	}
	
	public void fuckyou() {
		System.out.println("Fuckyou Decoration");
		this.cpt.fuckyou();
		
	}
}
