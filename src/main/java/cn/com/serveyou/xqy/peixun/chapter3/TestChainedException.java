package cn.com.serveyou.xqy.peixun.chapter3;

public class TestChainedException {
	public static void a() throws Exception { // �׳��쳣���ϼ�����
		try {
			b();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public static void b() throws Exception { // �׳��쳣���ϼ�����
		try {
			c();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public static void c() throws Exception { // �׳��쳣���ϼ�����
		try {
			throw new NullPointerException("c �쳣���еĿ�ָ���쳣..");
		} catch (NullPointerException e) {
			throw new Exception(e);
		}
	}

	public static void main(String[] args) {
		try {
			a();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
