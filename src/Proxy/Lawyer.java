package Proxy;

//��ʦ��������
class Lawyer implements People{

	@Override
	public void SaySth() {
		// TODO Auto-generated method stub
		System.out.println("�ҵĴ�����˵��");
		new Plaintiff().SaySth();
	}

}
