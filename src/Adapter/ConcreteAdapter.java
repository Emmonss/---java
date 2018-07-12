package Adapter;


//适配接口的实现
class ConcreteAdapter extends Adaptee implements Adapter{

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		SpecificRequest();
	}

}
