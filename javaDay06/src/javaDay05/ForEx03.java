package javaDay05;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 두수의 정수를 입력 받아 합을 구하는 프로그램 
		 * 단, 무한대로 입력받게 한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		//무한대는 초기, 조건, 증감값을 설정하지 않음
		for( ; ; ){
			System.out.print("정수 입력 : ");
			n1 = sc.nextInt();
			
			System.out.print("정수 입력 : ");
			n2 = sc.nextInt();
			
			if(n1 == 0 || n2 == 0 ) break;
			System.out.println("두수의 합은 : " + (n1 + n2));
		}

	}

}
