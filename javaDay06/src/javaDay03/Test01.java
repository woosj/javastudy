package javaDay03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		      ����ڷ� ���� ������ ������ �Է¹޾� ��Ģ���� �� ������ ������ ���ϴ� ���α׷��� �����Ͻÿ�.
		      ���� ��)
		      ù��° ���� : 10
			�ι��� ���� : 20
			
			���� ���
			10 + 2 = 12
			10 - 2 = 10
			10 * 2 = 20
			10 / 2 = 5
			10 % 2 = 0
			
			��, ����� printf()�� ����Ͻÿ�.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2;
				
		System.out.print("ù��° ���� : ");
		String str1 = br.readLine();
		num1 = Integer.parseInt(str1);
		
		System.out.print("�ι�° ���� : ");
		String str2 = br.readLine();
		num2 = Integer.parseInt(str2);
		
		//�μ��� ��
		int result1 = num1 + num2;
		System.out.printf(" %d + %d = %d " ,num1,num2, result1);
		System.out.println();
		
		//�μ��� ��
		int result2 = num1 - num2;
		System.out.printf(" %d - %d = %d " ,num1,num2, result2);
		System.out.println();
		
		//�μ��� ��
		int result3 = num1 * num2;
		System.out.printf(" %d * %d = %d " ,num1,num2, result3);
		System.out.println();
		
		//�μ��� ������
		int result4 = num1 / num2;
		System.out.printf(" %d / %d = %d " ,num1,num2, result4);
		System.out.println();
		
		//�μ��� ������
		int result5 = num1 % num2;
		System.out.printf(" %d %% %d = %d " ,num1,num2, result5);
		System.out.println();
		
	
	}

}
