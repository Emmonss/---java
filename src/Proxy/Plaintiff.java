package Proxy;

//ԭ�棬��������
class Plaintiff implements People{
	
	void doingsth() {
		System.out.println("������");
	}
	
	private void fuck() {
		System.out.println("�ұ��˴���");
	}
		
	@Override
	public void SaySth() {
		// TODO Auto-generated method stub
		fuck();
		System.out.println("�������޿ɷ��");
	}
	
}
