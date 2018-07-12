package Strcuct;

//父类子类静态非静态创建熟悉怒

public class SubClass extends SuperClass{
	static int c = printInit("Sub class:static var init",1);
	int d = printInit("Sub class: var init",1);
	
	static {
		System.out.println("Sub class:static block init");
	}
	
	{
		System.out.println("Sub class: block init");
	}
	
	public SubClass() {
		System.out.println("Sub class:Construct init");
	}
	
	
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		System.out.println(sub);
		// 1:super class:static var init.
				// 2:super class:static block init.
				// 3:sub class:static var init.
				// 4:sub class:static block init.
				// 5:super class:var init.
				// 6:super class:block init.
				// 7:super class:constructor init.
				// 8:sub class:var init.
				// 9:sub class:block init.
				// 10:sub class:constructor init.
	}

}
