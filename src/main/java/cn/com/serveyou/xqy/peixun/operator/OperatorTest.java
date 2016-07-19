package cn.com.serveyou.xqy.peixun.operator;

import org.junit.Test;

public class OperatorTest {

	@Test
	public void testBit() {
		int a = 60; //a = ... 00111100
		int b = 13; //b = ... 00001101
		
		//��(AND)
		int c = a & b;
		System.out.println("a&b = " + c);
		
		//��(OR)
		int d = a | b;
		System.out.println("a|b = " + d);
		
		//���(XOR)
		int e = a^b;
		System.out.println("a^b = " + e);
		
		//��(NOT)
		int f = ~a;
		System.out.println("~a = " + f);
	}
	
	@Test
	public void testCondition() {
		//�ҽ�ϵģ������ҵ�����м��㣩 
		//��һ�����ʽ������boolean��Boolean���ͣ����������������
		Float f1 = false? 1.0f: null;
        Float f2 = false? 1.0f: (false? 1.0f: null);  
        System.out.println("f1=" + f1);
        System.out.println("f2=" + f2);
	}
}

/**
 * �����������ԭ�롢���롢�������ִ洢��ʽ��ͨ�����ǲ���(���������)��javaҲ�������ʹ�ò��롣
        ���룺һ�������Ϊ����������ԭ�롢���롢������ͬ��һ�������Ϊ���������λΪ1�������λ�Ƕ�ԭ��ȡ����Ȼ����������1��
   +7�Ĳ���Ϊ�� 00000111 -7�Ĳ���Ϊ�� ��һ����11111000���ڶ���+1=11111001

*/