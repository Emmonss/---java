package Template;


//父类抽象类，定义了一个非抽象类的实现，定义了三个字抽象类给子类实现
public abstract class Father {
	protected void Function() {
		ing();
		preparation();
		doing();
		AtLast();
	}
	
	public void ing() {
		System.out.println("Father love you !");
	}
	
	public abstract void preparation();
	
	public abstract void doing();
	
	public abstract void AtLast();
}
