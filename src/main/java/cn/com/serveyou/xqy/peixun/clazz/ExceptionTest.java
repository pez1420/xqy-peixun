package cn.com.serveyou.xqy.peixun.clazz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class ExceptionTest {

	public String openFile() {
		FileInputStream in = null;
		try {
			in = new FileInputStream("E:/a.txt");
			int ch = in.read();
			System.out.println(ch);
			in.close();
			return "number-1";
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
			return "number-2";
		} catch (IOException e) {
			System.out.println("io exception");
			return "number-3";
		} finally {
			//��Ҫ��finally����ʹ��return����Ϊfinally�е�return�Ḳ�����еķ���ֵ
			System.out.println("finally block");
			//return "finally";
		}
	}
	
	@Test
	public void testOpenFile() {
		System.out.println(openFile());
	}

}
