package javaDay05;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���� ������ �Է� �޾� �Է¹��� ������ ���� ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 *
		 * ��, ���� ������ ���������� �����Ͽ� ����Ͻÿ�.
		 * 
		 * or ���� �Ǽ����� �Է¹޾� �Է¹��� ������ ����� ���ϴ� ���α׷�
		 * 
		 * or �Է¹��� Ƚ���� ���� �Է¹޴´�.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1=0,sum = 0;
		int i = 0, avg = 0;
		
		for( ; num1 != 0 ; ){
			
			System.out.print("���� �Է�(0 �Է� ����) : ");
			num1 = sc.nextInt();
			
			if(num1 < 0) num1 *= -1;
			
			sum += num1;
			i++;
			
		}
		System.out.println("�Է�Ƚ�� : " + i);
		System.out.println("���� : " + sum);
		System.out.println("����� : " + sum/i);
		
		/*do{
			System.out.print("���� �Է�(0 �Է� ����) : ");
			num1 = sc.nextInt();
			
			if(num1 < 0) num1 *= -1;
			
			sum += num1;
			if(num1 != 0 ) i++;
		}while(num1 != 0);
		
		System.out.println("���� : " + sum);
		System.out.println("����� : " + sum/i);*/
		
		
	}

}
