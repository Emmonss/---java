package Chain;



//���ò�ͬ�ľ���ĵȼ��Լ��������
class Zongjingli extends Leader{
	private final String name = "�ܾ���";
	private final int level = 0;//max
	
	@Override
	void process(File file) {
		if(this.level > file.getLevel()) {
			System.out.println(name + "δ�����ļ���" + file.getFileName() + "��");
			getNextLeader().process(file);
		}
		else {
			System.out.println(name + "�������ļ���" + file.getFileName() + "��");
		}
		// TODO Auto-generated method stub
		
	}
	
}


class Fujingli extends Leader{
	private final String name = "������";
	private final int level = 1;//max
	
	@Override
	void process(File file) {
		if(this.level > file.getLevel()) {
			System.out.println(name + "δ�����ļ���" + file.getFileName() + "��");
			getNextLeader().process(file);
		}
		else {
			System.out.println(name + "�������ļ���" + file.getFileName() + "��");
		}
		// TODO Auto-generated method stub
		
	}
	
}


class Bumenjingli extends Leader{
	private final String name = "���ž���";
	private final int level = 2;//max
	
	@Override
	void process(File file) {
		if(this.level > file.getLevel()) {
			System.out.println(name + "δ�����ļ���" + file.getFileName() + "��");
			getNextLeader().process(file);
		}
		else {
			System.out.println(name + "�������ļ���" + file.getFileName() + "��");
		}
		// TODO Auto-generated method stub
		
	}
	
}