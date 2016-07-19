package cn.com.serveyou.xqy.peixun.operator;

import org.junit.Test;

public class OperatorTest {

	@Test
	public void testBit() {
		int a = 60; //a = ... 00111100
		int b = 13; //b = ... 00001101
		
		//与(AND)
		int c = a & b;
		System.out.println("a&b = " + c);
		
		//或(OR)
		int d = a | b;
		System.out.println("a|b = " + d);
		
		//异或(XOR)
		int e = a^b;
		System.out.println("a^b = " + e);
		
		//非(NOT)
		int f = ~a;
		System.out.println("~a = " + f);
	}
	
	@Test
	public void testCondition() {
		//右结合的（即从右到左进行计算） 
		//第一个表达式必须是boolean或Boolean类型，否则会产生编译错误
		Float f1 = false? 1.0f: null;
        Float f2 = false? 1.0f: (false? 1.0f: null);  
        System.out.println("f1=" + f1);
        System.out.println("f2=" + f2);
	}
}

/**
 * 计算机数字有原码、反码、补码三种存储格式，通常都是补码(方便减运算)，java也不例外的使用补码。
        补码：一个数如果为正，则它的原码、反码、补码相同；一个数如果为负，则符号位为1，其余各位是对原码取反，然后整个数加1。
   +7的补码为： 00000111 -7的补码为： 第一步：11111000，第二步+1=11111001

*/