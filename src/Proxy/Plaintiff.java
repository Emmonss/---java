package Proxy;

//原告，被代理类
class Plaintiff implements People{
	
	void doingsth() {
		System.out.println("你是猪");
	}
	
	private void fuck() {
		System.out.println("我被人打了");
	}
		
	@Override
	public void SaySth() {
		// TODO Auto-generated method stub
		fuck();
		System.out.println("我现在无可奉告");
	}
	
}
