package javaDay11;

import java.util.*;

public class Circle {
	int r;
	final double PI = 3.141592f;
	
	//������ �Է� �޼���
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�:");
		r = sc.nextInt();
	}
	
	//���� ���� �޼���
	/*void Circle_Square(){
		double result = r*r*PI;
		System.out.println("���� ���̴� " + result);
	}*/
	
	//���� ���� �޼��� ���� ��ȯ�Ѵ�.
	double Circle_Square(){
		double result;
		result = r*r*PI;
		return result;
	}
	
	//���� �ѷ� �޼���
	/*void Circle_length(){
		double result = r*2*PI;
		System.out.println("���� �ѷ��� " + result);
	}*/
	
	double Circle_length(){
		double result;
		result = r*2*PI;
		return result;
	}
	
	void Print(double square, double length){
		System.out.println("���� ���̴� : " + square);
		System.out.println("���� �ѷ��� : " + length);
	}
}
