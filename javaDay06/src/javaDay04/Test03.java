package javaDay04;

import java.io.IOException;

public class Test03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * 사용자로 부터 임의의 알파벳 한문자를 입력받아 이를 판별하여 입력받은 알파벳이 모음일 경우만 결과를 출력하는 프로그램을 구현하시오.
		 * 단, 대소문자 모두 적용할 수 있도록 구현 알파벳 이외의 문자가 입력되었을 경우 오류처리 할 수 있도록
		 * a e i o u
		 */
		System.out.print("알파벳을 입력하세요 : ");
		char ch = (char)System.in.read();

		if( (ch >= 'a' && ch <= 'z') || ( ch >= 'A' && ch <= 'Z') ){
			if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
				System.out.println(ch);
			}else if( ch == 'A' || ch == 'B' || ch == 'I' || ch == 'O' || ch == 'U' ){
				System.out.println(ch);
			}else{
				System.out.println("모음이 아닙니다.");
			}
			
			
			
		}else{
			
			System.out.println("알파벳 문자가 아닙니다.");
		}
	}

}
