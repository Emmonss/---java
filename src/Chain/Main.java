package Chain;

public class Main {
	public static void main(String[] args) {
		Leader zongjingli = new Zongjingli();
		Leader fujingli = new Fujingli();
		Leader bumenjingli = new Bumenjingli();
		bumenjingli.setNextLeader(fujingli);
		fujingli.setNextLeader(zongjingli);
		
		File f1 = new File();
		f1.setFileName("��Ҫ�������");
		f1.setLevel(1);
		File f2 = new File();
		f2.setFileName("������������");
		f2.setLevel(0);
		
		bumenjingli.process(f1);
		bumenjingli.process(f2);
		
	}
}
