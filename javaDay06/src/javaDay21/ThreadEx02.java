package javaDay21;

//������ Ŭ���� ����
class ThreadEx2 extends Thread {
	//������ Ŭ������ ��ӹ޾Ƽ� ����
	//�߻� Ŭ������ ���ǵǾ� �ִ� run�޼��带 �ݵ�� ����, �����尡 ���۵ɶ� ȣ��Ǵ� �޼�����
	
	@Override
	public void run() {
		// run�޼��带 �������̵� �Ͽ� ���� ����
		try {
			//������ ��ü����
			for(int i = 0; i < 5; i++){
				Thread.sleep(1000);
				System.out.println(i + "�� ������");
				//main �޼��忡�� i���� ���
			}
			
		} catch (InterruptedException e) {
			//����ġ ���� ��Ȳ�� ���� ����ó��
			e.printStackTrace();			
		}
		
	}
	
}

public class ThreadEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//������ ��ü����
			ThreadEx2 tt = new ThreadEx2();
			
			tt.start();
			
			for(int i = 0; i < 5; i++){
				Thread.sleep(1000);
				System.out.println(i + "�� main ������");
				//main �޼��忡�� i���� ���
			}
			
		} catch (InterruptedException e) {
			//����ġ ���� ��Ȳ�� ���� ����ó��
			e.printStackTrace();			
		}
	}

}
