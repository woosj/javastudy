package javaDay05;

import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 팩토리얼을 구하는 프로그램을 작성하시오.
		 * 사용자로 부터 n이라는 수를 입력받아 n의 계승을 계산하는 프로그램
		 * 4! = 4*3*2*1 = 24
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
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
