package cn.com.serveyou.xqy.peixun.chapter1.oop;

public interface Runner {
	//字段在编译时会自动加上static final的修饰符
	public static int DEFAULT_SPEED = 100;
	//抽象方法
	public abstract void run(); 
}
