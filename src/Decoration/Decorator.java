package Decoration;


//装饰类，狗仔方法传入接口实现对象
public class Decorator implements Component{
	
	public Component cpt;
	
	public Decorator(Component cpt) {
		this.cpt = cpt;
	}
		
	@Override
	public void fuckyou() {
		// TODO Auto-generated method stub
		this.cpt.fuckyou();
	}

}
