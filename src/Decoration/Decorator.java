package Decoration;


//װ���࣬���з�������ӿ�ʵ�ֶ���
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
