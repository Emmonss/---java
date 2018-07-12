package Strcuct;

public class SuperClass {
	static int a = printInit("super class:static var init",1);
	int b = printInit("super class: var init",1);
	
	static {
		System.out.println("super class:static block init");
	}
	
	{
		System.out.println("super class: block init");
	}
	
	public SuperClass() {
		System.out.println("super class:Construct init");
	}
	
	static int printInit(String str,int i) {
		System.out.println(str);
		return i;
	}

	@Override
	public String toString() {
		return this.getClass().getName();
	}
	
	
	
}
