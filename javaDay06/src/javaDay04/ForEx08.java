package javaDay04;

import java.util.Scanner;

public class ForEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * ����ڷ� ���� ������ ������ �Է¹޾� �Է¹��� ������ �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * - �Ҽ� : 1 �Ǵ� �ڽ��� �� �̿��� � ���ε� ���� �� ���� ��
		 * ���� : 10
		 * 10 -> �Ҽ��ƴ�
		 * 
		 * ���� : 11
		 * 11 -> �Ҽ�
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int i = 1;	//���� ����
		int n = 0;	//�������� 0�϶� �����Լ�
		boolean flag = true;
		
		while(i <= num){
			
			
			if( num%i == 0){
				//�������� 0 �̸� ī��Ʈ�� ������Ų��.
				n++;
			}
			
			i++;
		}
		
		
		
		//n�� 2�� �̻��̸� �ڽŰ� 1�ܿ� ���ڷ� �������� ����
		System.out.println( n>2 ? "�Ҽ��ƴ�":"�Ҽ�");
		
		
		i = 2;
		while(i<num){
			
			
			if( num%i == 0){
				flag = false;				
			}
			
			i++;
		}
		
		// �Է°��� 1������ ���ε� �Բ� Ȯ��
		// ��� ���
		if(flag && num != 1){
			System.out.println( num + " -> �Ҽ�");
		}else{
			System.out.println( num + " -> �Ҽ��ƴ�");
		}
		
	}

}
