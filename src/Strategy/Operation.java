package Strategy;

//���캯���д���ӿ�ʵ����������ͬһ�ӿڲ�ͬ�ĺ���ʵ��
public class Operation {
	private NumStratege strategy;
	
	public Operation(NumStratege oo1) {
		this.strategy = oo1;
	}
	
	public int exeStrategy(int num1, int num2) {
		return this.strategy.operation(num1, num2);
	}

}
