package cn.com.serveyou.xqy.peixun.chapter3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.junit.Test;

public class TestFile {

	private static final String FILENAME = "E:\\study\\xqy-peixun\\src\\main\\resources\\xqy.txt";

	@Test
	public void readFileByBytes() {
		// 以字节为单位读取文件，常用于读二进制文件，如图片。
		File file = new File(FILENAME);
		InputStream in = null;
		try {
			System.out.println("以字节为单位读取文件内容，一次读一个字节：");
			// 一次读一个字节
			in = new FileInputStream(file);
			int tempbyte;
			while ((tempbyte = in.read()) != -1) {
				System.out.print(tempbyte + " ");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
	public void readFileByChars() {
		// 以字符为单位读取文件，常用于读文本，数字等类型的文件
		File file = new File(FILENAME);
		Reader reader = null;
		try {
			System.out.println("以字符为单位读取文件内容，一次读一个字符：");
			// 一次读一个字符
			reader = new InputStreamReader(new FileInputStream(file));
			int tempchar;
			while ((tempchar = reader.read()) != -1) {
				System.out.print((char) tempchar);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Test
    public  void readFileByLines() {
    	//以行为单位读取文件，常用于读面向行的格式化文件
    	File file = new File(FILENAME);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                	
                }
            }
        }
    }
	
	

	   
}
