package javaDay10;

//���������� �޼���� �ڽ�, ��������� �θ���� �����

class ParentEx {//�θ�Ŭ����
	
	int foo = 5;

	public int getNumber(int a){
		return a + 1;
	}
	
}

public class sonEx01 extends ParentEx{
	
	int foo = 7;
	
	@Override
	public int getNumber(int a) {
		// TODO Auto-generated method stub
		return a+2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���������� �޼���� �ڽ�, ��������� �θ���� �����
		
		ParentEx pe = new sonEx01();	//�θ����� ������ �ڽİ�ü�� ����
		ParentEx pe1 = new ParentEx();	//�θ����� ������ �θ�ü�� ����
		sonEx01 pe2 = new sonEx01();	//�ڽ����� ������ �ڽİ�ü�� ����
		
		System.out.println(pe.getNumber(1));
		System.out.println(pe1.getNumber(1));
		System.out.println(pe2.getNumber(1));
		
		System.out.println(pe.foo);
		System.out.println(pe1.foo);
		System.out.println(pe2.foo);
	}

}
