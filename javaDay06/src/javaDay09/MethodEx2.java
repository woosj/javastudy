package javaDay09;

public class MethodEx2 {
	/*
	 * 변수는 블럭 {} 내에서만 쓰인다.
	 */
	int var1, var2;	//클래스 멤버 변수 , 이 변수는 가장 마지막 블럭까지 살아 있다.
	
	public MethodEx2() {
		// TODO Auto-generated constructor stub
		var1 = 10;
		var2 = 20;
	}
	
	public int sum(int a, int b){
		//메서드의 멤버변수
		return a + b;	//이 변수는 sum() 함수 안에서만 쓰인다.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx2 me = new MethodEx2();
		int result = 0;
		result = me.sum(10, 20);
		System.out.println(result);
	}

}
