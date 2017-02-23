package javaDay21;

class ATM2 {
	//ATM�� ���� ������ �����ϴ� Ŭ����
	private int total;	//������ �� �ܾ�
	
	public ATM2(int total) {
		// TODO Auto-generated constructor stub
		this.total = total;
		
	}
	
	//�Ա�
	void deposit(int amount, String name){
		total += amount;
		System.out.println(name + ": �Ա� �ݾ�:" + amount);
	}
	
	//���
	void withdraw(int amount, String name){
		if( total - amount > 0){
			//��� ������ ����
			total -= amount;
			System.out.println(name + ": ��� �ݾ�:" + amount);
		}else{
			System.out.println(name + "���� �ܾ��� �����մϴ�.");
		}
	}
	
	//
	public void getTotal() {
		System.out.println("���� ������ �ܾ��� : " + total);
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}

class ATM_USER2 extends Thread {
	//ATM ����� Ŭ����
	
	ATM2 obj;
	boolean flag = false;	//�Ա�, ���
	
	
	public ATM_USER2(ATM2 obj, String name) {
		// TODO Auto-generated constructor stub
		super(name);
		this.obj = obj;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i = 0; i < 5; i++){
			try {
				sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			//ATM Ŭ������ ����ȭ�� ������ �� �� �ִ� �ڵ� ����
			//�߰�ȣ �������� �Ա��� ������� �� ������ ����
			synchronized (obj) {
				if(flag){
					obj.deposit((int)(Math.random()*10000), getName());
					obj.getTotal();
				}else{
					obj.withdraw((int)(Math.random()*10000), getName());
					obj.getTotal();
				}
			}
			
			//����ȭ�� �ȵ�����
			/*if(flag){
				obj.deposit((int)(Math.random()*10000), getName());
				obj.getTotal();
			}else{
				obj.withdraw((int)(Math.random()*10000), getName());
				obj.getTotal();
			}*/
			
			
			
			flag = !flag;
			
		}
	}
}

public class ThreadEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �ݾ� ����(���¿� ������ ����)
		ATM2 at = new ATM2(10000);
		
		//������ ���¸� ó����
		Thread user1 = new ATM_USER2(at,"�켺��");
		Thread user2 = new ATM_USER2(at,"������");
		Thread user3 = new ATM_USER2(at,"�õ���");
		
		user1.start();
		user2.start();
		user3.start();

	}

}
