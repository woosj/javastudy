package javaDay09;

public class MethodEx2 {
	/*
	 * ������ �� {} �������� ���δ�.
	 */
	int var1, var2;	//Ŭ���� ��� ���� , �� ������ ���� ������ ������ ��� �ִ�.
	
	public MethodEx2() {
		// TODO Auto-generated constructor stub
		var1 = 10;
		var2 = 20;
	}
	
	public int sum(int a, int b){
		//�޼����� �������
		return a + b;	//�� ������ sum() �Լ� �ȿ����� ���δ�.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodEx2 me = new MethodEx2();
		int result = 0;
		result = me.sum(10, 20);
		System.out.println(result);
	}

}
