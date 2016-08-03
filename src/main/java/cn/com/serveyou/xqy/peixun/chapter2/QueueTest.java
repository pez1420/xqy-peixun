package cn.com.serveyou.xqy.peixun.chapter2;

import java.util.Comparator;
import java.util.PriorityQueue;

import org.junit.Test;

public class QueueTest {

	@Test
	public void test() {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(3, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.intValue() - o2.intValue();
			}
		});
		
		q.add(1);
		q.add(3);
		q.add(100);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}
	
}
