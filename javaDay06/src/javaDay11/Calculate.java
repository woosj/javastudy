package javaDay11;

import java.io.*;
import java.util.Scanner;

public class Calculate {
	
	int num1,num2;
	char ch;	//������ + - * /
	int num3;
	//�� ���� �Է� �� ������ �Է� �޼���
	void Input() throws IOException{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("ù ��° ���� : ");
		num1 = sc.nextInt();
		
		System.out.println("�� ��° ���� : ");
		num2 = sc.nextInt();
		
		System.out.println("������(+ - * /) �Է� : ");
		ch = (char)br.read();
		//ch=sc.next().charAt(0);
		
		/*br.read();
		br.read();
		
		System.in.read();
		System.in.read();
		
		System.out.println("���� : ");
		num3 = Integer.parseInt(br.readLine());*/
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
