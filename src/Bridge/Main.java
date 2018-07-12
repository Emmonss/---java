package Bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TargetA ta = new FunctionA2();
		ta.fb = new FunctionB3();
		ta.targetA();
		ta.fb.USB();
	}

}
