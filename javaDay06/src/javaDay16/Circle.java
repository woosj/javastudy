package javaDay16;

import java.util.Scanner;

/*
 * ���� ���̿� �ѷ� ���ϱ�
 * ������� : ������, ������
 * �޼��� : ���� , �ѷ�, �������Է�, ���
 * ���� : ������ * ������ * ������
 * �ѷ� : ������ * 2 * ������
 */
public class Circle {
	int r;	//������
	final static double PI = 3.14;	//������
	
	//������ �Է�
	void radiusInput(){
		
		System.out.println("�������� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		r = sc.nextInt();
			
	}
	
	//���� ���� ���ϱ�
	double circleArea(){
		double result = r * r * Circle.PI;
		return result;
	}
	
	//���� �ѷ� ���ϱ�
	double circleLength(){
		double result = r * 2 * Circle.PI;
		return result;
	}
	
	//����� ���
	void print(double a, double l){
		System.out.println("������ : " + r);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� : " + l);
	}
}
