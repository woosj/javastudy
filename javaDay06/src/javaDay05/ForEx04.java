package javaDay05;

import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ���丮���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * ����ڷ� ���� n�̶�� ���� �Է¹޾� n�� ����� ����ϴ� ���α׷�
		 * 4! = 4*3*2*1 = 24
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int n = sc.nextInt();
		int total = 1;
		
		System.out.print(n + "! = ");
		for(int i = 1; i <= n; i++){
			total *= i;
			System.out.print(i);
			if(i != n) System.out.print("*");
			
		}
		System.out.println(" = " + total );
	}

}
