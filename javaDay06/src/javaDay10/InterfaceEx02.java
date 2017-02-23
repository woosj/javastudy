package javaDay10;

interface Inter1 {
	
	public int getA();
	
}

interface Inter2 {
	
	public int getA();
}

//�������̽����� ����� ��� extends�� ����Ѵ�.
//�������̽��� �ڵ������� �߻�޼ҵ带 �����ϱ� �ϱ� ������ ������ ���ص� ���� �ȳ���.
interface Inter3 extends Inter1, Inter2 {
	
	public int getData();
	
}

public class InterfaceEx02 implements Inter3 {
	
	int a = 100;
	
	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}
	
	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return  a + 10;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceEx02 it = new InterfaceEx02();
		
		Inter1 it1 = it;	//Inter1 it1 = new InterfaceEx02();
		Inter2 it2 = it;
		Inter3 it3 = it;
		
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());
	}

}
