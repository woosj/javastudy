package javaDay10;

//다형성에서 메서드는 자식, 멤버변수는 부모것을 사용함

class ParentEx {//부모클래스
	
	int foo = 5;

	public int getNumber(int a){
		return a + 1;
	}
	
}

public class sonEx01 extends ParentEx{
	
	int foo = 7;
	
	@Override
	public int getNumber(int a) {
		// TODO Auto-generated method stub
		return a+2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다형성에서 메서드는 자식, 멤버변수는 부모것을 사용함
		
		ParentEx pe = new sonEx01();	//부모참조 변수에 자식객체를 생성
		ParentEx pe1 = new ParentEx();	//부모참조 변수에 부모객체를 생성
		sonEx01 pe2 = new sonEx01();	//자식참조 변수에 자식객체를 생성
		
		System.out.println(pe.getNumber(1));
		System.out.println(pe1.getNumber(1));
		System.out.println(pe2.getNumber(1));
		
		System.out.println(pe.foo);
		System.out.println(pe1.foo);
		System.out.println(pe2.foo);
	}

}
