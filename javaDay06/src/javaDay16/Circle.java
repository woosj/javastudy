package javaDay16;

import java.util.Scanner;

/*
 * 원의 넒이와 둘레 구하기
 * 멤버변수 : 원주율, 반지름
 * 메서드 : 넒이 , 둘레, 반지름입력, 출력
 * 넒이 : 반지름 * 반지름 * 원주율
 * 둘레 : 반지름 * 2 * 원주율
 */
public class Circle {
	int r;	//반지름
	final static double PI = 3.14;	//원주율
	
	//반지름 입력
	void radiusInput(){
		
		System.out.println("반지름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
			
	}
	
	//원의 넒이 구하기
	double circleArea(){
		double result = r * r * Circle.PI;
		return result;
	}
	
	//원의 둘레 구하기
	double circleLength(){
		double result = r * 2 * Circle.PI;
		return result;
	}
	
	//결과값 출력
	void print(double a, double l){
		System.out.println("반지름 : " + r);
		System.out.println("넒이 : " + a);
		System.out.println("둘레 : " + l);
	}
}
