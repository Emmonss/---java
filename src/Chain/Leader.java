package Chain;


//�����ܳ����࣬��������һ��
abstract class Leader {
	private Leader nextLeader;
	
	public Leader getNextLeader() {
		return this.nextLeader;
	}
	
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	abstract void process(File file);
}
