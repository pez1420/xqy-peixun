package cn.com.serveyou.xqy.peixun.chapter4;

public class ThreadDemo {
	private static Object lock = new Object();
	
	public static void myWait() {
		synchronized (lock) {
			try {
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		myWait();
	}

}
