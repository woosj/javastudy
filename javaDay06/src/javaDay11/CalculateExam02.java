package javaDay11;

import java.io.IOException;

public class CalculateExam02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//�޼��� ȣ�⸸�ؼ� ó��
		
		//��ü ����
		Calculate cal = new Calculate();
		
		//�� ���� �Է� �� ������ �Է� �޼���
		cal.Input();
		
		//��� �޼���
		int a = cal.cal();
		
		//��� �޼���
		cal.disp(a);
	}

}
