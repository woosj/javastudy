package javaDay05;

import java.util.Scanner;

public class ForEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����ڷ� ���� �ϳ��� ������ �Է¹��� ���� �� ����ŭ 3�� ����� ����ϴ� ���α׷� �ۼ�
		 * 
		 * 5�� �ԷµǸ� 3 6 9 12 15
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = 0, total = 1;
		
		System.out.print("���� �Է� : ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			System.out.print((i * 3) + " ");
		}
		
	}

}
