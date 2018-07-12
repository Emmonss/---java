package Observer;

public class ConcreteObserver implements Observer {

	private String name;
	private String message;
	
	public ConcreteObserver(String name) {
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		this.message = message;
		read();
		
	}
	
	public void read() {
		System.out.println(name+"收到了推送消息" + message);
	}
	
}
