package javaDay03;

import java.util.Scanner;

public class IFEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ܼ� if��
		int a = 30;

		if (a > 100) {
			System.out.println("a�� 100���� ũ��.");
		} else {
			System.out.println("a�� 100���� �۴�");
		}
		
		/*
		 * int a = 51 �϶� ¦�� ���� Ȧ�� ������ �����Ͻÿ�.
		 * 1.���ǹ��� ����Ѵ�.
		 * 2.���ǽ��� �����Ѵ�.(¦������ Ȧ������ �������� Ȯ���ϴ� ��)
		 * 
		 */
		
		int b = 51;
		
		if( (b%2) == 0 ){
			System.out.println("¦��");
		}else{
			System.out.println("Ȧ��");
		}
		
		/*
		 * ����ڷ� ���� ������ ������ �Է¹޾�
		 * �Է¹��� ������ �������, ��������, 0������
		 * �����Ͽ� ����� ����Ͻÿ�.
		 * 
		 * ���� ��
		 * �����Է� : -12
		 * -12 => ����
		 * 
		 * �����Է� : 12
		 * 12 => ���
		 * 
		 * �����Է� : 0
		 * 0 => ��
		 * 
		 * ��, ���ǻ��� �����ڸ� �̿��Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		
		
		System.out.println( num >= 0 ? (num == 0 ? "��":"���"):"����");
		
		
		if( num > 0 ){
			System.out.println("���");
		}else if( num < 0 ){
			System.out.println("����");
		}else{
			System.out.println("��");
		}
		
		/*
		 *  ����ڷ� ���� ������ �⵵�� �Է¹޾� �Է¹��� �⵵�� �������� ��������� �����ϴ� ���α׷��� �����Ͻÿ�.
		 *  ������ ��������
		 *  �⵵�� 4�� ����̸鼭 100�� ����ƴϰų� 400�� ����̸� ���� �׷��� ������ �����
		 */
		
		System.out.print("�⵵�� : ");
		int y = sc.nextInt();
		String s;
		s = ( ( y%4 == 0 ) && ( y%100 != 0 ) || ( y%400 == 0 )) ? "����":"���";
		System.out.println(s);
		if(  ( (y%4 ==0) && (y%100 != 0) ) || (y%400 == 0) ){
			System.out.println("����");			
		}else{
			System.out.println("����ƴ�");		
		}
		
		 
		/*
		 * a~z �Է¹޾Ƽ� �ҹ��ڴ� �빮�ڷ� 
		 * �빮�ڴ� �ҹ��ڷ�
		 */
		
	}

}
