package javaDay21;

//������ Ŭ���� ����
class ThreadEx extends Thread {
	//������ Ŭ������ ��ӹ޾Ƽ� ����
	//�߻� Ŭ������ ���ǵǾ� �ִ� run�޼��带 �ݵ�� ����, �����尡 ���۵ɶ� ȣ��Ǵ� �޼�����
	
	@Override
	public void run() {
		// run�޼��带 �������̵� �Ͽ� ���� ����
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

public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadEx th = new ThreadEx();
		ThreadEx th2 = new ThreadEx();
		th.start();
		th2.start();
		
	}

}
