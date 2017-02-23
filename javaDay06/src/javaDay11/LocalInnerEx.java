package javaDay11;

public class LocalInnerEx {
	
	int a = 10;	//멤버변수
	
	public void Inner(int k){
		int b = 200;	//지역변수
		final int c = k;	//상수화 시킴
		
		class InnerExa{
			//메서드안에 내부클래스를 생성
			/*
			 * 지역클래스는 외부클래스의 멤버변수와 상수들만 접근이 가능하다.
			 */
			int d = 400;
			public void getData(){
				System.out.println("a:"+a);
				System.out.println("b:"+b);
				System.out.println("c:"+c);
				System.out.println("d:"+d);
			}
		}
		
		//메서드 내에서 이너클래서의 객체 생성
		InnerExa in = new InnerExa();
		in.getData();	//매서드 호출
	}//end of Inner()
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerEx ll = new LocalInnerEx();
		ll.Inner(3);
	}

}
