package cn.com.serveyou.xqy.peixun.chapter1.grammar;

import org.junit.Test;

class Person {
	private static final  String name = "xqy";
	private static volatile boolean isStoped = false;
	private Integer age;
	private transient String passwd;
}
public class TestGrammar {

	@Test
	public void testArr() {
		String s1[] = new String[] {"a","b","c"}; //��ȷ
		String s2[] = {"a","b","c"}; //��ȷ
		//String s3[] = new String[3] {"Zero","One","Two"}; //����
		
	}
	
	
}
