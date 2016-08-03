package cn.com.serveyou.xqy.peixun.chapter1.genericity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;


public class GenericityTest {

	@Test
	public void test(){
		List<String> names = new ArrayList<String>();
		//LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("a", "1");
		map.put("b", "1");
		map.put("c", "1");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
}
