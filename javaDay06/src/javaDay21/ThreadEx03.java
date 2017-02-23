package javaDay21;

class TheadEx3 extends Thread{
	
	public TheadEx3(String name) {
		
		super(name);//������ �̸�����
		
	}
	
	@Override
	public void run() {
		try {
			
			for(int i = 0; i < 5; i++){
				Thread.sleep(1000);
				System.out.println(i + "�� " + getName() + ":������");
				//�θ� Ŭ������ Thread Ŭ������ getName() �޼��带 �̿��ؼ�
				//���� �޼���� ������ �̸��� �о��
			}
			
		} catch (InterruptedException e) {
			//����ġ ���� ��Ȳ�� ���� ����ó��
			e.printStackTrace();			
		}
	}
}


public class ThreadEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheadEx3 th = new TheadEx3("hybrid");
		TheadEx3 th2 = new TheadEx3("dual");
		TheadEx3 th3 = new TheadEx3("qurd");
		
		//���� �ٸ� ���ڿ��� �־� ������ ��ü ������ ������
		//�̶� �־��� �̸��� �������� ID�� �����
		th.start();
		th2.start();
		th3.start();
	}

}
