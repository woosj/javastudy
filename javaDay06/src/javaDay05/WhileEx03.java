package javaDay05;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사용자로 부터 임의의 두 정수를 입력받아 작은 수부터 큰 수 까지 차례대로 출력하는 프로그램을 작성
		 * 
		 * 첫번째 정수 입력 : 20
		 * 두번째 정수 입력 : 10
		 * 결과 : 10 ~ 20 까지의 합계 : xxxx
		 * 
		 */
		
		int max = 0, a = 0;
		int i = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while( i < 2){
			
			System.out.print( (i+1)+"번째정수 입력 : ");
			a = sc.nextInt();
			sum += a;
			
			if( a > max ){
				max = max^a;
				a = a^max;
				max = max^a;			
			}
			
			i++;
		}
		
		System.out.println(a + " ~ " + max + "까지의 합계 : " + sum );
		
		int num1, num2;
		int min = 0;
		System.out.print( "첫번째정수 입력 : ");
		num1 = sc.nextInt();
		
		System.out.print( "두번째정수 입력 : ");
		num2 = sc.nextInt();
		
		//스왑
		if( num1 > num2 ){
			num1 = num1^num2;
			num2 = num2^num1;
			num1 = num1^num2;
		}
		//최소값 저장
		min = num1;
		sum = 0;
		
		while( num1 <= num2 ){
			sum += num1;
			num1++;
		}
		
		System.out.println(min + " ~ " + num2 + "까지의 합계 : " + sum );
	}

}
