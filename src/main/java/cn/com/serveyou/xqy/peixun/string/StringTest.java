package cn.com.serveyou.xqy.peixun.string;

import org.junit.Test;

public class StringTest {

	@Test
	public  void test1() {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(s1 == s2);
	}
	
	@Test
	public  void test2() {
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2);
	}
	
	@Test
	public  void test3() {
		String s1 = "abc";
		String s2 = "a";
		String s3 = "bc";
		String s4 = s2 + s3;
		System.out.println(s1 == s4);
	}
	
	@Test
	public  void test4() {
		String s1 = "abc";
		String s2 = "a" + "bc";
		System.out.println(s1 == s2);
	}
}
