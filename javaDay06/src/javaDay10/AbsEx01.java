package javaDay10;

abstract class AbsEx1 {
	int a = 100;
	final String str = "나는 추상클래스 상수화된 변수다.";
	
	public String getStr() {
		return str;
	}
	
	//추상메서드 sms 몸체가 없다.
	abstract public int getA();
	
	
}

abstract class AbsEx2 extends AbsEx1 {
	
	@Override
	public int getA() {//부모클래스의 추상메서드 재정의
		// TODO Auto-generated method stub
		return a;
	}
	
	public abstract String getStr();
}


public class AbsEx01 extends AbsEx2 {
	
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		//AbsEx2의 추상메서드 재정의
		
		return str;	//str은 AbsEx1의 멤버변수이다
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsEx01 ae = new AbsEx01();
		System.out.println(ae.getA());
		System.out.println(ae.getStr());
		
	}

}
