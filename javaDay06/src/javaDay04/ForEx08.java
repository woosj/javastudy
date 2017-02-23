package javaDay04;

import java.util.Scanner;

public class ForEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 사용자로 부터 임의의 정수를 입력받아 입력받은 정수가 소수인지 아닌지 판별하는 프로그램을 작성하시오.
		 * 
		 * - 소수 : 1 또는 자신의 값 이외의 어떤 수로도 나루 수 없는 값
		 * 정수 : 10
		 * 10 -> 소수아님
		 * 
		 * 정수 : 11
		 * 11 -> 소수
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int i = 1;	//증가 변수
		int n = 0;	//나머지가 0일때 증가함수
		boolean flag = true;
		
		while(i <= num){
			
			
			if( num%i == 0){
				//나머지가 0 이면 카운트를 증가시킨다.
				n++;
			}
			
			i++;
		}
		
		
		
		//n이 2개 이상이면 자신과 1외에 숫자로 나누어진 것임
		System.out.println( n>2 ? "소수아님":"소수");
		
		
		i = 2;
		while(i<num){
			
			
			if( num%i == 0){
				flag = false;				
			}
			
			i++;
		}
		
		// 입력값이 1인지의 여부도 함께 확인
		// 결과 출력
		if(flag && num != 1){
			System.out.println( num + " -> 소수");
		}else{
			System.out.println( num + " -> 소수아님");
		}
		
	}

}
