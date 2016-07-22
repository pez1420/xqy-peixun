package cn.com.serveyou.xqy.peixun.chapter1.clazz;

import org.junit.Test;

class Circle {
	private int radius = 0;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public Draw getDrawInstance() {
		return new Draw();
	}
	
	public DrawOne getDrawOneInstance() {
		return new DrawOne();
	}
	
	//成员内部类
	class Draw {
		public void draw() {
			System.out.println("darw " + Circle.this.radius);
		}
	}

	//成员内部类
	class DrawOne {
		private int radius = 2;
		public void draw() {
			System.out.println("drawone radius = " + radius);
			System.out.println("Circle.this radius = " + Circle.this.radius);
		}
	}
	
	//静态内部类
	static class DrawTwo {
		public void draw() {
			System.out.println("DrawTwo none");
		}
	}
}

interface ISay {
	public void say();
}

public class Outer {
	private String name = "outer";
	
	@Test
	public void test() {
		//使用成员内部类需要
		new Circle(1).getDrawInstance().draw();
		
		new Circle(1).getDrawOneInstance().draw();
		
		new Circle.DrawTwo().draw();
	}
	
	@Test
	public void testNoNameClass() {
		//final int localVar = 100;
		//匿名类
		ISay say = new ISay() {
			public void say() {
				System.out.println("invoke say method()");
				//System.out.println("localVar = " + localVar);
				//System.out.println(Outer.this.name);
			}
		};
		say.say();
	}
	
	@Test
	public void testInner() {
		
	}
}
