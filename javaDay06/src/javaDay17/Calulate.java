package javaDay17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calulate {
	int num1,num2;
	char ch;	//연산자 + - * /
	int num3;
	private Scanner sc;
	
	//두 정수 입력 및 연산자 입력 메서드
	void Input() {
		try {
			sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("첫 번째 정수 : ");
			num1 = sc.nextInt();
			
			System.out.println("두 번째 정수 : ");
			num2 = sc.nextInt();
			
			System.out.println("연산자(+ - * /) 입력 : ");
			ch = (char)br.read();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
			
	//계산 메서드
	int cal(){
		int sum = 0;
		switch(ch){
			case '+' : 
				sum = num1 + num2;
				break;
			case '-' : 
				sum = num1 - num2;
				break; 
			case '*' : 
				sum = num1 * num2;
				break; 
			case '/' : 
				sum = num1 / num2;
				break; 
			
		}
		return sum;
	}
			
	//출려 메서드
	void disp(int a){
		System.out.println( num1 + " " + ch + " " + num2 + " = " + a);
	}
}
