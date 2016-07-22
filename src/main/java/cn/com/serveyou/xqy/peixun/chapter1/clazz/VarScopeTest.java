package cn.com.serveyou.xqy.peixun.chapter1.clazz;

public class VarScopeTest {
	public static String name = "servyou"; // 类级变量
	public int i; // 对象实例级变量
	
	//属性块，在类初始化属性时候运行
	{
		int j = 2;// 块级变量
	}

	static {
		name = "xiaoqiye";
		System.out.println("static block");
	}
	
	public void testScope() {
		int j = 3; // 方法级变量
		if (j == 3) {
			int k = 5; // 块级变量
		}
		// 这里不能访问块级变量，块级变量只能在块内部访问
		System.out.println("name=" + name + ", i=" + i + ", j=" + j);
	}

	public static void main(String[] args) {
		// 不创建对象，直接通过类名访问类级变量
		System.out.println(VarScopeTest.name);
		// 创建对象并访问它的方法
		VarScopeTest t = new VarScopeTest();
		t.testScope();
	}

}
