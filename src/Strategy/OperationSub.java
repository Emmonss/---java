package Strategy;


//不同的类实现接口函数完成不同的功能
public class OperationSub implements NumStratege{

	@Override
	public int operation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

}
