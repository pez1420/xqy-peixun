package cn.com.serveyou.xqy.peixun.chapter2;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.junit.Test;

public class ListTest {

	@Test
	public void testArrayList() {
		List<String> names = new ArrayList<String>();
		names.add("miro-corp");
		names.add("itax");
		names.add("finance");

		// 利用索引进行遍历
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}

		// for-each隐藏遍历
		for (String name : names) {
			System.out.println(name);
		}

		// 迭代器进行迭代
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}

		// for-each隐藏遍历
		for (String name : names) {
			System.out.println(name);
		}
	}

	@Test
	public void testLinkedList() {
		LinkedList<Integer> seqList = new LinkedList<Integer>();
		seqList.add(100);
		seqList.add(200);
		seqList.add(300);
		
		System.out.println("链表的第一个元素是：" + seqList.getFirst());
		System.out.println("链表的第二个元素是：" + seqList.getLast());
		
		seqList.addFirst(50);
		System.out.println("链表的第一个元素是：" + seqList.getFirst());
		
		seqList.addLast(500);
		System.out.println("链表的第一个元素是：" + seqList.getLast());
		
		System.out.println("peek() 链表的第一个元素是：" + seqList.peek());
		System.out.println("peekFirst() 链表的第一个元素是：" + seqList.peekFirst());
		
		System.out.println("pollFirst() 链表的第一个元素是：" + seqList.pollFirst());
		System.out.println("peekFirst() 链表的第一个元素是：" + seqList.peekFirst());
	}
	
	@Test
	public void testVector() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(100);
		v.add(200);
		v.add(300);
		for (Enumeration<Integer> e = v.elements(); e.hasMoreElements();)
			System.out.println(e.nextElement());

	}
	

}
