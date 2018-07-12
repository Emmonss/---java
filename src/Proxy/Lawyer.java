package Proxy;

//律师，代理类
class Lawyer implements People{

	@Override
	public void SaySth() {
		// TODO Auto-generated method stub
		System.out.println("我的代理人说：");
		new Plaintiff().SaySth();
	}

}
