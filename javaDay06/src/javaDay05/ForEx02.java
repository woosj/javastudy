package javaDay05;

import java.io.*;
import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * ���� �Ǽ����� �Է¹޾� �Է¹��� ������ ����� ���ϴ� ���α׷�
		 * 
		 */
		//�Է¹���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		//���� ����
		float total,input;	//���� , �Է°��� ������ ����
		int cnt = 0;	//�Է�Ƚ��
		
		//�ΰ��� �Ǽ� ������ �ʱ�ȭ
		total = input = 0.0f;
		
		for( ; input >= 0.0 ; ){
			
			total += input;
			System.out.print("���� �Ǽ� �Է� : ");
			input = sc.nextFloat();			
			cnt++;
		}
		
		System.out.println("�Է�Ƚ�� : " + (cnt-1));
		System.out.println("���� : " + total);
		System.out.println("����� : " + total/(cnt-1));
	}

}
