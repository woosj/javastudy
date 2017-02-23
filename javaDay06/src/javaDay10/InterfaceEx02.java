package javaDay10;

interface Inter1 {
	
	public int getA();
	
}

interface Inter2 {
	
	public int getA();
}

//인터페이스간의 상속일 경우 extends를 사용한다.
//인터페이스는 자동적으로 추상메소드를 선언하기 하기 때문에 재정의 안해도 오류 안난다.
interface Inter3 extends Inter1, Inter2 {
	
	public int getData();
	
}

public class InterfaceEx02 implements Inter3 {
	
	int a = 100;
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	
	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return  a + 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx02 it = new InterfaceEx02();
		
		Inter1 it1 = it;	//Inter1 it1 = new InterfaceEx02();
		Inter2 it2 = it;
		Inter3 it3 = it;
		
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
	}

}
