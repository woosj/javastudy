package javaDay04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test04 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 사용자로부터 알파벳 한문자를 입력받아 대문자와 소문자를 판별하는 프로그램을 작성
		 * 대문자 -> 소문자
		 * 소문자 -> 대문자
		 * 단, br.readLine()매소드를 사용
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("알파벳을 입력하세요 : ");		
		String str = br.readLine();
		char ch = str.charAt(0);
		int n = 32;
		
		//if( ch >= '97' && ch <= '122' ){
		if( ch >= 'a' && ch <= 'z' ){
			System.out.print("소문자 -> 대문자 : ");
			System.out.println((char)(ch - n));
		}else if( ch >= 'A' && ch <= 'Z' ){
			System.out.print("소문자 -> 대문자 : ");
			System.out.println((char)(ch + n));
		}else{
			
			System.out.println("알파벳 문자가 아닙니다.");
		}
		
		
	}

}
