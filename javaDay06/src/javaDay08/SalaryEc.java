package javaDay08;

class Salary {
	private int pay;

	public int getPay() {
		return pay;
	}

	public void setPay(int pay, String pass) {
		
		if(pass.equals("1234"))		
		this.pay = pay;
		
		/*
		 * this�� ���� Ŭ�������� ����
		 * ����Ŭ������ ����Ŵ
		 * super�� ��ӹ���  ����Ŭ������ ���������Ҷ� ���
		 * ��ӹ��� ����Ŭ������ ����Ŵ
		 */
	}
	
}
public class SalaryEc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salary ss = new Salary();
		ss.setPay(1000, "1234");
		
		int myPay = ss.getPay();
		
		System.out.println(myPay);
		
	}

}
