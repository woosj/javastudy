package javaDay17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calulate {
	int num1,num2;
	char ch;	//������ + - * /
	int num3;
	private Scanner sc;
	
	//�� ���� �Է� �� ������ �Է� �޼���
	void Input() {
		try {
			sc = new Scanner(System.in);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("ù ��° ���� : ");
			num1 = sc.nextInt();
			
			System.out.println("�� ��° ���� : ");
			num2 = sc.nextInt();
			
			System.out.println("������(+ - * /) �Է� : ");
			ch = (char)br.read();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
			
	//��� �޼���
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
			
	//��� �޼���
	void disp(int a){
		System.out.println( num1 + " " + ch + " " + num2 + " = " + a);
	}
}
