package javaDay10;

abstract class AbsEx1 {
	int a = 100;
	final String str = "���� �߻�Ŭ���� ���ȭ�� ������.";
	
	public String getStr() {
		return str;
	}
	
	//�߻�޼��� sms ��ü�� ����.
	abstract public int getA();
	
	
}

abstract class AbsEx2 extends AbsEx1 {
	
	@Override
	public int getA() {//�θ�Ŭ������ �߻�޼��� ������
		// TODO Auto-generated method stub
		return a;
	}
	
	public abstract String getStr();
}


public class AbsEx01 extends AbsEx2 {
	
	@Override
	public String getStr() {
		// TODO Auto-generated method stub
		//AbsEx2�� �߻�޼��� ������
		
		return str;	//str�� AbsEx1�� ��������̴�
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsEx01 ae = new AbsEx01();
		System.out.println(ae.getA());
		System.out.println(ae.getStr());
		
	}

}
