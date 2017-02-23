package javaDay09;
class Static {
	int x;
	static int y;
}
public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static 이 붙지 않앗기 때문에 변수가 공유되지 못한다. 객체를 생성해야만 접근이 가능하다.
		//Static.x = 10;
		Static s = new Static();
		s.x = 10;
		
		System.out.println(Static.y);
		Static.y = 20;	
		
		System.out.println(Static.y);
		

	}

}
