package cn.com.serveyou.xqy.peixun.chapter3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Test;


class Person implements Serializable {
	
	private static final long serialVersionUID = 4538805503604600354L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class TestSerialization {
	
	public static byte[] serialize(Object session) {
		ByteArrayOutputStream b = null;
		ObjectOutputStream out = null;
		try {
			b = new ByteArrayOutputStream();
			out = new ObjectOutputStream(b);
			out.writeObject(session);
			return b.toByteArray();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			try {
				b.close();
				out.close();
			} catch (IOException ee) {
				throw new RuntimeException(ee);
			}
		}
	}

	
	public static Object deserialize(byte[] sessionByte) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new ByteArrayInputStream(sessionByte));
			return (Object) in.readObject();
		} catch (IOException e1) {
			throw new RuntimeException(e1);
		} catch (ClassNotFoundException e2) {
			throw new RuntimeException(e2);
		}finally {
			try {
				in.close();
			} catch (IOException e3) {
				throw new RuntimeException(e3);
			}
		}
	}
	
	
	@Test
	public void testSerialize() {
		Person p1 = new Person();
		p1.setName("xqy");
		byte[] bytes = serialize(p1);
		Person p2 = (Person)deserialize(bytes);
		System.out.println(p2.getName());
	}
}
