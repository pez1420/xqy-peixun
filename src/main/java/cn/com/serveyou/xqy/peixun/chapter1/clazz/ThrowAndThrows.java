package cn.com.serveyou.xqy.peixun.chapter1.clazz;

public class ThrowAndThrows {
	public static double sqrt(String numStr) throws Exception {
		if (numStr == null) {
			// ��trow�ؼ����׳��쳣�����쳣���׳�ʱ������������÷���
			throw new IllegalArgumentException("������ַ�����Ϊ�գ�");
		}
		double n = 0;
		try {
			n = Double.parseDouble(numStr);
		} catch (NumberFormatException e) {
			// ��parseDouble���������׳����쳣NumberFormatException����
			// Ȼ�󽫲�����쳣���·�װ�����
			throw new Exception("������ַ��������ܹ�ת�������֣�", e);
		}
		if (n < 0) {
			throw new Exception("������ַ���ת���ɵ����ֱ������0��");
		}
		return Math.sqrt(n);
	}

	public static void main(String[] args) throws Exception {
		try {
			ThrowAndThrows.sqrt("-124.56");
		} catch (Exception e) {
			// ��sqrt���������Ŀ����׳���Exception�쳣����
			// ��ӡ������쳣�Ķ�ջ��Ϣ���Ӷ�ջ��Ϣ�п��Է����쳣������λ�ú�ԭ��
			System.out.println("Got a Exception��" + e.getMessage());
			e.printStackTrace();
			throw e; // ������һ���������쳣�����׳�
		}

		// ��sqrt�����˿��ܻ��׳����쳣�����׳��������ڷ���������ʹ��throws
		ThrowAndThrows.sqrt("-124.56");
	}

}
