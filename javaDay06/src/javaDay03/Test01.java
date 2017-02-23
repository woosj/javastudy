package javaDay03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		      사용자로 부터 임의의 정수를 입력받아 사칙연산 및 나머지 연산을 구하는 프로그램을 구현하시오.
		      실행 예)
		      첫번째 정수 : 10
			두번쨰 정수 : 20
			
			실행 결과
			10 + 2 = 12
			10 - 2 = 10
			10 * 2 = 20
			10 / 2 = 5
			10 % 2 = 0
			
			단, 출력은 printf()를 사용하시오.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2;
				
		System.out.print("첫번째 정수 : ");
		String str1 = br.readLine();
		num1 = Integer.parseInt(str1);
		
		System.out.print("두번째 정수 : ");
		String str2 = br.readLine();
		num2 = Integer.parseInt(str2);
		
		//두수의 합
		int result1 = num1 + num2;
		System.out.printf(" %d + %d = %d " ,num1,num2, result1);
		System.out.println();
		
		//두수의 차
		int result2 = num1 - num2;
		System.out.printf(" %d - %d = %d " ,num1,num2, result2);
		System.out.println();
		
		//두수의 곱
		int result3 = num1 * num2;
		System.out.printf(" %d * %d = %d " ,num1,num2, result3);
		System.out.println();
		
		//두수의 나누기
		int result4 = num1 / num2;
		System.out.printf(" %d / %d = %d " ,num1,num2, result4);
		System.out.println();
		
		//두수의 나머지
		int result5 = num1 % num2;
		System.out.printf(" %d %% %d = %d " ,num1,num2, result5);
		System.out.println();
		
	
	}

}
