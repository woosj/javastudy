package javaDay02;

import java.io.*;

public class Homework1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * ���� �ϳ��� �Է¹޾� �� ���� 1�̸� "����", 2�̸� "����"�̶�� ���ڸ� ����ϴ� ���α׷��� ������
		 */
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("������ �Է��ϼ���. (����:1, ����:2) : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		System.out.print("����� ");
		System.out.print(num == 1 ? "����":"����");
		System.out.println("�Դϴ�.");
		*/
		
		System.out.print("������ �Է��ϼ���. (����:1, ����:2) : ");
		int num = System.in.read() - 48;
		System.out.print(num == 1 ? "����":"����");

	}

}
