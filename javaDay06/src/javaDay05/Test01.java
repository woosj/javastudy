package javaDay05;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 양의 정수만 입력 받아 입력받은 정수의 합의 평균 구하는 프로그램을 작성하시오.
		 *
		 * 단, 음의 정수도 양의정수로 변경하여 계산하시오.
		 * 
		 * or 양의 실수만을 입력받아 입력받은 정수의 평균을 구하는 프로그램
		 * 
		 * or 입력받을 횟수를 직접 입력받는다.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int num1=0,sum = 0;
		int i = 0, avg = 0;
		
		for( ; num1 != 0 ; ){
			
			System.out.print("정수 입력(0 입력 종료) : ");
			num1 = sc.nextInt();
			
			if(num1 < 0) num1 *= -1;
			
			sum += num1;
			i++;
			
		}
		System.out.println("입력횟수 : " + i);
		System.out.println("합은 : " + sum);
		System.out.println("평균은 : " + sum/i);
		
		/*do{
			System.out.print("정수 입력(0 입력 종료) : ");
			num1 = sc.nextInt();
			
			if(num1 < 0) num1 *= -1;
			
			sum += num1;
			if(num1 != 0 ) i++;
		}while(num1 != 0);
		
		System.out.println("합은 : " + sum);
		System.out.println("평균은 : " + sum/i);*/
		
		
	}

}
