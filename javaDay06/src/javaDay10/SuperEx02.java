package javaDay10;

class Super2 {
	//int a = 5;
	
	public Super2() {
		// TODO Auto-generated constructor stub
		System.out.println("상위클래스의 생성자 : ");
	}
	
	public Super2(int a) {
		// TODO Auto-generated constructor stub
		
		System.out.println("상위클래스의 생성자 : " + a);
	}
}

class Sub2 extends Super2 {
	/*int a = 10;
	
	public void test(){
		System.out.println(this.a);
	}*/
	
	public Sub2() {
		// TODO Auto-generated constructor stub
		super(5);
		System.out.println("하위클래스의 생성자 : ");
	}
}

public class SuperEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub2 s = new Sub2();
		
	}

}
