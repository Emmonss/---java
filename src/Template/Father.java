package Template;


//��������࣬������һ���ǳ������ʵ�֣������������ֳ����������ʵ��
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
