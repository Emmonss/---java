package Template;


//子类实现父类所定义的三个抽象类
public class Son1 extends Father{

	@Override
	public void preparation() {
		// TODO Auto-generated method stub
		System.out.println("Son1 1");
	}

	@Override
	public void doing() {
		// TODO Auto-generated method stub
		System.out.println("Son1 2");
	}

	@Override
	public void AtLast() {
		// TODO Auto-generated method stub
		System.out.println("Son1 3");
	}

}
