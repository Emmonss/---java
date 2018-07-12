package Strategy;

//构造函数中传入接口实现类对象，完成同一接口不同的函数实现
public class Operation {
	private NumStratege strategy;
	
	public Operation(NumStratege oo1) {
		this.strategy = oo1;
	}
	
	public int exeStrategy(int num1, int num2) {
		return this.strategy.operation(num1, num2);
	}

}
