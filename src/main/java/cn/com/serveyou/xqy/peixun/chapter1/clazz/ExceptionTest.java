package cn.com.serveyou.xqy.peixun.chapter1.clazz;

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
			//不要在finally块中使用return，因为finally中的return会覆盖已有的返回值
			System.out.println("finally block");
			//return "finally";
		}
	}
	
	@Test
	public void testOpenFile() {
		System.out.println(openFile());
	}
	
	
	@Test
	public void testArrayIndexOut() {
		String[] names = {"miro-corp", "itax", "finance", "account"};
		try{
			for (int i = 0; i < 5; i++) {
				System.out.println(names[i]);
			}
		}catch(java.lang.ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
