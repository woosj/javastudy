package javaDay05;

import java.util.Scanner;

public class DowhileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사용자로 부터 정수를 계속 입력받아 총합을 구하는 프로그램을 작성
		 * 단, 0 입력하면 종료
		 */
		
		int total = 0;
		int num1 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do{
			
			System.out.print("숫자를 입력하세요(0:종료) : ");
			num1 = sc.nextInt();
			total += num1;
		}while(num1 != 0);
		
		System.out.println("총 합은 : " + total);
	}

}
