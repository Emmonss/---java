package Strategy;

/*
 * Strategy	策略模式
 * */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new主类对象时传入不同的接口实现类对象，实现不同的功能
		Operation op = new Operation(new OperationPlus());
		System.out.println("10+5= "+ op.exeStrategy(10, 5));
		
		op = new Operation(new OperationSub());
		System.out.println("10-5= "+ op.exeStrategy(10, 5));
		
		op = new Operation(new OperationMuti());
		System.out.println("10*5= "+ op.exeStrategy(10, 5));
	}

}
