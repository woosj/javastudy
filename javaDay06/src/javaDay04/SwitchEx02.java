package javaDay04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
	     * ����ڷ� ���� ������ ������ ��Ģ���� ��ȣ�� �Է¹޾� ������ ���ϴ� ���α׷��� �����Ͻÿ�.
	     * ���� ��)
	     * ù��° ���� : 10
		 * �ι��� ���� : 20
		 * ������ [ + - * / ] : +	
		 * ���� ���
		 * 10 + 20 = 30
		 *
		 * ��, switch �� �̿�, ��� ���� ����ó��
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2;
				
		System.out.print("ù��° ���� : ");
		String str1 = br.readLine();
		num1 = Integer.parseInt(str1);
		
		System.out.print("�ι�° ���� : ");
		String str2 = br.readLine();
		num2 = Integer.parseInt(str2);
		
		int result = 0;
		
		System.out.print("������[ + - * / ] : ");
		char ch = (char)br.read();
		
		switch(ch){
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			default : return;
			/*
			 * return
			 * 1. ���� ��ȯ
			 * 2. �޼ҵ�(�Լ�)����
			 */
		}
		
		System.out.printf(" %d %c %d = %d " , num1, ch, num2, result);
		System.out.println();
		
	}

}
