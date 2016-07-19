package cn.com.serveyou.xqy.peixun.clazz;

import org.junit.Test;

public class WrapperClazzTest {

	// 拆箱裝箱
	@Test
	public void testBox() {
		int m = 500;
		Integer obj = new Integer(m); // 手动装箱
		int n = obj.intValue(); // 手动拆箱
		System.out.println("n = " + n);

		Integer obj1 = new Integer(500);
		System.out.println("obj 等价于 obj1？" + obj.equals(obj1));
	}

	// 字符串转换为整数
	@Test
	public void testParse() {
		String strs[] = { "123", "123abc", "abc123", "abcxyz" };

		for (String s : strs) {
			try {
				int m = Integer.parseInt(s, 10);
				System.out.println(s + " 可以转换为整数 " + m);
			} catch (NumberFormatException e) {
				System.out.println(s + " 无法转换为整数");
			}
		}
	}

	// 将整数转换为字符串
	@Test
	public void testToString() {
		int m = 500;
		String s = Integer.toString(m);
		System.out.println("s = " + s);
	}

}
