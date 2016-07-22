package cn.com.serveyou.xqy.peixun.chapter1.oop;

//ÀÖÆ÷
abstract class Instrument {
	private int i;
	public abstract void play();
	public String what(){ return "Instrument"; }
	public abstract void adjust();
}

//¹ÜÀÖÆ÷
class Wind extends Instrument {
	@Override
	public void play() {
		System.out.println("Wind.play()");
	}
	
	@Override
	public String what(){ return "Wind";}

	@Override
	public void adjust() {}
}

//´ò»÷ÀÖ
class Percussion extends Instrument {
	@Override
	public void play() {
		System.out.println("Percussion.play()");
	}

	public String what(){ return "Percussion"; }
	
	@Override
	public void adjust() {}
}

class Brass extends Wind {
	@Override
	public void play() {
		System.out.println("Brass.play()");	
	}
	
	@Override
	public void adjust() {
		System.out.println("Brass.adjust()");	
	}
}

public class Music {
	public static void main(String[] args) {

	}
}
