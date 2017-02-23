package javaDay11;

import java.util.*;

public class Circle {
	int r;
	final double PI = 3.141592f;
	
	//반지름 입력 메서드
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("반지름 입력:");
		r = sc.nextInt();
	}
	
	//원의 넓이 메서드
	/*void Circle_Square(){
		double result = r*r*PI;
		System.out.println("원의 넒이는 " + result);
	}*/
	
	//원의 넒이 메서드 값을 반환한다.
	double Circle_Square(){
		double result;
		result = r*r*PI;
		return result;
	}
	
	//원의 둘레 메서드
	/*void Circle_length(){
		double result = r*2*PI;
		System.out.println("원의 둘레는 " + result);
	}*/
	
	double Circle_length(){
		double result;
		result = r*2*PI;
		return result;
	}
	
	void Print(double square, double length){
		System.out.println("원의 넓이는 : " + square);
		System.out.println("원의 둘레는 : " + length);
	}
}
