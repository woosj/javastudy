package javaDay11;

public class Memberinner {
	
	int a = 10; //Memberinner 클래스의 지역변수
	private int b = 100;
	static int c = 200;
	
	class Inner {
		public void Data(){
			System.out.println("int a :" + a);
			System.out.println("int b :" + b);
			System.out.println("int c :" + c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memberinner me = new Memberinner();
		Memberinner.Inner mi = me.new Inner();
		
		mi.Data();
	}

}
