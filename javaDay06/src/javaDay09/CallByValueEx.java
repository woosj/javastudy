package javaDay09;

public class CallByValueEx {
	//���� ���� ȣ��(Call by value)
	/*
	 * �޼��� ȣ��� �⺻ �ڷ����� ������ ���ڰ�����
	 * ȣ���ϴ� ����� �ǹ���
	 */
	public int incre(int n){
		n++;
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 100;
		
		CallByValueEx ce = new CallByValueEx();
		
		int var2 = ce.incre(var1);
		
		System.out.println("var1:"+var1+"var2:"+var2);
		
	}

}
