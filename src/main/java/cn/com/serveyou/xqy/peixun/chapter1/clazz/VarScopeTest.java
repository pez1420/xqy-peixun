package cn.com.serveyou.xqy.peixun.chapter1.clazz;

public class VarScopeTest {
	public static String name = "servyou"; // �༶����
	public int i; // ����ʵ��������
	
	//���Կ飬�����ʼ������ʱ������
	{
		int j = 2;// �鼶����
	}

	static {
		name = "xiaoqiye";
		System.out.println("static block");
	}
	
	public void testScope() {
		int j = 3; // ����������
		if (j == 3) {
			int k = 5; // �鼶����
		}
		// ���ﲻ�ܷ��ʿ鼶�������鼶����ֻ���ڿ��ڲ�����
		System.out.println("name=" + name + ", i=" + i + ", j=" + j);
	}

	public static void main(String[] args) {
		// ����������ֱ��ͨ�����������༶����
		System.out.println(VarScopeTest.name);
		// �������󲢷������ķ���
		VarScopeTest t = new VarScopeTest();
		t.testScope();
	}

}
