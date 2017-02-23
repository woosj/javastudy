package javaDay21;

class Slot extends Thread {
	
	int num1;
	boolean flag = true;
	
	
	public Slot(String name) {
		// TODO Auto-generated constructor stub
		super(name);

	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {

			while(flag) {

				Thread.sleep((int)(Math.random()*10)+1);

				// Math Ŭ������ random �޼��带 �̿��ؼ� ������ ����
				num1 = (int)(Math.random()*10)+1;
				//System.out.print(getName() + " : " + getNum1());

			}

		} catch (InterruptedException e) {
			// ����ġ ���� ��Ȳ�� ���� ����ó��
			e.printStackTrace();
		}
		
	}


	public int getNum1() {
		return num1;
	}


	public void finish() {
		flag = false;
	}
	
	
	
}


public class Slotmachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Slot s1 = new Slot("s1");
		Slot s2 = new Slot("s2");
		Slot s3 = new Slot("s3");
		int n1,n2,n3;
		
		s1.start();
		s2.start();
		s3.start();
		
		while(true){
			n1 = s1.getNum1();
			n2 = s2.getNum1();
			n3 = s3.getNum1();
			
			System.out.println(n1 + "," + n2 + "," + n3);
			
			if(n1 != 0)
			{
				if(n1 == n2 && n2 == n3){
					System.out.println("��÷�Ǿ����ϴ�.");
					/*s1.finish();
					s2.finish();
					s3.finish();*/
					s1.flag = false;
					s2.flag = false;
					s3.flag = false;
					break;
				}
			}
		}
		
	}

}
