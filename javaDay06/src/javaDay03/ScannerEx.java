package javaDay03;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �̸��� �������� ������ �Է¹޾� �հ� ���
		Scanner sc = new Scanner(System.in);
		
		//��������
		int kor, eng, mat, sum = 0;
		String name;
		
		//���� �� ó��
		//������� �Է°��� �޾� ó��
		
		System.out.print("name : ");
		name = sc.next();
		
		System.out.print("��������:");
		kor = sc.nextInt();
		
		System.out.print("��������:");
		eng = sc.nextInt();
		
		System.out.print("��������:");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		
		double avg = sum/3;
		System.out.println("����� �̸��� "+name+"�Դϴ�.");
		System.out.println("�հ�� " + sum + "�̰� ����� " + avg +"�Դϴ�.");
		
	}

}
