package javaDay02;

import java.io.*;

public class Homework1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 숫자 하나를 입력받아 그 수가 1이면 "남성", 2이면 "여성"이라는 글자를 출력하는 프로그램을 만들어보자
		 */
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("성별을 입력하세요. (남성:1, 여성:2) : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		System.out.print("당신은 ");
		System.out.print(num == 1 ? "남성":"여성");
		System.out.println("입니다.");
		*/
		
		System.out.print("성별을 입력하세요. (남성:1, 여성:2) : ");
		int num = System.in.read() - 48;
		System.out.print(num == 1 ? "남성":"여성");

	}

}
