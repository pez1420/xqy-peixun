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
		map.put("6", "frameworkV1"); //����
		
		map.remove("1"); //ɾ��keyΪ"1"��Map.Entry
		
		map.clear(); //���map
	}
	
	@Test
	public void testTreeMap() {
		//��ָ��������  
        TreeMap<String, String> treeMap1 = new TreeMap<String, String>();  
        treeMap1.put("2", "1");  
        treeMap1.put("b", "1");  
        treeMap1.put("1", "1");  
        treeMap1.put("a", "1");  
        System.out.println("treeMap1 = " + treeMap1);  
  
        //ָ��������  
        TreeMap<String, String> treeMap2 = new TreeMap<String, String>(new Comparator<String>(){  
            /* 
             * int compare(Object o1, Object o2) ����һ���������͵����ͣ� 
             * ���ظ�����ʾ��o1 < o2 
             * ����0 ��ʾ��o1 == o2 
             * ����������ʾ��o1 > o2 
             */  
            public int compare(String o1, String o2) {  
                //ָ�����������ս�������  
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
