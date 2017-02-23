package javaDay21;

class Data {
	// �� �����尡 ������ �� �ִ� Ŭ���� ����
	int m_iRandomNum = 0;

	// �� �����尡 ������ �� �ִ� �ʵ� ����
	// ���� �� �ʵ� ���� �����ϰų� �о���� �޼��� ����

	public int getM_iRandomNum() {
		return m_iRandomNum;
		// �������� ������
	}

	public void setM_iRandomNum() {
		// �������� ���� ����
		this.m_iRandomNum = (int) (Math.random() * 1000);

	}
}// end of Data

class Thread_ex6 extends Thread {
	Data m_RandomNum;
	// ���������͸� �����忡 �ʵ�� ����

	public Thread_ex6(Data RandomNUm, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		m_RandomNum = RandomNUm;

	}

	@Override
	public void run() {
		try {

			for (int i = 0; i < 5; i++) {

				Thread.sleep(100);

				// Math Ŭ������ random �޼��带 �̿��ؼ� ������ ����
				m_RandomNum.setM_iRandomNum();

				System.out.println(getName() + " : " + m_RandomNum.getM_iRandomNum());

			}

		} catch (InterruptedException e) {
			// ����ġ ���� ��Ȳ�� ���� ����ó��
			e.printStackTrace();
		}
	}

}// end of Thread_ex6

class Thread_ex7 extends Thread {
	Data m_RandomNum;
	// ���������͸� �����忡 �ʵ�� ����

	public Thread_ex7(Data RandomNUm, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		m_RandomNum = RandomNUm;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {

			for (int i = 0; i < 5; i++) {

				Thread.sleep(100);

				// Math Ŭ������ random �޼��带 �̿��ؼ� ������ ����
				//m_RandomNum.setM_iRandomNum();

				System.out.println(getName() + " : " + m_RandomNum.getM_iRandomNum()+10);

			}

		} catch (InterruptedException e) {
			// ����ġ ���� ��Ȳ�� ���� ����ó��
			e.printStackTrace();
		}

	}

}// end of Thread_ex7

public class ThreadEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data RData = new Data();	//���� ������ ���� Ŭ���� �ν��Ͻ� ����
		
		//�ΰ��� ������ ����
		Thread t1 = new Thread_ex6(RData, "������");
		Thread t2 = new Thread_ex7(RData, "�Һ���");
		
		//������ ����
		t1.start();
		t2.start();
	}

}
