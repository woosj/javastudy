package javaDay11;

import java.io.IOException;

public class SumExam01 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		//��ü����
		Sum sum = new Sum();
		int result = 0;
		//���� �Է� 
		sum.Input();
		
		//1~ �Է¼� ���� �հ�
		result = sum.Sum_result();
		
		//���
		sum.disp();
	}

}
