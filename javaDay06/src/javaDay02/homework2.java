package javaDay02;

import java.io.*;

public class homework2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 문자 하나를 입력받아 그 문자가 산술 연산자인지 아닌지를 판단하는 프로그램을 만들어보자.
		 */
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("산술 연산자를 입력하세요. ('+', '-', '*', '/', '%') : ");
		String str = br.readLine();
		//int num = Integer.parseInt(str);
		
		System.out.print("'" + str + "'는");
		System.out.print(" 산술 연산자");
		System.out.println( ("+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str) || "%".equals(str)) ? "입니다.":"가 아닙니다.");
		*/
		
		System.out.print("산술 연산자를 입력하세요. ('+', '-', '*', '/', '%') : ");
		char str = (char)System.in.read();
		System.out.print("'" + str + "'는");
		System.out.print(" 산술 연산자");
		System.out.println( ('+' == str || '-' == str || '*' == str || '/' == str || '%' == str ) ? "입니다.":"가 아닙니다.");
		
		System.in.read();
		System.in.read();
		
		System.out.print("산술 연산자를 입력하세요. ('+', '-', '*', '/', '%') : ");
		char str2 = (char)System.in.read();
		System.out.print("'" + str2 + "'는");
		System.out.print(" 산술 연산자");
		System.out.println( ('+' == str2 || '-' == str2 || '*' == str2 || '/' == str2 || '%' == str2 ) ? "입니다.":"가 아닙니다.");
		
	}

}
