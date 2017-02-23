package javaDay11;

public class StaticInner {
	int a = 10;
	private int b = 20;
	static int c = 20;
	
	static class Inner {
		/*
		 * static 변수가 있을 경우 어쩔 수 없이 내부클래스에도 static을 선언해야함
		 */
		static int d = 1000;
		
		public void getData(){
			//System.out.println("a:"+a);
			//System.out.println("b:"+b);
			System.out.println("c:"+c);
			System.out.println("d:"+d);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInner.Inner ll = new StaticInner.Inner();
		
		ll.getData();
	}

}
