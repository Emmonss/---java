package Decoration;


//���������࣬ʵ�ַ���
public class ConcreteDecorator extends Decorator{
	public ConcreteDecorator(Component cpt) {
		super(cpt);
	}
	
	public void fuckyou() {
		System.out.println("Fuckyou Decoration");
		this.cpt.fuckyou();
		
	}
}
