package javaDay09;
class Static {
	int x;
	static int y;
}
public class StaticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static �� ���� �ʾѱ� ������ ������ �������� ���Ѵ�. ��ü�� �����ؾ߸� ������ �����ϴ�.
		//Static.x = 10;
		Static s = new Static();
		s.x = 10;
		
		System.out.println(Static.y);
		Static.y = 20;	
		
		System.out.println(Static.y);
		

	}

}
