package javaDay04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * �� 1] ����ڷ� ���� ������ �� ������ �����ڸ� �Է¹޾� �ش� �������� ó�� ����� ����ϴ� ���α׷�
		 *
		 *	��, if(���ǹ�)�� Ȱ���Ͽ� �����ϵ���, �������� ���������� �Ұ�
		 *
		 *	���� ��)
		 *	ù��° ���� : 10
		 *	�ι�° ���� : 14
		 *	�������Է� [ + - * / ]: +
		 *
		 *	10 + 14 = 24
		 *
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, res = 0;
		char con;
		
		
		System.out.print("ù��° ���� : ");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�ι�° ���� : ");
		b = Integer.parseInt(br.readLine());
		
		System.out.print("�������Է� [ + - * / ] : ");
		con = (char)br.read();
		
		if(con == '+'){
			res = a + b;
		}else if(con == '-'){
			res = a - b;
		}else if(con == '*'){
			res = a * b;
		}else if(con == '/'){
			res = a / b;
		}
		
		System.out.printf( " %d %c %d = %d " , a,con,b,res);
		System.out.println();
		System.out.println( a + " " + con + " " + b + " = " + res);
		
		
	}

}
