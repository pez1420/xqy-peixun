package cn.com.serveyou.xqy.peixun.clazz;

import org.junit.Test;

public class WrapperClazzTest {

	// �����b��
	@Test
	public void testBox() {
		int m = 500;
		Integer obj = new Integer(m); // �ֶ�װ��
		int n = obj.intValue(); // �ֶ�����
		System.out.println("n = " + n);

		Integer obj1 = new Integer(500);
		System.out.println("obj �ȼ��� obj1��" + obj.equals(obj1));
	}

	// �ַ���ת��Ϊ����
	@Test
	public void testParse() {
		String strs[] = { "123", "123abc", "abc123", "abcxyz" };

		for (String s : strs) {
			try {
				int m = Integer.parseInt(s, 10);
				System.out.println(s + " ����ת��Ϊ���� " + m);
			} catch (NumberFormatException e) {
				System.out.println(s + " �޷�ת��Ϊ����");
			}
		}
	}

	// ������ת��Ϊ�ַ���
	@Test
	public void testToString() {
		int m = 500;
		String s = Integer.toString(m);
		System.out.println("s = " + s);
	}

}
