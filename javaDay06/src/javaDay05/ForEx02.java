package javaDay05;

import java.io.*;
import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * 양의 실수만을 입력받아 입력받은 정수의 평균을 구하는 프로그램
		 * 
		 */
		//입력버퍼
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		float total,input;	//총합 , 입력값을 저장할 변수
		int cnt = 0;	//입력횟수
		
		//두개의 실수 변수를 초기화
		total = input = 0.0f;
		
		for( ; input >= 0.0 ; ){
			
			total += input;
			System.out.print("양의 실수 입력 : ");
			input = sc.nextFloat();			
			cnt++;
		}
		
		System.out.println("입력횟수 : " + (cnt-1));
		System.out.println("합은 : " + total);
		System.out.println("평균은 : " + total/(cnt-1));
	}

}
