package Chain;



//设置不同的经理的等级以及处理操作
class Zongjingli extends Leader{
	private final String name = "总经理";
	private final int level = 0;//max
	
	@Override
	void process(File file) {
		if(this.level > file.getLevel()) {
			System.out.println(name + "未处理文件《" + file.getFileName() + "》");
			getNextLeader().process(file);
		}
		else {
			System.out.println(name + "处理了文件《" + file.getFileName() + "》");
		}
		// TODO Auto-generated method stub
		
	}
	
}


class Fujingli extends Leader{
	private final String name = "副经理";
	private final int level = 1;//max
	
	@Override
	void process(File file) {
		if(this.level > file.getLevel()) {
			System.out.println(name + "未处理文件《" + file.getFileName() + "》");
			getNextLeader().process(file);
		}
		else {
			System.out.println(name + "处理了文件《" + file.getFileName() + "》");
		}
		// TODO Auto-generated method stub
		
	}
	
}


class Bumenjingli extends Leader{
	private final String name = "部门经理";
	private final int level = 2;//max
	
	@Override
	void process(File file) {
		if(this.level > file.getLevel()) {
			System.out.println(name + "未处理文件《" + file.getFileName() + "》");
			getNextLeader().process(file);
		}
		else {
			System.out.println(name + "处理了文件《" + file.getFileName() + "》");
		}
		// TODO Auto-generated method stub
		
	}
	
}