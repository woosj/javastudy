package javaDay02;

import java.io.IOException;

public class InputEx2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ���� �ϳ� �Է¹�����
		int num1;
		int num2;
		
		System.out.print("ù��° ���� : ");
		num1 = System.in.read() - 48;
		System.in.read();
		System.in.read();
		
		System.out.print("�ι�° ���� : ");
		num2 = System.in.read() - '0';
		
		System.out.println("�� ���� ū �� : " + (num1 > num2 ? num1 : num2));
		
	}

}
