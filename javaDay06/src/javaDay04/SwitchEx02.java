package javaDay04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
	     * 사용자로 부터 임의의 정수와 사칙연산 기호를 입력받아 연산을 구하는 프로그램을 구현하시오.
	     * 실행 예)
	     * 첫번째 정수 : 10
		 * 두번쨰 정수 : 20
		 * 연산자 [ + - * / ] : +	
		 * 실행 결과
		 * 10 + 20 = 30
		 *
		 * 단, switch 문 이용, 모든 수는 정수처리
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1,num2;
				
		System.out.print("첫번째 정수 : ");
		String str1 = br.readLine();
		num1 = Integer.parseInt(str1);
		
		System.out.print("두번째 정수 : ");
		String str2 = br.readLine();
		num2 = Integer.parseInt(str2);
		
		int result = 0;
		
		System.out.print("연산자[ + - * / ] : ");
		char ch = (char)br.read();
		
		switch(ch){
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			default : return;
			/*
			 * return
			 * 1. 값의 반환
			 * 2. 메소드(함수)종료
			 */
		}
		
		System.out.printf(" %d %c %d = %d " , num1, ch, num2, result);
		System.out.println();
		
	}

}
