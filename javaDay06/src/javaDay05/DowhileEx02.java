package javaDay05;

import java.util.Scanner;

public class DowhileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����ڷ� ���� ������ ��� �Է¹޾� ������ ���ϴ� ���α׷��� �ۼ�
		 * ��, 0 �Է��ϸ� ����
		 */
		
		int total = 0;
		int num1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			
			System.out.print("���ڸ� �Է��ϼ���(0:����) : ");
			num1 = sc.nextInt();
			total += num1;
		}while(num1 != 0);
		
		System.out.println("�� ���� : " + total);
	}

}
