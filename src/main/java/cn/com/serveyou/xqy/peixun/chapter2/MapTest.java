package cn.com.serveyou.xqy.peixun.chapter2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

import org.junit.Test;

public class MapTest {

	@Test
	public void testPut() {
		HashMap<String, String> map = new HashMap<String, String>(); 
		map.put("1", "boss");
		map.put("2", "common");
		map.put("3", "manage");
		map.put("4", "tax");
		map.put("5", "invoice");
		map.put("6", "framework");
		map.put("6", "frameworkV1"); //覆盖
		
		map.remove("1"); //删除key为"1"的Map.Entry
		
		map.clear(); //清空map
	}
	
	@Test
	public void testTreeMap() {
		//不指定排序器  
        TreeMap<String, String> treeMap1 = new TreeMap<String, String>();  
        treeMap1.put("2", "1");  
        treeMap1.put("b", "1");  
        treeMap1.put("1", "1");  
        treeMap1.put("a", "1");  
        System.out.println("treeMap1 = " + treeMap1);  
  
        //指定排序器  
        TreeMap<String, String> treeMap2 = new TreeMap<String, String>(new Comparator<String>(){  
            /* 
             * int compare(Object o1, Object o2) 返回一个基本类型的整型， 
             * 返回负数表示：o1 < o2 
             * 返回0 表示：o1 == o2 
             * 返回正数表示：o1 > o2 
             */  
            public int compare(String o1, String o2) {  
                //指定排序器按照降序排列  
                return o2.compareTo(o1);  
            }     
        });  
        
        
        treeMap2.put("2", "1");  
        treeMap2.put("b", "1");  
        treeMap2.put("1", "1");  
        treeMap2.put("a", "1");  
        System.out.println("treeMap2 = " + treeMap2);  
    }

	
}
