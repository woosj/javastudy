package javaDay05;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �μ��� ������ �Է� �޾� ���� ���ϴ� ���α׷� 
		 * ��, ���Ѵ�� �Է¹ް� �Ѵ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		//���Ѵ�� �ʱ�, ����, �������� �������� ����
		for( ; ; ){
			System.out.print("���� �Է� : ");
			n1 = sc.nextInt();
			
			System.out.print("���� �Է� : ");
			n2 = sc.nextInt();
			
			if(n1 == 0 || n2 == 0 ) break;
			System.out.println("�μ��� ���� : " + (n1 + n2));
		}

	}

}
