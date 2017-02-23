package javaDay11;

public class StaticInner {
	int a = 10;
	private int b = 20;
	static int c = 20;
	
	static class Inner {
		/*
		 * static ������ ���� ��� ��¿ �� ���� ����Ŭ�������� static�� �����ؾ���
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
