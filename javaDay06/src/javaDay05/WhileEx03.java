package javaDay05;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����ڷ� ���� ������ �� ������ �Է¹޾� ���� ������ ū �� ���� ���ʴ�� ����ϴ� ���α׷��� �ۼ�
		 * 
		 * ù��° ���� �Է� : 20
		 * �ι�° ���� �Է� : 10
		 * ��� : 10 ~ 20 ������ �հ� : xxxx
		 * 
		 */
		
		int max = 0, a = 0;
		int i = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while( i < 2){
			
			System.out.print( (i+1)+"��°���� �Է� : ");
			a = sc.nextInt();
			sum += a;
			
			if( a > max ){
				max = max^a;
				a = a^max;
				max = max^a;			
			}
			
			i++;
		}
		
		System.out.println(a + " ~ " + max + "������ �հ� : " + sum );
		
		int num1, num2;
		int min = 0;
		System.out.print( "ù��°���� �Է� : ");
		num1 = sc.nextInt();
		
		System.out.print( "�ι�°���� �Է� : ");
		num2 = sc.nextInt();
		
		//����
		if( num1 > num2 ){
			num1 = num1^num2;
			num2 = num2^num1;
			num1 = num1^num2;
		}
		//�ּҰ� ����
		min = num1;
		sum = 0;
		
		while( num1 <= num2 ){
			sum += num1;
			num1++;
		}
		
		System.out.println(min + " ~ " + num2 + "������ �հ� : " + sum );
	}

}
