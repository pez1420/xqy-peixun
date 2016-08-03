package cn.com.serveyou.xqy.peixun.chapter1.clazz;

public class ThrowAndThrows {
	public static double sqrt(String numStr) throws Exception {
		if (numStr == null) {
			// 用trow关键字抛出异常，当异常被抛出时，程序会跳出该方法
			throw new IllegalArgumentException("输入的字符不能为空！");
		}
		double n = 0;
		try {
			n = Double.parseDouble(numStr);
		} catch (NumberFormatException e) {
			// 将parseDouble方法可能抛出的异常NumberFormatException捕获，
			// 然后将捕获的异常重新封装并输出
			throw new Exception("输入的字符串必须能够转化成数字！", e);
		}
		if (n < 0) {
			throw new Exception("输入的字符串转化成的数字必须大于0！");
		}
		return Math.sqrt(n);
	}

	public static void main(String[] args) throws Exception {
		try {
			ThrowAndThrows.sqrt("-124.56");
		} catch (Exception e) {
			// 将sqrt方法声明的可能抛出的Exception异常捕获
			// 打印捕获的异常的堆栈信息，从堆栈信息中可以发现异常发生的位置和原因
			System.out.println("Got a Exception：" + e.getMessage());
			e.printStackTrace();
			throw e; // 不做进一步处理，将异常向外抛出
		}

		// 将sqrt声明了可能会抛出的异常向外抛出，必须在方法声明中使用throws
		ThrowAndThrows.sqrt("-124.56");
	}

}
