package javaDay21;

class TheadEx4 implements Runnable{
	
	@Override
	public void run() {
		try {
			
			for(int i = 0; i < 20; i++){
				Thread.sleep(1000);
				System.out.println(i + "��:" + i + "*" + i + "=" + (i*i));
			}
			
		} catch (InterruptedException e) {
			//����ġ ���� ��Ȳ�� ���� ����ó��
			e.printStackTrace();			
		}
	}
}


public class ThreadEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Runnable �������̽� �ν��Ͻ� ����
		TheadEx4 tt = new TheadEx4();
		
		//��ü�� ������ �������̽��� Thread Ŭ������ �̿��ؼ� �ٽ� �ν��Ͻ��� ������ ���� ���� �޼��带 ȣ����
		Thread t = new Thread(tt);
		
		t.start();
		
	}

}
