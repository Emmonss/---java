package Strategy;

/*
 * Strategy	����ģʽ
 * */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new�������ʱ���벻ͬ�Ľӿ�ʵ�������ʵ�ֲ�ͬ�Ĺ���
		Operation op = new Operation(new OperationPlus());
		System.out.println("10+5= "+ op.exeStrategy(10, 5));
		
		op = new Operation(new OperationSub());
		System.out.println("10-5= "+ op.exeStrategy(10, 5));
		
		op = new Operation(new OperationMuti());
		System.out.println("10*5= "+ op.exeStrategy(10, 5));
	}

}
