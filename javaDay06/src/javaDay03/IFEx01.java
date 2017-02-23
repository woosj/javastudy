package javaDay03;

import java.util.Scanner;

public class IFEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 단순 if문
		int a = 30;

		if (a > 100) {
			System.out.println("a는 100보다 크다.");
		} else {
			System.out.println("a는 100보다 작다");
		}
		
		/*
		 * int a = 51 일때 짝수 인지 홀수 인지를 판정하시오.
		 * 1.조건문을 사용한다.
		 * 2.조건식을 제시한다.(짝수인지 홀수인지 판정인지 확인하는 식)
		 * 
		 */
		
		int b = 51;
		
		if( (b%2) == 0 ){
			System.out.println("짝수");
		}else{
			System.out.println("홀수");
		}
		
		/*
		 * 사용자로 부터 임의의 정수를 입력받아
		 * 입력받은 정수가 양수인지, 음수인지, 0인지를
		 * 판정하여 결과를 출력하시오.
		 * 
		 * 실행 예
		 * 정수입력 : -12
		 * -12 => 음수
		 * 
		 * 정수입력 : 12
		 * 12 => 양수
		 * 
		 * 정수입력 : 0
		 * 0 => 영
		 * 
		 * 단, 조건삼항 연산자를 이용하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		
		System.out.println( num >= 0 ? (num == 0 ? "영":"양수"):"음수");
		
		
		if( num > 0 ){
			System.out.println("양수");
		}else if( num < 0 ){
			System.out.println("음수");
		}else{
			System.out.println("영");
		}
		
		/*
		 *  사용자로 부터 임의의 년도를 입력받아 입력받은 년도가 윤년인지 평년인지를 판정하는 프로그램을 구현하시오.
		 *  윤년의 판정조건
		 *  년도가 4의 배수이면서 100의 배수아니거나 400의 배수이면 윤년 그렇지 않으면 평년임
		 */
		
		System.out.print("년도를 : ");
		int y = sc.nextInt();
		String s;
		s = ( ( y%4 == 0 ) && ( y%100 != 0 ) || ( y%400 == 0 )) ? "윤년":"평년";
		System.out.println(s);
		if(  ( (y%4 ==0) && (y%100 != 0) ) || (y%400 == 0) ){
			System.out.println("윤년");			
		}else{
			System.out.println("윤년아님");		
		}
		
		 
		/*
		 * a~z 입력받아서 소문자는 대문자로 
		 * 대문자는 소문자로
		 */
		
	}

}
